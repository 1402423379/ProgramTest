package com.Yan.Class01;

/**
 * @Auther: Yan
 * @Date: 2022/3/26 - 03 - 26 - 10:56
 * @Description: com.Yan.Class01
 * @version: 1.0
 */
public class SortTest {
    public static void Selectsort(int[] num){
        if(num==null || num.length<2){
            return;
        }
        int N=num.length;
        for(int i=0;i<N-1;i++){
            int MinValueIndex=i;
            for(int j=i+1;j<N;j++){
                MinValueIndex = num[j]<num[MinValueIndex]? j:MinValueIndex;
            }
            Change(num,i,MinValueIndex);
        }
    }

    public static void Bubblesort(int[] num){
        if(num==null || num.length<2){
            return;
        }
        int N=num.length;
        for(int end=N-1;end>=0;end--){
            for(int first=0;first<end;first++){
                if(num[first]>num[first+1]){
                    Change(num,first,first+1);
                }
            }

        }
    }

    public static void Insertsort(int[] num){
        if(num==null || num.length<2){
            return;
        }
        int N=num.length;
        for (int i=1;i<=N-1;i++){
            for (int pre = i-1; pre>=0 && num[pre]>num[pre+1]; pre--){
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
        //Bubblesort(arr);
        Insertsort(arr);
        printArray(arr);
    }
}
