package Customer_Data;

import java.util.Scanner;

public class Delete_Customer {
    static Scanner sc = new Scanner(System.in);
    static int targetNum;
    public static void setTargetNum(){
        View_Customer.viewToEdit();
        int num = Add_Customer.num;
        if(num>=1){
            System.out.println("몇번째 고객의 정보를 삭제 하시겠습니까?\n(1~"+num+")");
            System.out.print("취소하시려면 0을 입력해주세요.");
            targetNum = sc.nextInt()-1;
            if(targetNum>=0&&targetNum<=(num-1)) {
                System.out.println("대상 고객의 정보를 삭제합니다.");
                delete();
            }else if(targetNum ==-1){
                System.out.println("삭제를 취소합니다.");
            }
            else {
                System.out.println("옳바르지 않은 숫자입니다. 다시 입력해주세요.");
            }
        }
        else {
            System.out.println("고객의 정보가 충분하지 않습니다.\n고객 메뉴로 돌아갑니다.");
        }
    }

    public static void delete(){
        Customer[] edit = new Customer[(Add_Customer.num-1)];
        for(int i=0;i<targetNum;i++){
            edit[i]=Add_Customer.customerArray[i];
        }
        for (int i = targetNum;i<(Add_Customer.num-1);i++) {
            edit[i] = Add_Customer.customerArray[i + 1];
        }
        Add_Customer.deletedArr(edit);
        System.out.println("성공적으로 삭제되었습니다.");
    }
}
