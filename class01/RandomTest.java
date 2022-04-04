package com.Yan.Class01;

import java.sql.Array;

/**
 * @Auther: Yan
 * @Date: 2022/3/27 - 03 - 27 - 17:39
 * @Description: com.Yan.Class01
 * @version: 1.0
 */
public class RandomTest {
    /*
    *已知一个函数f1()实现[17,32]等概率,只是用f1()函数求[78-130]等概率产生
    *
    * */
    public static int f1(){
        return (int)(Math.random()*16)+17;
    }
    public static int f2(){
        return f1()<25? 0:1;
    }
    public static int f3(){
        int ans=0;
        for(int i=8;i>=0;i--){
            ans=ans+(f2()<<i);
        }
        return ans;
    }
    public static int f4(){
       int ans=0;
       do{
           ans=f3();
       }while(ans>130||ans<78);
       return ans;
    }
    public static void main(String[] args) {
        int test=10000000;
        int[] counts=new int[53];
        for (int i = 0; i <test ; i++) {
            int num=f4();
            counts[num-78]++;
        }

        for(int i=0;i<53;i++){
            System.out.println(i+78+"这个数出现了"+ counts[i]+"次");
        }
    }
}
