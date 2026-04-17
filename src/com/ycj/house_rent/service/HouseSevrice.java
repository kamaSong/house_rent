package com.ycj.house_rent.service;

import com.ycj.house_rent.domain.House;

//房屋信息
public class HouseSevrice {

    //使用数组存储房屋信息
    private House[] houses;

    private int houseNum = 0;
    //id计数器
    private static int idCounter = 0;




   //创建房屋对象指定大小
    public HouseSevrice(int size) {
        houses = new House[size];
    }
    //返回创建的房屋对象数组
    public House[] list() {
        return houses;
    }

    //
    public boolean add(House newHouse) {
        //判断数组是否已满
        if (houseNum == houses.length) {
            System.out.println("数组已满，无法添加");
            return false;
        }
        //添加房屋信息,并返回true   先赋值在 houseNum++;
        houses[houseNum++] = newHouse;
        idCounter++;//id计数器加一
        newHouse.setId(idCounter);//更新

        return true;
    }



}
