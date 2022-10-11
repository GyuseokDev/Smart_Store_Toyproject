package Customer_Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add_Customer {
    static Scanner sc = new Scanner(System.in);


    static int add_num;
    public static int num =0;
    public static Customer[] customerArray = new Customer[num];


    //Test Code
//    public static int num = 11;
//    public static Customer[] customerArray = {
//            new Customer("bca",null,0,0),
//             new Customer("abc",null,0,0),
//            new Customer("A",null,0,0),
//            new Customer("B",null,5,1000),
//            new Customer("C",null,9,120000),
//            new Customer("d",null,10,100000),
//            new Customer("e",null,15,150000),
//            new Customer("f",null,19,500000),
//            new Customer("g",null,20,500000),
//            new Customer("h",null,25,550000),
//            new Customer("i",null,50,1000000)
//};



    public static void add_Start() {
        System.out.println("몇명을 추가하시겠습니까?\n(취소하시려면 숫자 0을 눌러주세요.)");
        newCustomerNum();
    }


    public static void newCustomerNum(){
        add_num = sc.nextInt();
        if(add_num==0){
            System.out.println("고객 정보 추가를 취소합니다.");
            Customer_Main.customerMenu();
        }else if(add_num>=1){
            System.out.println(add_num+"명을 추가합니다.");
            new_Customer_Array();
        }
        else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            newCustomerNum();
        }
    }

    //배열 늘리기
    public static void new_Customer_Array(){
        Customer[] new_customerArray = new Customer[num+add_num];
        for(int i =0;i<customerArray.length;i++){
            new_customerArray[i]=customerArray[i];
        }
        customerArray = new_customerArray;
        addMenu();
    }

    public static void addMenu(){
        for (int i = 0; i<add_num;i++){
            String name=null;
            String ID=null;
            int spentTime=0;
            int payment=0;
            boolean status = true;

            while (status) {
                System.out.println("\n"+(i+1) + "번째 손님 정보를 입력합니다.");
                System.out.print("==============================\n" +
                        "1. 고객 이름 입력\n" +
                        "2. 고객 아이디 입력\n" +
                        "3. 고객 사용시간 입력\n" +
                        "4. 고객 사용금액 입력\n" +
                        "5. 고객 정보 입력 종료\n" +
                        "==============================\n" +
                        "메뉴를 선택해주세요 :");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("고객 이름을 입력해주세요 :");
                        name = sc.next();
                        break;
                    case 2:
                        System.out.print("고객 아이디를 입력해주세요 :");
                        ID = sc.next();
                        break;
                    case 3:
                        System.out.print("고객 사용시간을 입력해주세요 :");
                        spentTime = sc.nextInt();
                        break;
                    case 4:
                        System.out.print("고객 사용금액을 입력해주세요 :");
                        payment = sc.nextInt();
                        break;
                    case 5:
                        System.out.println(i + 1 + "번째 고객의 정보 입력을 종료합니다.\n");
                        status = false;
                        break;
                    default:
                        System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                }
            }
            customerArray[num+i]= new Customer(name,ID,spentTime,payment);
        }
        num += add_num;
        System.out.println("모든 고객의 정보 입력이 완료되었습니다.\n 고객 정보 메뉴로 돌아갑니다.");
    }

    public static Customer[] deletedArr(Customer[] arr){
        num --;
        customerArray=null;
        customerArray = arr;
        return null;
    }

    public static int getNum() {
        return num;
    }
}
