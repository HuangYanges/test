package com.test.hy.test.test1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestRodrom {
    public static void main(String[] args) {
        //testArrayList();
//        testArrayListRandom();
    }

    /*
     * 猜数游戏，用于练习随机数random类
     * */
    static void testRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        while (true) {
            int temp = input.nextInt();
            if (randomNumber > temp) {
                System.out.println("猜小了！！");
            } else if (randomNumber < temp) {
                System.out.println("猜大了！！");
            } else {
                System.out.println("猜对了！！！");
                break;
            }
        }
    }
    static void testArrayList(int i) {
        ArrayList<String> list = new ArrayList<>();
        //添加add
        list.add("ssf");
        System.out.println(list);
        list.add("qwe");
        list.add("ewq");
        list.add("wqe");
        System.out.println(list);
        //获取固定下标的值
        System.out.println(list.get(3));
        //删除
        list.remove(3);
        System.out.println(list);
        //获取长度
        System.out.println(list.size());


    }

    static void testArrayListRandom() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int temp = r.nextInt(33) + 1;
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
