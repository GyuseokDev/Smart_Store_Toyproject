package Classification_Parameter;
import Main.*;

import java.util.Scanner;

public class Parameter_Main {
     static Scanner sc = new Scanner(System.in);
    public static void parameterMenu() {
        System.out.print("==============================\n" +
                " 1. 분류기준 설정\n" +
                " 2. 분류기준 보기\n" +
                " 3. 분류기준 수정\n" +
                " 4. 메인메뉴\n" +
                "==============================\n" +
                "메뉴를 선택해주세요:");
        parameterSelect();
    }

    public static void parameterSelect(){
        int menuNum = sc.nextInt();
        boolean status=false;
        switch (menuNum){
            case 1:
                System.out.println("분류기준를 설정 합니다.");
                Set_Parameter.set_menu();
                break;
            case 2:
                System.out.println("분류기준를 출력 합니다.");
                View_Parameter.viewMenu();
                break;
            case 3:
                System.out.println("분류기준를 수정 합니다.");
                Update_Parameter.set_menu();
                break;
            case 4:
                System.out.println("메인메뉴로 돌아갑니다.");
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                parameterSelect();
                break;
        }
        //메인으로 돌아갈지 메뉴 반복할지
        if(status){
            Menu.mainMenu();
        }else if(!status){
            parameterMenu();
        }

    }
}
