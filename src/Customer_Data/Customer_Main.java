package Customer_Data;

import Main.Menu;
import java.util.Scanner;

public class Customer_Main {
    static Scanner sc = new Scanner(System.in);
    public static void customerMenu() {
        System.out.print("==============================\n" +
                " 1. 고객 정보 추가\n" +
                " 2. 고객 정보 보기\n" +
                " 3. 고객 정보 수정\n" +
                " 4. 고객 정보 삭제\n" +
                " 5. 메인메뉴\n"+
                "==============================\n" +
                "메뉴를 선택해주세요:");
        customerSelect();
    }

    public static void  customerSelect() {
        String menuNum = sc.next();
        boolean status = false;
            switch (menuNum) {
                case "1":
                    System.out.println("고객 정보를 추가합니다.");
                    Add_Customer.add_Start();
                    break;
                case "2":
                    System.out.println("고객 정보를 출력합니다.");
                    View_Customer.view();
                    break;
                case "3":
                    System.out.println("고객 정보를 변경합니다.");
                    Update_Customer.setTargetNum();
                    break;
                case "4":
                    System.out.println("고객 정보를 삭제합니다.");
                    Delete_Customer.setTargetNum();
                    break;
                case "5":
                    System.out.println("메인메뉴로 돌아갑니다.");
                    status = true;
                    break;
                default:
                    System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                    customerSelect();
                    break;
                }
            //메인메뉴로 돌아가기
            if (status) {
                Menu.mainMenu();
            } else if (!status) {
                customerMenu();
            }

    }
}
