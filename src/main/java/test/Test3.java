package test;

import org.junit.Test;

import java.util.Scanner;

public class Test3 {
    //网址是这个
    //https://blog.csdn.net/shenshen_xu/article/details/82657778?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
@Test
    public void fangfa(int n) {
        //一个整数，大于 0，不用循环和本地变量，按照 n，2n，4n，8n 的顺序递增，
        //当值大于 5000 时，把值按照指定顺序输出来。
    //这里的递减输出有问题
      int x=n;
    System.out.println(x+",的值递增输出是");
      for (;x<=5000;x=x*2){//递增输出小于5000的值

          System.out.println(x+",");//输出唯一一个大于5000的值

          for (;x>=5000;x=x/2){

              System.out.println(x+",的值递减输出是1");//递减输出
          }
    }
    }

    //使用递归
    public void fangfa2(int n){


        System.out.println(n+"的值是");//先输出n的值。即输出递归部分
        if (n<=5000) fangfa2(n*2);//当n<=5000时，继续调用递归函数count自己，但是实参加倍
        System.out.println(n+",");//再次输出n的值，即输出递减部分

    }

    public static void main(String[] args) {
        Test3 test3=new Test3();
        System.out.println("请输入一个大于0的整数");
        int n;
        Scanner x=new Scanner(System.in);//输入一个数n
        n=x.nextInt();
        if (n>0){
//            test3.fangfa(n);
            test3.fangfa2(n);

        }else {
            System.out.println("输入的整数有误，请重新输入");
        }

    }

}