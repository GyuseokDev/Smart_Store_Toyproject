package Summary;

import Customer_Data.Customer;

import java.util.Scanner;

public class SummaryByPayment {
   static Customer[] toCompareGeneral_Ascending = new Customer[Summary_.getGeneralCNT()];
   static Customer[] toCompareVIP_Ascending = new Customer[Summary_.getVipCNT()];
   static Customer[] toCompareVVIP_Ascending = new Customer[Summary_.getVvipCNT()];


   public static void showByPayment_Menu(){
      makeArr();
      System.out.print("==============================\n" +
              " 1. 사용 금액 높은순으로 보기.\n" +
              " 2. 사용 금액 낮은순으로 보기\n" +
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
            showByPayment_Ascending();
            break;
         case "2":
            showByPayment_Descending();
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
         showByPayment_Menu();
      }
   }

public static void showByPayment_Ascending(){
   System.out.println("사용 금액이 높은 순으로 출력합니다.");
   System.out.println("==============================");
   System.out.println("General List");
   for (int i = 0; i < toCompareGeneral_Ascending.length; i++) {
      System.out.println(toCompareGeneral_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VIP List");
   for (int i = 0; i < toCompareVIP_Ascending.length; i++) {
      System.out.println(toCompareVIP_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VVIP List");
   for (int i = 0; i < toCompareVVIP_Ascending.length; i++) {
      System.out.println(toCompareVVIP_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("출력이 완료되었습니다\n");
}

public static void showByPayment_Descending(){
   System.out.println("사용 금액이 낮은 순으로 출력합니다.");
   System.out.println("==============================");
   System.out.println("General List");
   for (int i=(toCompareGeneral_Ascending.length-1);i>=0;i--){
      System.out.println(toCompareGeneral_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VIP List");
   for (int i=(toCompareVIP_Ascending.length-1);i>=0;i--){
      System.out.println(toCompareVIP_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VVIP List");
   for (int i=(toCompareVVIP_Ascending.length-1);i>=0;i--){
      System.out.println(toCompareVVIP_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("출력이 완료되었습니다\n");
}

public static void makeArr(){
      makeGeneralArrByPaytment_Ascending();
      makeVIPArrByPayment_Ascending();
      makeVVIPArrByPayment_Ascending();
}

//General 그룹 사용금액별 크기로 정렬
   public static void makeGeneralArrByPaytment_Ascending() {
      //비교하기위한 새로운 배열 생성(빈배열)
      for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
         toCompareGeneral_Ascending[i] = new Customer(null, null, 0, 0);
      }
      //비교
      for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
         for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
            if (Summary_.generalArr[i].getCustomerPayment() >= toCompareGeneral_Ascending[j].getCustomerPayment()) {
               for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                  toCompareGeneral_Ascending[k + 1] = toCompareGeneral_Ascending[k];
               }
               toCompareGeneral_Ascending[j] = Summary_.generalArr[i];
               break;
            }
         }
      }
   }

      public static void makeVIPArrByPayment_Ascending(){
         for (int i = 0; i < Summary_.getVipCNT(); i++) {
            toCompareVIP_Ascending[i] = new Customer(null, null, 0, 0);
         }
         //비교
         for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
               if (Summary_.vipArr[i].getCustomerPayment() >= toCompareVIP_Ascending[j].getCustomerPayment()) {
                  for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                     toCompareVIP_Ascending[k + 1] = toCompareVIP_Ascending[k];
                  }
                  toCompareVIP_Ascending[j] = Summary_.vipArr[i];
                  break;
               }
            }
         }
   }

   public static void makeVVIPArrByPayment_Ascending(){
      for (int i = 0; i < Summary_.getVvipCNT(); i++) {
         toCompareVVIP_Ascending[i] = new Customer(null, null, 0, 0);
      }
      //비교
      for (int i = 0; i < Summary_.getVvipCNT(); i++) {
         for (int j = 0; j < Summary_.getVvipCNT(); j++) {
            if (Summary_.vvipArr[i].getCustomerPayment() >= toCompareVVIP_Ascending[j].getCustomerPayment()) {
               for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                  toCompareVVIP_Ascending[k + 1] = toCompareVVIP_Ascending[k];
               }
               toCompareVVIP_Ascending[j] = Summary_.vvipArr[i];
               break;
            }
         }
      }
   }

}
