package Classification_Parameter;
import Exception.Exception;


public class View_Parameter {
    public static void viewMenu(){
        System.out.println("분류기준을 확인하실 등급을 선택해주세요");
        System.out.print("==============================\n"+
                "1. General (defalt)\n"+
                "2. VIP\n"+
                "3. VVIP\n"+
                "4. 한번에 다 보기.\n"+
                "5. 분류 기준 메뉴로 돌아가기 \n"+
                "==============================\n"+
                "메뉴를 선택해주세요 :");
        select();
    }

    public static void select(){
        int select = Exception.scannerInt();
        boolean status = true;
        switch (select){
            case 1:
                general.showInfo();
                break;
            case 2:
                vip.showInfo();
                break;
            case 3:
                vvip.showInfo();
                break;
            case 4:
                general.showInfo();
                vip.showInfo();
                vvip.showInfo();
                break;
            case 5:
                System.out.println("분류 기준 메뉴로 돌아갑니다.");
                status = false;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                select();
        }
        if (status){
            viewMenu();
        }else if(!status){
            Parameter_Main.parameterMenu();
        }
    }
}
