package Summary;

import Customer_Data.Add_Customer;
import Main.Menu;
import Exception.Exception;



public  class Summary_main {
    public static void summaryMenu() {
        if (Add_Customer.getNum()==0){
            System.out.println("고객 정보가 충분히 존재하지 않습니다. 메인메뉴로 돌아갑니다.");
            Menu.mainMenu();
        }else {
        System.out.print("==============================\n" +
                " 1. 등록 순으로 보기\n" +
                " 2. 이름 순으로 보기\n" +
                " 3. 총 사용시간 순으로 보기\n" +
                " 4. 총 사용금액 순으로 보기\n" +
                " 5. 메인메뉴\n"+
                "==============================\n" +
                "메뉴를 선택해주세요:");
        summarySelect();}
    }

    public static void  summarySelect(){
        int menuNum = Exception.scannerInt();
        boolean status = false;
        switch (menuNum){
            case 1:
                System.out.println("고객 정보를 출력합니다.");
                Summary_.show();
                break;
            case 2:
                System.out.println("고객 정보를 이름순으로 출력합니다.");
                SummaryByName.showByName_Menu();
                break;
            case 3:
                System.out.println("고객 정보를 사용 사용시간순으로 출력합니다.");
                SummaryBySpentTime.showByTime_Menu();
                break;
            case 4:
                System.out.println("고객 정보를 총 사용금액순으로 출력합니다.");
                SummaryByPayment.showByPayment_Menu();
                break;
            case 5:
                System.out.println("메인메뉴로 돌아갑니다.");
                status = true;
                Menu.mainMenu();
                break;
            default:
                System.out.print("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                summarySelect();
        }
        if (status){
            Menu.mainMenu();
        } else if (!status) {
            summaryMenu();
        }
    }
}
