package com.Yan.Class01;

/**
 * @Auther: Yan
 * @Date: 2022/3/26 - 03 - 26 - 9:29
 * @Description: com.Yan.Class01
 * @version: 1.0
 */
public class Test01 {
    public static void print(int num){
        for (int i=31;i>=0;i--){
            System.out.print((num&1<<i)==0? 0:1);
        }
        System.out.println( );
    }
    public void print1(int num){
        for (int i=31;i>=0;i--){
            System.out.print((num&1<<i)==0? 0:1);
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int num=5;
        int a=~num+1;
        print(num);
        System.out.println(a);
        print(a);
        print(~a);
        Test01 test01 = new Test01();
        test01.print(num);
        test01.print1(num);
    }
}
