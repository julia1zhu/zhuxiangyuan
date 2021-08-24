package com.myapplication.foodOrderSystem.controller;

import com.myapplication.foodOrderSystem.dao.MembershipDao;
import com.myapplication.foodOrderSystem.dao.MenuDao;
import com.myapplication.foodOrderSystem.dao.OrderDao;
import com.myapplication.foodOrderSystem.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 朱香原
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private MembershipDao membershipDao;

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private OrderDao orderDao;

    /**
     *  顾客注册会员
     * 功能描述：bean对象传参
     * 注意：1、注意需要指定http头为 content-type为application/json
     * 		2、使用body传输数据
     * @param
     * @return
     */
    @PostMapping("/memberRegister")
    public Object memberRegister(HttpServletRequest request){
        String memberName = request.getParameter("memberName");
        Double account = Double.parseDouble(request.getParameter("account"));
        Double discount;
        if(account > 0 && account <500){
            discount = 0.9;
        }else if(account <= 1000 && account >= 500){
            discount = 0.8;
        }else{
            discount = 0.7;
        }
        membershipDao.insert(memberName,discount,account);
        return JsonData.buildSuccess("注册成功");
    }

    /**
     * 顾客查看整个菜单
     * @return
     */
    @GetMapping("/findMenu")
    public Object findMenu(){
//        List<Menu> all = menuDao.findMenu();
//        return JsonData.buildSuccess(all);
        return JsonData.buildSuccess(menuDao.findMenu());
    }

    //会员顾客付款
    //拿到会员id,然后对会员账号里面的余额进行扣款
    @PostMapping("/pay")
    public Object pay(HttpServletRequest request) {
        Integer memberId = Integer.parseInt(request.getParameter("memberId"));
        //先看看需要付的钱
        Double payment = orderDao.findPaymentByMemberId(memberId);
        //看看账号里面有的余额
        Double account = membershipDao.accountFindById(memberId);
        if(payment <= account){
            membershipDao.update((account - payment),memberId);
            return JsonData.buildSuccess("扣款成功");
        }else{
            return JsonData.buildSuccess("扣款失败，请进行充值");
        }
    }

    //会员顾客充值,如果里面充的签大于多少仍然可以更新折扣
    @PostMapping("/topUp")
    public Object topUp(HttpServletRequest request){
        Integer memberId = Integer.parseInt(request.getParameter("memberId"));
        Double money = Double.parseDouble(request.getParameter("money"));
        Double originAccount = membershipDao.accountFindById(memberId);
        Double account = money + originAccount;
        membershipDao.update(account,memberId);
        return JsonData.buildSuccess("充值成功");
    }

}
