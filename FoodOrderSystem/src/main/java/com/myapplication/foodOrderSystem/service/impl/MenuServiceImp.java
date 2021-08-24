package com.myapplication.foodOrderSystem.service.impl;

import com.myapplication.foodOrderSystem.dao.MenuDao;
import com.myapplication.foodOrderSystem.domain.FoodInfo;
import com.myapplication.foodOrderSystem.domain.Menu;
import com.myapplication.foodOrderSystem.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 朱香原
 */
@Service
//之前这里写成了抽象类，错误
public class MenuServiceImp implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public int add(Menu menu){
        menuDao.insert(menu);
        int id = menu.getId();
        return id;
    }


}
