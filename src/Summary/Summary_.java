package Summary;
import Classification_Parameter.*;
import Customer_Data.*;
public class Summary_ {
    public static int generalCNT=0;
    public static int vipCNT=0;
    public static int vvipCNT=0;
    public static Customer[] generalArr = new Customer[0];
    public static Customer[] vipArr = new Customer[0];
    public static Customer[] vvipArr = new Customer[0];




    public static void makeArr(){
        for (int i=0;i<Add_Customer.customerArray.length;i++){
            //vvip
            if(Add_Customer.customerArray[i].getCustomerPayment()>=vvip.getMinMoney()&&Add_Customer.customerArray[i].getCustomerSpentTime()>=vvip.getMinTime()){
                vvipCNT++;
                Customer[] newArr1 = new Customer[vvipCNT];
                for (int j= 0; j < vvipArr.length;j++){
                    newArr1[j]=vvipArr[j];
                }
                vvipArr = newArr1;
                vvipArr[(vvipCNT-1)]=Add_Customer.customerArray[i];
//                System.out.println("vvip추가");
            }
            //vip
            else if(Add_Customer.customerArray[i].getCustomerPayment()>=vip.getMinMoney()&&Add_Customer.customerArray[i].getCustomerSpentTime()>=vip.getMinTime()) {
                vipCNT++;
                Customer[] newArr2 = new Customer[vipCNT];
                for (int j = 0; j < vipArr.length; j++) {
                    newArr2[j] = vipArr[j];
                }
                vipArr = newArr2;
                vipArr[(vipCNT - 1)] = Add_Customer.customerArray[i];
//                System.out.println("vip추가");
            }
            //general
            else {
                generalCNT++;
                Customer[] newArr3 = new Customer[generalCNT];
                for(int j = 0;j<generalArr.length;j++){
                    newArr3[j] = generalArr[j];
                }
                generalArr = newArr3;
                generalArr[(generalCNT-1)] = Add_Customer.customerArray[i];
//                System.out.println("general 추가");
            }
        }
    }

    public static void show(){
        System.out.println("==============================\nGeneral List");
        for (int i=0;i<generalArr.length;i++){
            System.out.println(generalArr[i].showCustomerInfo());
        }
        System.out.println("==============================\nVIP List");
        for (int i=0;i<vipArr.length;i++){
            System.out.println(vipArr[i].showCustomerInfo());
        }
        System.out.println("==============================\nVVIP List");
        for (int i=0;i<vvipArr.length;i++){
            System.out.println(vvipArr[i].showCustomerInfo());
        }
        System.out.println("==============================");
        System.out.println("\n출력이 완료되었습니다.\n");
    }


    public static int getGeneralCNT() {
        return generalCNT;
    }

    public static int getVipCNT() {
        return vipCNT;
    }

    public static int getVvipCNT() {
        return vvipCNT;
    }

    public static Customer[] getGeneralArr() {
        return generalArr;
    }

    public static Customer[] getVipArr() {
        return vipArr;
    }

    public static Customer[] getVvipArr() {
        return vvipArr;
    }
}
