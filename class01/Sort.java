package com.Yan.Class01;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.Array;
import java.time.chrono.MinguoChronology;

/**
 * @Auther: Yan
 * @Date: 2022/3/26 - 03 - 26 - 10:56
 * @Description: com.Yan.Class01
 * @version: 1.0
 */
public class Sort {
    public static void Selectsort(int[] num){
        if(num==null || num.length<2){
            return;
        }else{
            for (int i = 0; i <num.length; i++) {
                int MinValueIndex=i;
                for (int j = i + 1; j < num.length; j++) {
                    MinValueIndex= num[j]<num[MinValueIndex]? j:MinValueIndex;
                }
                Change(num,i,MinValueIndex);
            }
        }
    }

    public static void Bubblesort(int[] num){
        if(num==null || num.length<2){
            return;
        }
        int N=num.length;
        for (int end = N-1; end>=0 ; end--) {
            for (int first = 0; first <= end - 1; first++) {
                if (num[first] > num[first + 1]) {
                    Change(num, first, first + 1);
                }
            }
        }
    }

    public static void Insertsort(int[] num){
        if(num==null || num.length<2){
            return;
        }
        int N=num.length;
        for(int end =1;end<=N-1;end++){
            for (int pre = end-1; pre>=0 && num[pre]>num[pre+1] ; pre--) {
                Change(num,pre,pre+1);
            }
        }
    }

    public static void Change(int [] arr,int i,int j){
        int Temp=arr[i];
        arr[i]=arr[j];
        arr[j]=Temp;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={7,5,4,8,6,9,3,1,2};
        printArray(arr);
        //Selectsort(arr);
        Bubblesort(arr);
        //Insertsort(arr);
        printArray(arr);
    }
}
