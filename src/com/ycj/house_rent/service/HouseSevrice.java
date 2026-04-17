package com.ycj.house_rent.service;

import com.ycj.house_rent.domain.House;

//房屋信息
public class HouseSevrice {

    //使用数组存储房屋信息
    private House[] houses;

    private int houseNum = 0;




   //创建房屋对象指定大小
    public HouseSevrice(int size) {
        houses = new House[size];
        houses[0] = new House(1, "1", "1", "1", 1, "1");
    }
    //返回创建的房屋对象数组
    public House[] list() {
        return houses;
    }



}
