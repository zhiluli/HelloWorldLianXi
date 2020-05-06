package test;

import org.junit.Test;

public class Test_1 {
    //冒泡排序
    //这里不对明天有时间再调 2020年5月6日
    @Test
    public void test1(){
        int score[] = {6, 9, 5, 8};
        for(int i =0;i < score.length - 1;i++) {
            // j开始等于0，
            for(int j = 0;j <  score.length - 1-i;j++){
                if(score[j] < score[j+1]) {
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                    System.out.print(temp);
                }
            }
        }
    }
}
