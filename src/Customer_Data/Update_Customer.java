package Customer_Data;

import java.util.Scanner;

public class Update_Customer {
static Scanner sc = new Scanner(System.in);
static int targetNum;
    public static void setTargetNum(){
        View_Customer.viewToEdit();
        int num = Add_Customer.num;

        if(num>=1){
            System.out.print("몇번째 고객의 정보를 수정 하시겠습니까?\n(1~"+num+")");
            targetNum = sc.nextInt()-1;
            if(targetNum>=1||targetNum<=num) {
                System.out.println("대상 고객의 정보를 출력합니다.");
                update_menu();
            }else {
                System.out.println("옳바르지 않은 숫자입니다. 다시 입력해주세요.");
            }
        }
        else {
            System.out.println("고객의 정보가 충분하지 않습니다.\n고객 메뉴로 돌아갑니다.");

        }
    }

    public static void update_menu() {
        System.out.print(Add_Customer.customerArray[targetNum].showCustomerInfo() + "\n" +
                "==============================\n" +
                " 1. 고객 이름 수정하기\n" +
                " 2. 고객 ID 수정하기\n" +
                " 3. 고객 사용시간 수정하기\n" +
                " 4. 고객 사용금액 수정하기\n" +
                " 5. 고객 정보 수정 종료하기.\n" +
                "==============================\n"+
                "메뉴를 선택해주세요.");
        update_select();
    }
    public static void update_select(){
        boolean status = true;
        int menuNum = sc.nextInt();
        switch (menuNum){
            case 1:
                change_name();
                break;
            case 2:
                change_ID();
                break;
            case 3:
                change_time();
                break;
            case 4:
                change_money();
                break;
            case 5:
                System.out.println("고객 정보 수정을 종료합니다.");
                status = false;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                update_select();
                break;
        }
        if (status){
            update_menu();
        } else if (!status) {
            System.out.println("고객 정보 메뉴로 돌아갑니다.");
        }

    }

    public static void change_name(){
        System.out.print("현재 이름은 "+Add_Customer.customerArray[targetNum].getCustomerName()+"입니다.\n"+
                "변경하실 이름을 입력해주세요.");
        String name = sc.next();
        Add_Customer.customerArray[targetNum].setCustomerName(name);
        System.out.println("이름이 변경되었습니다.");
    }

    public static void change_ID(){
        System.out.print("현재 ID는 "+Add_Customer.customerArray[targetNum].getCustomerID()+"입니다.\n"+
                "변경하실 ID를 입력해주세요.");
        String ID = sc.next();
        Add_Customer.customerArray[targetNum].setCustomerID(ID);
        System.out.println("ID가 변경되었습니다.");
    }
    public static void change_time(){
        System.out.print("현재 사용시간은 "+Add_Customer.customerArray[targetNum].getCustomerSpentTime()+"시간 입니다.\n"+
                "변경하실 시간을 입력해주세요.");
        int time = sc.nextInt();
        Add_Customer.customerArray[targetNum].setCustomerSpentTime(time);
        System.out.println("사용시간이 변경되었습니다.");
    }

    public static void change_money(){
        System.out.print("현재 사용금액은 "+Add_Customer.customerArray[targetNum].getCustomerPayment()+"원 입니다.\n"+
                "변경하실 금액을 입력해주세요.");
        int money = sc.nextInt();
        Add_Customer.customerArray[targetNum].setCustomerPayment(money);
        System.out.println("사용금액이 변경되었습니다.");
    }

}
