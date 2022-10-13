package Summary;

import Customer_Data.Customer;

import Exception.Exception;

public class SummaryBySpentTime {
    static Customer[] toCompareGeneralByTime_Ascending = new Customer[0];
    static Customer[] toCompareVIPByTime_Ascending = new Customer[0];
    static Customer[] toCompareVVIPByTime_Ascending = new Customer[0];


    public static void showByTime_Menu(){
        makeArr();
        System.out.print("==============================\n" +
                " 1. 사용 시간 높은순으로 보기.\n" +
                " 2. 사용 시간 낮은순으로 보기\n" +
                " 3. 요약 메뉴로 돌아가기.\n"+
                "==============================\n" +
                "메뉴를 선택해주세요:");
        Select();
    }

    public static void Select(){
        int  select = Exception.scannerInt();
        boolean status = false;
        switch (select){
            case 1:
                showByTime_Ascending();
                break;
            case 2:
                showByTime_Descending();
                break;
            case 3:
                System.out.println("요약 메뉴로 돌아갑니다.");
                status= true;
                break;
            default:
                System.out.print("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                Select();
                break;
        }
        if (status){
            Summary_main.summaryMenu();
        }else if (!status){
            showByTime_Menu();
        }
    }

    public static void showByTime_Ascending(){
        System.out.println("사용 시간이 높은 순으로 출력합니다.");
        System.out.println("==============================");
        System.out.println("General List");
        for (int i = 0; i < toCompareGeneralByTime_Ascending.length; i++) {
            System.out.println(toCompareGeneralByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VIP List");
        for (int i = 0; i < toCompareVIPByTime_Ascending.length; i++) {
            System.out.println(toCompareVIPByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VVIP List");
        for (int i = 0; i < toCompareVVIPByTime_Ascending.length; i++) {
            System.out.println(toCompareVVIPByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("출력이 완료되었습니다\n");
    }

    public static void showByTime_Descending(){
        System.out.println("사용 시간이 낮은 순으로 출력합니다.");
        System.out.println("==============================");
        System.out.println("General List");
        for (int i = (toCompareGeneralByTime_Ascending.length-1); i>=0; i--){
            System.out.println(toCompareGeneralByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VIP List");
        for (int i = (toCompareVIPByTime_Ascending.length-1); i>=0; i--){
            System.out.println(toCompareVIPByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VVIP List");
        for (int i = (toCompareVVIPByTime_Ascending.length-1); i>=0; i--){
            System.out.println(toCompareVVIPByTime_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("출력이 완료되었습니다\n");
    }

    public static void makeArr(){
        makeGeneralArrByTime_Ascending();
        makeVIPArrByTime_Ascending();
        makeVVIPArrByTime_Ascending();
    }

    //General 그룹 사용시간별 크기로 정렬
    public static void makeGeneralArrByTime_Ascending() {
        //비교하기위한 새로운 배열 생성(빈배열)
        Customer[] makeGeneral = new Customer[Summary_.getGeneralCNT()];
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            makeGeneral[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerSpentTime() >= makeGeneral[j].getCustomerSpentTime()) {
                    for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                        makeGeneral[k + 1] = makeGeneral[k];
                    }
                    makeGeneral[j] = Summary_.generalArr[i];
                    break;
                }
            }
        }
        toCompareGeneralByTime_Ascending = makeGeneral;
    }

    public static void makeVIPArrByTime_Ascending(){
        Customer[] makevip = new Customer[Summary_.getVipCNT()];
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            makevip[i] = new Customer(null, null, 0, 0);
        }
        //비교
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerSpentTime() >= makevip[j].getCustomerSpentTime()) {
                    for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                        makevip[k + 1] = makevip[k];
                    }
                    makevip[j] = Summary_.vipArr[i];
                    break;
                }
            }
        }
        toCompareVIPByTime_Ascending =makevip;
    }

    public static void makeVVIPArrByTime_Ascending(){
        Customer[] makevip = new Customer[Summary_.getVvipCNT()];
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            makevip[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            for (int j = 0; j < Summary_.getVvipCNT(); j++) {
                if (Summary_.vvipArr[i].getCustomerSpentTime() >= makevip[j].getCustomerSpentTime()) {
                    for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                        makevip[k + 1] = makevip[k];
                    }
                    makevip[j] = Summary_.vvipArr[i];
                    break;
                }
            }
        }
        toCompareVVIPByTime_Ascending =makevip;
    }

}