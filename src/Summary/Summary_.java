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
        Customer[] makeGeneral = new Customer[0];
        Customer[] makeVIP = new Customer[0];
        Customer[] makeVVIP = new Customer[0];
        int generalnum=0;
        int vipnum=0;
        int vvipnum=0;

        for (int i=0;i<Add_Customer.customerArray.length;i++){
            //vvip
            if(Add_Customer.customerArray[i].getCustomerPayment()>=vvip.getMinMoney()&&Add_Customer.customerArray[i].getCustomerSpentTime()>=vvip.getMinTime()){
                vvipnum++;
                Customer[] newArr1 = new Customer[vvipnum];
                for (int j= 0; j < makeVVIP.length;j++){
                    newArr1[j]=makeVVIP[j];
                }
                makeVVIP = newArr1;
                makeVVIP[(vvipnum-1)]=Add_Customer.customerArray[i];
//                System.out.println("vvip추가");
            }
            //vip
            else if(Add_Customer.customerArray[i].getCustomerPayment()>=vip.getMinMoney()&&Add_Customer.customerArray[i].getCustomerSpentTime()>=vip.getMinTime()) {
                vipnum++;
                Customer[] newArr2 = new Customer[vipnum];
                for (int j = 0; j < makeVIP.length; j++) {
                    newArr2[j] = makeVIP[j];
                }
                makeVIP = newArr2;
                makeVIP[(vipnum - 1)] = Add_Customer.customerArray[i];
//                System.out.println("vip추가");
            }
            //general
            else {
                generalnum++;
                Customer[] newArr3 = new Customer[generalnum];
                for(int j = 0;j<makeGeneral.length;j++){
                    newArr3[j] = makeGeneral[j];
                }
                makeGeneral = newArr3;
                makeGeneral[(generalnum-1)] = Add_Customer.customerArray[i];
//                System.out.println("general 추가");
            }
        }
        generalArr = new Customer[generalnum];
        vipArr = new Customer[vipnum];
        vvipArr = new Customer[vvipnum];
        generalArr = makeGeneral;
        vipArr = makeVIP;
        vvipArr = makeVVIP;
        generalCNT =generalnum;
        vipCNT = vipnum;
        vvipCNT=vvipnum;
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
