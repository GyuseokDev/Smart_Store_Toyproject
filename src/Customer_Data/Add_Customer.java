package Customer_Data;
import Exception.Exception;
import java.util.Scanner;

public class Add_Customer {


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
        add_num = Exception.scannerInt();
        if(add_num==0){
            System.out.println("고객 정보 추가를 취소합니다.");
            Customer_Main.customerMenu();
        }else if(add_num>=1){
            System.out.println(add_num+"명을 추가합니다.");
            new_Customer_Array();
        }
        else {
            System.out.print("잘못된 입력입니다. 다시 입력해주세요");
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
        Scanner sc = new Scanner(System.in);
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
                String n = sc.next();
                switch (n) {
                    case "1":
                        System.out.print("고객 이름은 영문자로만 3글자 이상 입력해주세요.\n" +
                                "고객 이름을 입력해주세요 :");
                        String tempName = sc.next();
                        if(tempName.length()<3){
                            System.out.println("3글자 이상 입력해야합니다.이름 입력을 취소합니다.");
                            break;
                        }
                        boolean nameformat=Exception.nameFormat(tempName);
                        if(nameformat){
                            name = tempName;
                            System.out.println("이름을 "+name+"으로 저장했습니다.");
                        }else if(!nameformat){
                            System.out.println("이름은 영문자만 사용이 가능합니다. 이름 입력을 취소합니다.");
                        }
                        break;
                    case "2":
                        System.out.print("ID는 영문자,숫자,_으로 5~12글자 사이로 입력해주세요.\n" +
                                "고객 아이디를 입력해주세요 :");
                        String tempID = sc.next();
                        if(tempID.length()>12||tempID.length()<5){
                            System.out.println("5~12글자 사이로 입력해야합니다.ID 입력을 취소합니다.");
                            break;
                        }
                        boolean idformat = Exception.idFormat(tempID);
                        if(idformat){
                            ID = tempID;
                            System.out.println("ID를 "+ID+"으로 저장했습니다.");
                        }else if(!idformat){
                            System.out.println("영문자,숫자,_ 만 사용이 가능합니다. 아이디 입력을 취소합니다.");
                        }
                        break;
                    case "3":
                        System.out.print("고객 사용시간을 입력해주세요 :");
                        int tempTime = Exception.scannerInt();
                        if(tempTime<0){
                            System.out.println("올바른 형식이 아닙니다. 사용시간 입력을 취소합니다.");
                        }else {
                            spentTime = tempTime;
                            System.out.println("사용시간을 "+spentTime+"시간으로 저장했습니다.");
                        }
                        break;
                    case "4":
                        System.out.print("고객 사용금액을 입력해주세요 :");
                        int tempPayment = Exception.scannerInt();
                        if(tempPayment<0){
                            System.out.println("올바른 형식이 아닙니다. 사용금액 입력을 취소합니다.");
                        }
                        else {
                            payment =tempPayment;
                            System.out.println("사용금액을 "+payment+"원으로 저장했습니다.");
                        }
                        break;
                    case "5":
                        System.out.println(i + 1 + "번째 고객의 정보 입력을 종료합니다.\n");
                        status = false;
                        break;
                    default:
                        System.out.print("올바른 형식이 아닙니다. 다시 입력해 주세요.");
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
