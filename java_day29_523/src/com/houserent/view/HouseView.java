package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;
import sun.text.normalizer.Utility;

/**
 * 1． 显示界面
 * 2． 接收用户的输入
 * 3， 调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;  //控制显示菜单
    private  char key = ' '; // 接收用户选择
    private HouseService houseService = new HouseService(10); // 设置数组的大小为10


    // 完成退出确认
    public void exit(){
        // 使用Utility提供的方法，完成确认
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    // 编写listHouse()显示房屋列表
    public void listHouse(){
        System.out.println("====================房屋列表=========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for(int i = 0;i < houses.length;i++){
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=======================房屋显示完毕==========================");
    }

    // 编写addHouse()接受输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("=======================添加房屋==========================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);

        House newHouse = new House(0,name,phone,address,rent,state);
        if(houseService.add(newHouse)){
            System.out.println("添加房屋成功");
        }else{
            System.out.println("添加失败");
        }

        // 创建一个新的House对象，注意id是系统分配的，用户不能输入
    }

    //编写delHouse，接收输入的id，调用Service的del方法
    public void delHouse(){
        System.out.println("======================删除房屋信息======================");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("============放弃删除房屋信息==================");
            return;
        }
        System.out.println("请确认是否删除（y/n），请小心选择");
        char choice = Utility.readConfirmSelection(); //注意，该方法本来就有循环判断的逻辑。必须输入y/n，否则出不来
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("======================删除房屋信息成功========================");
            }else{
                System.out.println("================房屋编号不存在，删除失败========================");
            }

        }else{
            System.out.println("=======================放弃删除房屋信息=================================");
        }
    }

    // 编写一个search方法，接收输入的id，调用Service的search方法
    public void searchHouse(){
        System.out.println("========================查找房屋信息==========================");
        System.out.println("请输入你要查找的id");
        int searchId = Utility.readInt();
        House findHouse = houseService.search(searchId);
        if(findHouse != null){
            System.out.println(findHouse);
        }else{
            System.out.println("查找的房屋信息不存在");
        }
    }

    // 根据id修改房屋信息
    public void update(){
        System.out.println("请选择要修改房屋的信息）");
        System.out.println("请选择修改房屋编号（-1）表示退出");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("你放弃了修改操作");
            return;
        }

        // 根据输入的updateId查找对象
        // 返回的是引用类型，就是数组的元素
        // 因此后面对house.setXxx()，就会修改HouseService中houses数组的元素
        House house = houseService.search(updateId);
        if(house == null){
            System.out.println("要修改的房屋信息编号不存在，无法修改");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8,house.getName()); // 这里如果用户直接回车，表示不修改该信息
        if(!name.equals(house.getName())){
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12,house.getPhone());
        if(!phone.equals(house.getPhone())){
            house.setPhone(phone);
        }
        System.out.println("地址(" + house.getAddress() + "):");
            String address = Utility.readString(16,house.getAddress());
        if(!address.equals(house.getAddress())){
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readString(12,house.getRent());
        if(!(rent == house.getRent())){
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(3,house.getState());
        if(!state.equals(house.getState())){
            house.setState(state);
        }

        System.out.println("===============修改完成==================");
    }

    // 显示主菜单
    public void mainMenu(){
        do{
            System.out.println("==================房屋出租系统菜单======================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择1-6");
            key= Utility.readChar();
            switch(key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                   update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
