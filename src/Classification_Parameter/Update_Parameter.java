package Classification_Parameter;

import java.util.Scanner;

public class Update_Parameter {
    static Scanner sc = new Scanner(System.in);
    public static void set_menu(){
        System.out.println("분류 기준을 수정할 등급을 선택 해주세요.");
        System.out.print("==============================\n"+
                "1. VIP\n"+
                "2. VVIP\n"+
                "3. 분류 기준 메뉴로 돌아가기.\n"+
                "일반 고객의 기준은 수정하실수 없습니다.(defalt)\n"+
                "==============================\n"+
                "등급을 선택해주세요 :");
        menu_select();
    }

    public static void menu_select(){
        int menu = sc.nextInt();
        boolean status = false;
        switch (menu){
            case 1:
                System.out.println("VIP등급의 기준을 수정합니다.");
                vip.set2();
                break;
            case 2:
                System.out.println("VVIP등급의 기준을 수정합니다.");
                vvip.set2();
                break;
            case 3:
                System.out.println("분류 기준 수정을 종료합니다.\n분류 기준 메뉴로 돌아갑니다.");
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                menu_select();
                break;
        }
        //메뉴 반복
        if (!status){
            set_menu();
        } else if (status){
            Parameter_Main.parameterMenu();
        }
    }
}
