package com.ycj.house_rent.views;

import com.ycj.house_rent.Utils.Utility;

public class HouseView {
    //1.完成主菜单的显示
    private boolean loop = true;
    private char key = ' ';
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
                System.out.println("新增房源");
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
                System.out.println("房源列表");
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


}
