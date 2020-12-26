package com.test.hy.test.test1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestRodrom {
    public static void main(String[] args) {
        //testArrayList();
//        testArrayListRandom();
//        testBigBysmall();
//        practiseString();
        stringCountChar();
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
    /**
     * @TODO:练习如何向ArrayList添加数据
     * @Author: HuangYang
     * @Date: 2020/12/26 2:01
     **/
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
    static void testBigBysmall(){
        Random r=new Random();
        ArrayList<Integer> bList=new ArrayList<>();
        ArrayList<Integer> sList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            bList.add(r.nextInt());
        }
        for (int i = 0; i < bList.size(); i++) {
            if (bList.get(i)%2==0){
                sList.add(bList.get(i));
            }
        }
        System.out.println(bList);
        System.out.println(sList);
    }
    /**
     * @TODO:把一个数组按指定格式拼接成一个字符串
     * @Author: HuangYang
     * @Date: 2020/12/26 19:08
     **/
    static void practiseString(){
        char[] chars={'1','2','3'};
        String str="[";
        for (int i = 0; i < chars.length; i++) {
            if (i==chars.length-1){
                str+="word"+chars[i]+"]";
                break;
            }else {
                str+="word"+chars[i]+"#";

            }
        }
        System.out.println(str);
    }
    /**
     * @TODO: 统计一个输入的字符串的各类字符个数;ASCII码 数字0~9： 48~57;A~Z:65~90; a~z:97~122
     * @Author: HuangYang
     * @Date: 2020/12/26 19:35
     **/
    static void stringCountChar(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        byte[] bytes=str.getBytes();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
            if(bytes[i]>=48&&bytes[i]<=57){
                countNumber++;
            }else if (bytes[i]>=65&&bytes[i]<=90){
                countUpper++;
            }else if (bytes[i]>=97&&bytes[i]<=122){
                countLower++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母： "+countUpper);
        System.out.println("小写字母： "+countLower);
        System.out.println("数字： "+countNumber);
        System.out.println("其他： "+countOther);
    }
}
