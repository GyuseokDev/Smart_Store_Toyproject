package Summary;

import Customer_Data.Customer;

public class SummaryByPayment {

   static int GeneralCnt = Summary_.getGeneralCNT();
   static int VIPCnt = Summary_.getVipCNT();
   static int VVIPCnt = Summary_.getVvipCNT();
   static Customer[] toCompareGeneral_Ascending = new Customer[GeneralCnt];
   static Customer[] toCompareVIP_Ascending = new Customer[VIPCnt];


   public static void showGeneralByPatment_Ascending() {
      //비교하기위한 새로운 배열 생성(빈배열)
      for (int i = 0; i < GeneralCnt; i++) {
         toCompareGeneral_Ascending[i] = new Customer(null, null, 0, 0);
      }
      //비교
      for (int i = 0; i < GeneralCnt; i++) {
         for (int j = 0; j < GeneralCnt; j++) {
            if (Summary_.generalArr[i].getCustomerPayment() >= toCompareGeneral_Ascending[j].getCustomerPayment()) {
               for (int k = (GeneralCnt - 2); k >= j; k--) {
                  toCompareGeneral_Ascending[k + 1] = toCompareGeneral_Ascending[k];
               }
               toCompareGeneral_Ascending[j] = Summary_.generalArr[i];
               break;
            }
         }
      }
      for (int i = 0; i < toCompareGeneral_Ascending.length; i++) {
         System.out.println(toCompareGeneral_Ascending[i]);
      }
   }

      public static void showVIPByPayment_Ascending(){
         for (int i = 0; i < VIPCnt; i++) {
            toCompareGeneral_Ascending[i] = new Customer(null, null, 0, 0);
         }
         //비교
         for (int i = 0; i < VIPCnt; i++) {
            for (int j = 0; j < VIPCnt; j++) {
               if (Summary_.generalArr[i].getCustomerPayment() >= toCompareGeneral_Ascending[j].getCustomerPayment()) {
                  for (int k = (VIPCnt - 2); k >= j; k--) {
                     toCompareGeneral_Ascending[k + 1] = toCompareGeneral_Ascending[k];
                  }
                  toCompareGeneral_Ascending[j] = Summary_.generalArr[i];
                  break;
               }
            }
         }
         for (int i = 0; i < toCompareGeneral_Ascending.length; i++) {
            System.out.println(toCompareGeneral_Ascending[i]);
         }

   }


}
