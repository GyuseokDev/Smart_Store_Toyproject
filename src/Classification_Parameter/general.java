package Classification_Parameter;

import java.util.Scanner;

public class general {
    static Scanner sc = new Scanner(System.in);
    private static int minTime =0;
    private static int minMoney=0;
    final private static String grade = "General";

    public static int getMinTime(){
        return minTime;
    }
    public static int getMinMoney(){
        return minMoney;
    }

    public static void showInfo(){
        System.out.println(grade+"등급의 최소 사용시간은 "+minTime+"시간 이며 최소 사용금액은 "+minMoney+"원 입니다.");
    }
}
