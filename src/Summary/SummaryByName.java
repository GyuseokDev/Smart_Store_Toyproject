package Summary;
import Classification_Parameter.Parameter_Main;
import Customer_Data.Add_Customer;
import Customer_Data.Customer;

import java.security.PublicKey;
import java.util.Arrays.*;

public class SummaryByName {
    static Customer[] toCompareGeneral_Ascending = new Customer[Summary_.getGeneralCNT()];
    static Customer[] toCompareVIP_Ascending = new Customer[Summary_.getVipCNT()];
    static Customer[] toCompareVVIP_Ascending = new Customer[Summary_.getVvipCNT()];

    public static void test(){
        System.out.println("역순 Test");

        System.out.println("정순 Test");
        makeGeneralArrByName_Ascending();
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
        for(int i=(toCompareGeneral_Ascending.length-1);i>=0;i--){
            System.out.println(toCompareGeneral_Ascending[i].showCustomerInfo());
        }
    }
    public static void makeGeneralArrByName_Descending() {
        //비교하기위한 새로운 배열 생성(빈배열)
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            toCompareGeneral_Ascending[i] = new Customer(null, null, 0, 0);
        }
        //비교
        for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
            for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
                if (Summary_.generalArr[i].getCustomerNameByCharToSmall() >= toCompareGeneral_Ascending[j].getCustomerNameByCharToSmall())
                        //소문자인 경우
                    if(Summary_.generalArr[i].getCustomerNameByCharToSmall() == toCompareGeneral_Ascending[j].getCustomerNameByCharToSmall()&&
                    Summary_.generalArr[i].getCustomerNameByCharToOrigin()>toCompareGeneral_Ascending[j].getCustomerNameByCharToOrigin()){
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
        for(int i=0;i<toCompareGeneral_Ascending.length;i++){
            System.out.println(toCompareGeneral_Ascending[i].showCustomerInfo());
        }
    }



    public static void makeVIPArrByName_Ascending() {
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            toCompareVIP_Ascending[i] = new Customer(null, null, 0, 0);
        }
        //비교
        for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
                if (Summary_.vipArr[i].getCustomerNameByCharToSmall() >= toCompareVIP_Ascending[j].getCustomerNameByCharToSmall())
                    //소문자인 경우
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

}
