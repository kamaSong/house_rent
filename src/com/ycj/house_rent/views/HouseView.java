package com.ycj.house_rent.views;

import com.ycj.house_rent.Utils.Utility;
import com.ycj.house_rent.domain.House;
import com.ycj.house_rent.service.HouseSevrice;

public class HouseView {
    //1.完成主菜单的显示
    //2.显示list菜单
    private boolean loop = true;
    private char key = ' ';
    //引入House类，创建house对象
    private House[] house =null;

    //引入houseService，调用其方法
    private HouseSevrice houseService = new HouseSevrice(10);
    //显示主菜单
    public void mainMenu(){
        //循环显示
        while (loop){
        System.out.println("==========房屋出租系统==========");
        System.out.println("1. 新增房源");
        System.out.println("2. 查找房源");
        System.out.println("3. 删除房源");
        System.out.println("4. 修改房源");
        System.out.println("5. 房源列表");
        System.out.println("6. 退出系统");
        System.out.print("请输入您的选择：");
        key = Utility.readChar();
        switch (key)
        {
            case '1':
                addMenu();
                break;
            case '2':
                System.out.println("查找房源");
                break;
            case '3':
                System.out.println("删除房源");
                break;
            case '4':
                System.out.println("修改房源");
                break;
            case '5':
                listMenu();
                break;
            case '6':
                System.out.println("退出系统");
                //将loop设置为false，退出循环
                loop = false;
                break;
            default:
                System.out.println("输入错误，请重新输入：");

        }

        }

    }
    //显示房源列表，通过调用houseService的list方法显示房源 ，注判断是否为空
    public void listMenu(){
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();//获取房屋数组
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }
        }
    }
    //显示新增房源菜单，输入相关信息后调用houseService的add方法加入房屋信息
    public void addMenu(){
        System.out.println("==========新增房源==========");
        System.out.print("请输入房主姓名：");
        String name = Utility.readString(8);
        System.out.print("请输入房主电话：");
        String phone = Utility.readString(12);
        System.out.print("请输入房屋地址：");
        String address = Utility.readString(16);
        System.out.print("请输入房屋月租：");
        int rent = Utility.readInt(10);
        System.out.print("请输入房屋状态：");
        String state = Utility.readString(3);
        //创建house对象,实现id自增 count++
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("新增房源成功！");
        } else {
            System.out.println("新增房源失败！");
        }


        }




    }



