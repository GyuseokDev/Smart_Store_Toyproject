package Summary;
import Customer_Data.Customer;
import Exception.Exception;

public class SummaryByName {
    static Customer[] toCompareGeneralByName_Ascending = new Customer[0];
    static Customer[] toCompareGeneralByName_Descending = new Customer[0];
    static Customer[] toCompareVIPByName_Ascending = new Customer[0];
    static Customer[] toCompareVIPByName_Descending = new Customer[0];
    static Customer[] toCompareVVIPByName_Ascending = new Customer[0];
    static Customer[] toCompareVVIPByName_Descending = new Customer[0];


    public static void showByName_Menu(){
        makeArr();
        System.out.print("==============================\n" +
                " 1. 알파벳 순으로 보기.\n" +
                " 2. 알파벳 역순으로 보기\n" +
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
                showByName_Ascending();
                break;
            case 2:
                showByName_Descending();
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
            showByName_Menu();
        }
    }

    public static void makeArr(){
        makeGeneralArrByName_Ascending();
        makeGeneralArrByName_Descending();
        makeVIPArrByName_Ascending();
        makeVIPArrByName_Descending();
        makeVVIPArrByName_Ascending();
        makeVVIPArrByName_Descending();
    }

    public static void showByName_Ascending(){
        System.out.println("알파벳 순으로 출력합니다.");
        System.out.println("==============================");
        System.out.println("General List");
        for (int i = (toCompareGeneralByName_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareGeneralByName_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VIP List");
        for (int i = (toCompareVIPByName_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareVIPByName_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VVIP List");
        for (int i = (toCompareVVIPByName_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareVVIPByName_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("출력이 완료되었습니다\n");
    }
public static void showByName_Descending(){
    System.out.println("알파벳 역순으로 출력합니다.");
    System.out.println("==============================");
    System.out.println("General List");
    for(int i = 0; i< toCompareGeneralByName_Descending.length; i++){
        System.out.println(toCompareGeneralByName_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("VIP List");
    for(int i = 0; i< toCompareVIPByName_Descending.length; i++){
        System.out.println(toCompareVIPByName_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("VVIP List");
    for(int i = 0; i< toCompareVVIPByName_Descending.length; i++){
        System.out.println(toCompareVVIPByName_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("출력이 완료되었습니다\n");
}

    public static void makeGeneralArrByName_Ascending() {
        Customer[] makegeneral = new Customer[Summary_.getGeneralCNT()];
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            makegeneral[i] = new Customer(null, null, 0, 0);
        }
        //비교
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerNameByCharToSmall() >= makegeneral[j].getCustomerNameByCharToSmall())
                    //소문자인 경우
                    if(Summary_.generalArr[i].getCustomerNameByCharToSmall() == makegeneral[j].getCustomerNameByCharToSmall()&&
                            Summary_.generalArr[i].getCustomerNameByCharToOrigin()< makegeneral[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getGeneralCNT()-2);k>=(j+1);k--){
                            makegeneral[k+1]= makegeneral[k];
                        }
                        makegeneral[j+1] =Summary_.generalArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                            makegeneral[k + 1] = makegeneral[k];
                        }
                        makegeneral[j] = Summary_.generalArr[i];
                        break;
                    }
            }
        }
        toCompareGeneralByName_Ascending=makegeneral;
    }
    public static void makeGeneralArrByName_Descending() {
        Customer[] makegeneral = new Customer[Summary_.getGeneralCNT()];
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            makegeneral[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerNameByCharToSmall() >= makegeneral[j].getCustomerNameByCharToSmall())
                    if(Summary_.generalArr[i].getCustomerNameByCharToSmall() == makegeneral[j].getCustomerNameByCharToSmall()&&
                    Summary_.generalArr[i].getCustomerNameByCharToOrigin()> makegeneral[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getGeneralCNT()-2);k>=(j+1);k--){
                            makegeneral[k+1]= makegeneral[k];
                        }
                        makegeneral[j+1] =Summary_.generalArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                            makegeneral[k + 1] = makegeneral[k];
                        }
                        makegeneral[j] = Summary_.generalArr[i];
                        break;
                    }
            }
        }
        toCompareGeneralByName_Descending =makegeneral;
    }



    public static void makeVIPArrByName_Ascending() {
        Customer[] makevip = new Customer[Summary_.getVipCNT()];
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            makevip[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerNameByCharToSmall() >= makevip[j].getCustomerNameByCharToSmall())
                    if(Summary_.vipArr[i].getCustomerNameByCharToSmall() == makevip[j].getCustomerNameByCharToSmall()&&
                            Summary_.vipArr[i].getCustomerNameByCharToOrigin()< makevip[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVipCNT()-2);k>=(j+1);k--){
                            makevip[k+1]= makevip[k];
                        }
                        makevip[j+1] =Summary_.vipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                            makevip[k + 1] = makevip[k];
                        }
                        makevip[j] = Summary_.vipArr[i];
                        break;
                    }
            }
        }
        toCompareVIPByName_Ascending =makevip;
    }

    public static void makeVIPArrByName_Descending() {
        Customer[] makevip = new Customer[Summary_.getVipCNT()];
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            makevip[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerNameByCharToSmall() >= makevip[j].getCustomerNameByCharToSmall())
                    if(Summary_.vipArr[i].getCustomerNameByCharToSmall() == makevip[j].getCustomerNameByCharToSmall()&&
                            Summary_.vipArr[i].getCustomerNameByCharToOrigin()> makevip[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVipCNT()-2);k>=(j+1);k--){
                            makevip[k+1]= makevip[k];
                        }
                        makevip[j+1] =Summary_.vipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                            makevip[k + 1] = makevip[k];
                        }
                        makevip[j] = Summary_.vipArr[i];
                        break;
                    }
            }
        }
        toCompareVIPByName_Descending =makevip;
    }

    public static void makeVVIPArrByName_Ascending() {
        Customer[] makevvip = new Customer[Summary_.getVvipCNT()];
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            makevvip[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            for (int j = 0; j < Summary_.getVvipCNT(); j++) {
                if (Summary_.vvipArr[i].getCustomerNameByCharToSmall() >= makevvip[j].getCustomerNameByCharToSmall())
                    if(Summary_.vvipArr[i].getCustomerNameByCharToSmall() == makevvip[j].getCustomerNameByCharToSmall()&&
                            Summary_.vvipArr[i].getCustomerNameByCharToOrigin()< makevvip[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVvipCNT()-2);k>=(j+1);k--){
                            makevvip[k+1]= makevvip[k];
                        }
                        makevvip[j+1] =Summary_.vvipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                            makevvip[k + 1] = makevvip[k];
                        }
                        makevvip[j] = Summary_.vvipArr[i];
                        break;
                    }
            }
        }
        toCompareVVIPByName_Ascending=makevvip;
    }


    public static void makeVVIPArrByName_Descending() {
        Customer[] makevvip = new Customer[Summary_.getVvipCNT()];
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            makevvip[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            for (int j = 0; j < Summary_.getVvipCNT(); j++) {
                if (Summary_.vvipArr[i].getCustomerNameByCharToSmall() >= makevvip[j].getCustomerNameByCharToSmall())
                    if(Summary_.vvipArr[i].getCustomerNameByCharToSmall() == makevvip[j].getCustomerNameByCharToSmall()&&
                            Summary_.vvipArr[i].getCustomerNameByCharToOrigin()> makevvip[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVvipCNT()-2);k>=(j+1);k--){
                            makevvip[k+1]= makevvip[k];
                        }
                        makevvip[j+1] =Summary_.vvipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                            makevvip[k + 1] = makevvip[k];
                        }
                        makevvip[j] = Summary_.vvipArr[i];
                        break;
                    }
            }
        }
        toCompareVVIPByName_Descending=makevvip;
    }

}
