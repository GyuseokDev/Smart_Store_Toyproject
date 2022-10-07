package Classification_Parameter;
import Main.*;

import java.util.Scanner;

public class Parameter_Main {
     static Scanner sc = new Scanner(System.in);
    public static void parameterMenu() {
        System.out.print("==============================\n" +
                " 1. 매개변수 설정\n" +
                " 2. 매개변수 보기\n" +
                " 3. 매개변수 업데이트\n" +
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
                //Set_Parameter()
                break;
            case 2://Update_Parameter()
                break;
            case 3://View_Parameter()
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
