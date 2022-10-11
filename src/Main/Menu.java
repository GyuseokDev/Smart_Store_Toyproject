package Main;

import Classification_Parameter.Parameter_Main;
import Customer_Data.Customer_Main;
import Summary.*;
import Exception.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public  class Menu {
    Scanner sc = new Scanner(System.in);

    public  static void mainMenu(){
        System.out.print("==============================\n"+
                "1. 분류 기준 메뉴\n"+
                "2. 고객 정보 매뉴\n"+
                "3. 요약 메뉴\n"+
                "4. 프로그램 종료\n"+
                "==============================\n"+
                "메뉴를 선택해주세요 :");
        selectMainMenu();
    }
    public  static void selectMainMenu(){
        Scanner sc = new Scanner(System.in);
            int menu_Num = Exception.scannerInt();
            switch (menu_Num) {
                case 1:
                    System.out.println("분류 매개변수 메뉴로 이동합니다.");
                    Parameter_Main.parameterMenu();
                    break;
                case 2:
                    System.out.println("고객 정보 메뉴로 이동합니다.");
                    Customer_Main.customerMenu();
                    break;
                case 3:
                    System.out.println("요약 메뉴로 이동합니다.");
                    Summary_.makeArr();
                    Summary_main.summaryMenu();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                    selectMainMenu();
        }
    }
}
