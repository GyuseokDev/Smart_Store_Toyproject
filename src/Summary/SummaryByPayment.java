package Summary;

import Customer_Data.Customer;
import Exception.Exception;


public class SummaryByPayment {
   static Customer[] toCompareGeneralByPayment_Ascending = new Customer[0];
   static Customer[] toCompareVIPByPayment_Ascending = new Customer[0];
   static Customer[] toCompareVVIPByPayment_Ascending = new Customer[0];


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
      int select = Exception.scannerInt();
      boolean status = false;
      switch (select){
         case 1:
            showByPayment_Ascending();
            break;
         case 2:
            showByPayment_Descending();
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
         showByPayment_Menu();
      }
   }

public static void showByPayment_Ascending(){
   System.out.println("사용 금액이 높은 순으로 출력합니다.");
   System.out.println("==============================");
   System.out.println("General List");
   for (int i = 0; i < toCompareGeneralByPayment_Ascending.length; i++) {
      System.out.println(toCompareGeneralByPayment_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VIP List");
   for (int i = 0; i < toCompareVIPByPayment_Ascending.length; i++) {
      System.out.println(toCompareVIPByPayment_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VVIP List");
   for (int i = 0; i < toCompareVVIPByPayment_Ascending.length; i++) {
      System.out.println(toCompareVVIPByPayment_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("출력이 완료되었습니다\n");
}

public static void showByPayment_Descending(){
   System.out.println("사용 금액이 낮은 순으로 출력합니다.");
   System.out.println("==============================");
   System.out.println("General List");
   for (int i = (toCompareGeneralByPayment_Ascending.length-1); i>=0; i--){
      System.out.println(toCompareGeneralByPayment_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VIP List");
   for (int i = (toCompareVIPByPayment_Ascending.length-1); i>=0; i--){
      System.out.println(toCompareVIPByPayment_Ascending[i].showCustomerInfo());
   }
   System.out.println("==============================");
   System.out.println("VVIP List");
   for (int i = (toCompareVVIPByPayment_Ascending.length-1); i>=0; i--){
      System.out.println(toCompareVVIPByPayment_Ascending[i].showCustomerInfo());
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
      Customer[] makeGeneral = new Customer[Summary_.getGeneralCNT()];
      for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
         makeGeneral[i] = new Customer(null, null, 0, 0);
      }
      for (int i = 0; i < Summary_.getGeneralCNT(); i++) {
         for (int j = 0; j < Summary_.getGeneralCNT(); j++) {
            if (Summary_.generalArr[i].getCustomerPayment() >= makeGeneral[j].getCustomerPayment()) {
               for (int k = (Summary_.getGeneralCNT() - 2); k >= j; k--) {
                  makeGeneral[k + 1] = makeGeneral[k];
               }
               makeGeneral[j] = Summary_.generalArr[i];
               break;
            }
         }
      }
      toCompareGeneralByPayment_Ascending = makeGeneral;
   }

      public static void makeVIPArrByPayment_Ascending(){
      Customer[] makevip = new Customer[Summary_.getVipCNT()];
         for (int i = 0; i < Summary_.getVipCNT(); i++) {
            makevip[i] = new Customer(null, null, 0, 0);
         }
         for (int i = 0; i < Summary_.getVipCNT(); i++) {
            for (int j = 0; j < Summary_.getVipCNT(); j++) {
               if (Summary_.vipArr[i].getCustomerPayment() >= makevip[j].getCustomerPayment()) {
                  for (int k = (Summary_.getVipCNT() - 2); k >= j; k--) {
                     makevip[k + 1] = makevip[k];
                  }
                  makevip[j] = Summary_.vipArr[i];
                  break;
               }
            }
         }
         toCompareVIPByPayment_Ascending = makevip;
   }

   public static void makeVVIPArrByPayment_Ascending(){
      Customer[] makevvip = new Customer[Summary_.getVvipCNT()];
      for (int i = 0; i < Summary_.getVvipCNT(); i++) {
         makevvip[i] = new Customer(null, null, 0, 0);
      }
      for (int i = 0; i < Summary_.getVvipCNT(); i++) {
         for (int j = 0; j < Summary_.getVvipCNT(); j++) {
            if (Summary_.vvipArr[i].getCustomerPayment() >= makevvip[j].getCustomerPayment()) {
               for (int k = (Summary_.getVvipCNT() - 2); k >= j; k--) {
                  makevvip[k + 1] = makevvip[k];
               }
               makevvip[j] = Summary_.vvipArr[i];
               break;
            }
         }
      }
      toCompareVVIPByPayment_Ascending = makevvip;
   }

}
