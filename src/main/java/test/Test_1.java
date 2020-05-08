package test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test_1 {
    //冒泡排序
    //这里不对明天有时间再调 2020年5月6日
    @Test
    public static void main(String[] args) {
        int arr[]={5,1,2,-2,8,4,7};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //这个方法的三个参数：arr要排序的那个数组，  你要对arr[low]-arr[high]段进行排序
    public static void sort(int[] arr,int low,int high){
        if (low>=high){
            return;
        }
        // i  j
        int i=low;
        int j=high;
        //key
        int key=arr[i];
       while (i<j){
           while (arr[j]>=key&&i<j){
               j--;
           }
         if (i<j){
             int t;
             t=arr[j];
             arr[j]=arr[i];
             arr[i]=t;
         }

           while (arr[i]<=key&&i<j){
               i++;
           }
          if (i<j){
               int t;
              t=arr[i];
              arr[i]=arr[j];
              arr[j]=t;
          }
       }
       //对基准左侧的集合重复操作
        sort(arr,low,i-1);
       //对基准右侧的集合重复操作
        sort(arr,i+1,high);
    }

}
