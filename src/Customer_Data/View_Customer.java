package Customer_Data;

public class View_Customer {

    public static void view(){
        System.out.println("\n==============================");
        int num = Add_Customer.num;
        for(int i=0;i<num;i++){
            System.out.println(Add_Customer.customerArray[i].showCustomerInfo());
        }
        System.out.println("==============================\n고객 정보를 모두 출력하였습니다.\n고객 정보 메뉴로 돌아갑니다.\n");
    }
    public  static  void viewToEdit(){
        System.out.println("\n==============================");
        int num = Add_Customer.num;
        for(int i=0;i<num;i++){
            System.out.println("NO: "+(i+1)+" => "+Add_Customer.customerArray[i].showCustomerInfo());
        }
        System.out.println("==============================\n");
    }
}