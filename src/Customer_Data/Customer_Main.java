package Customer_Data;

import Main.Menu;

import java.util.Scanner;

public class Customer_Main {
    static Scanner sc = new Scanner(System.in);
    public static void customerMenu() {
        System.out.print("==============================\n" +
                " 1. 고객 정보 추가하기\n" +
                " 2. 고객 정보 보기\n" +
                " 3. 고객 정보 업데이트\n" +
                " 4. 고객 정보 삭제\n" +
                " 5. 메인메뉴\n"+
                "==============================\n" +
                "메뉴를 선택해주세요:");
        customerSelect();
    }

    public static void  customerSelect(){
        int menuNum = sc.nextInt();
        boolean status = false;
        switch (menuNum){
            case 1://Add_Customer()
                break;
            case 2://View_Customer()
                break;
            case 3://Update_Customer()
                break;
            case 4://Delete_Customer()
                break;
            case 5:
                System.out.println("메인메뉴로 돌아갑니다.");
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                customerSelect();
        }
        if(status){
         Menu.mainMenu();
        }else if(!status){
            customerMenu();
        }
    }
}
