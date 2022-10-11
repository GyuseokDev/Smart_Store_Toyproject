package Summary;
import Classification_Parameter.Parameter_Main;
import Customer_Data.Add_Customer;
import Customer_Data.Customer;

import java.security.PublicKey;
import java.util.Arrays.*;
import java.util.Scanner;

public class SummaryByName {
    static Customer[] toCompareGeneral_Ascending = new Customer[Summary_.getGeneralCNT()];
    static Customer[] toCompareGeneral_Descending = new Customer[Summary_.getGeneralCNT()];
    static Customer[] toCompareVIP_Ascending = new Customer[Summary_.getVipCNT()];
    static Customer[] toCompareVIP_Descending = new Customer[Summary_.getVipCNT()];
    static Customer[] toCompareVVIP_Ascending = new Customer[Summary_.getVvipCNT()];
    static Customer[] toCompareVVIP_Descending = new Customer[Summary_.getVvipCNT()];


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
        Scanner sc = new Scanner(System.in);
        String  select = sc.next();
        boolean status = false;
        switch (select){
            case "1":
                showByName_Ascending();
                break;
            case "2":
                showByName_Descending();
                break;
            case "3":
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
        for (int i = (toCompareGeneral_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareGeneral_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VIP List");
        for (int i = (toCompareVIP_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareVIP_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("VVIP List");
        for (int i = (toCompareVVIP_Ascending.length-1); i >=0 ; i--) {
            System.out.println(toCompareVVIP_Ascending[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("출력이 완료되었습니다\n");
    }
public static void showByName_Descending(){
    System.out.println("알파벳 역순으로 출력합니다.");
    System.out.println("==============================");
    System.out.println("General List");
    for(int i=0;i<toCompareGeneral_Descending.length;i++){
        System.out.println(toCompareGeneral_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("VIP List");
    for(int i=0;i<toCompareVIP_Descending.length;i++){
        System.out.println(toCompareVIP_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("VVIP List");
    for(int i=0;i<toCompareVVIP_Descending.length;i++){
        System.out.println(toCompareVVIP_Descending[i].showCustomerInfo());
    }
    System.out.println("==============================");
    System.out.println("출력이 완료되었습니다\n");
}

    public static void makeGeneralArrByName_Ascending() {
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            toCompareGeneral_Ascending[i] = new Customer(null, null, 0, 0);
        }
        //비교
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerNameByCharToSmall() >= toCompareGeneral_Ascending[j].getCustomerNameByCharToSmall())
                    //소문자인 경우
                    if(Summary_.generalArr[i].getCustomerNameByCharToSmall() == toCompareGeneral_Ascending[j].getCustomerNameByCharToSmall()&&
                            Summary_.generalArr[i].getCustomerNameByCharToOrigin()<toCompareGeneral_Ascending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getGeneralCNT()-2);k>=(j+1);k--){
                            toCompareGeneral_Ascending[k+1]=toCompareGeneral_Ascending[k];
                        }
                        toCompareGeneral_Ascending[j+1] =Summary_.generalArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                            toCompareGeneral_Ascending[k + 1] = toCompareGeneral_Ascending[k];
                        }
                        toCompareGeneral_Ascending[j] = Summary_.generalArr[i];
                        break;
                    }
            }
        }
    }
    public static void makeGeneralArrByName_Descending() {
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            toCompareGeneral_Descending[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerNameByCharToSmall() >= toCompareGeneral_Descending[j].getCustomerNameByCharToSmall())
                    if(Summary_.generalArr[i].getCustomerNameByCharToSmall() == toCompareGeneral_Descending[j].getCustomerNameByCharToSmall()&&
                    Summary_.generalArr[i].getCustomerNameByCharToOrigin()>toCompareGeneral_Descending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getGeneralCNT()-2);k>=(j+1);k--){
                            toCompareGeneral_Descending[k+1]=toCompareGeneral_Descending[k];
                        }
                        toCompareGeneral_Descending[j+1] =Summary_.generalArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                            toCompareGeneral_Descending[k + 1] = toCompareGeneral_Descending[k];
                        }
                        toCompareGeneral_Descending[j] = Summary_.generalArr[i];
                        break;
                    }
            }
        }
    }



    public static void makeVIPArrByName_Ascending() {
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            toCompareVIP_Ascending[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerNameByCharToSmall() >= toCompareVIP_Ascending[j].getCustomerNameByCharToSmall())
                    if(Summary_.vipArr[i].getCustomerNameByCharToSmall() == toCompareVIP_Ascending[j].getCustomerNameByCharToSmall()&&
                            Summary_.vipArr[i].getCustomerNameByCharToOrigin()<toCompareVIP_Ascending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVipCNT()-2);k>=(j+1);k--){
                            toCompareVIP_Ascending[k+1]=toCompareVIP_Ascending[k];
                        }
                        toCompareVIP_Ascending[j+1] =Summary_.vipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                            toCompareVIP_Ascending[k + 1] = toCompareVIP_Ascending[k];
                        }
                        toCompareVIP_Ascending[j] = Summary_.vipArr[i];
                        break;
                    }
            }
        }
    }

    public static void makeVIPArrByName_Descending() {
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            toCompareVIP_Descending[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerNameByCharToSmall() >= toCompareVIP_Descending[j].getCustomerNameByCharToSmall())
                    if(Summary_.vipArr[i].getCustomerNameByCharToSmall() == toCompareVIP_Descending[j].getCustomerNameByCharToSmall()&&
                            Summary_.vipArr[i].getCustomerNameByCharToOrigin()>toCompareVIP_Descending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVipCNT()-2);k>=(j+1);k--){
                            toCompareVIP_Descending[k+1]=toCompareVIP_Descending[k];
                        }
                        toCompareVIP_Descending[j+1] =Summary_.vipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                            toCompareVIP_Descending[k + 1] = toCompareVIP_Descending[k];
                        }
                        toCompareVIP_Descending[j] = Summary_.vipArr[i];
                        break;
                    }
            }
        }
    }

    public static void makeVVIPArrByName_Ascending() {
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            toCompareVVIP_Ascending[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            for (int j = 0; j < Summary_.getVvipCNT(); j++) {
                if (Summary_.vvipArr[i].getCustomerNameByCharToSmall() >= toCompareVVIP_Ascending[j].getCustomerNameByCharToSmall())
                    if(Summary_.vvipArr[i].getCustomerNameByCharToSmall() == toCompareVVIP_Ascending[j].getCustomerNameByCharToSmall()&&
                            Summary_.vvipArr[i].getCustomerNameByCharToOrigin()<toCompareVVIP_Ascending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVvipCNT()-2);k>=(j+1);k--){
                            toCompareVVIP_Ascending[k+1]=toCompareVVIP_Ascending[k];
                        }
                        toCompareVVIP_Ascending[j+1] =Summary_.vvipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                            toCompareVVIP_Ascending[k + 1] = toCompareVVIP_Ascending[k];
                        }
                        toCompareVVIP_Ascending[j] = Summary_.vvipArr[i];
                        break;
                    }
            }
        }
    }


    public static void makeVVIPArrByName_Descending() {
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            toCompareVVIP_Descending[i] = new Customer(null, null, 0, 0);
        }
        for (int i = 0; i < Summary_.getVvipCNT(); i++) {
            for (int j = 0; j < Summary_.getVvipCNT(); j++) {
                if (Summary_.vvipArr[i].getCustomerNameByCharToSmall() >= toCompareVVIP_Descending[j].getCustomerNameByCharToSmall())
                    if(Summary_.vvipArr[i].getCustomerNameByCharToSmall() == toCompareVVIP_Descending[j].getCustomerNameByCharToSmall()&&
                            Summary_.vvipArr[i].getCustomerNameByCharToOrigin()>toCompareVVIP_Descending[j].getCustomerNameByCharToOrigin()){
                        for (int k=(Summary_.getVvipCNT()-2);k>=(j+1);k--){
                            toCompareVVIP_Descending[k+1]=toCompareVVIP_Descending[k];
                        }
                        toCompareVVIP_Descending[j+1] =Summary_.vvipArr[i];
                        break;
                    } else {
                        for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                            toCompareVVIP_Descending[k + 1] = toCompareVVIP_Descending[k];
                        }
                        toCompareVVIP_Descending[j] = Summary_.vvipArr[i];
                        break;
                    }
            }
        }
    }

}
