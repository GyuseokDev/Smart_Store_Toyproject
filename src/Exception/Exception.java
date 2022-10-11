package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
//항상 -5이상의 Integer 가 와야하는 경우.
    public static int scannerInt(){
        int a;
        try{
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        }catch (InputMismatchException ime){
            a=-5;
        }
        return a;
    }

    //이름 형식 판별
    public static boolean nameFormat(String name){
        boolean format=true;
        for(int j=0;j<name.length();j++) {
            if ((name.charAt(j) >= 65 && name.charAt(j) <= 90) || (name.charAt(j) >= 97 && name.charAt(j) <= 122)) {
            } else {
                format = false;
            }
        }
        return format;
    }


    //ID 형식 판별
    public static boolean idFormat(String ID){
        boolean format = true;
        for(int j=0;j<ID.length();j++){
            if ((ID.charAt(j)>=65&&ID.charAt(j)<=90)||(ID.charAt(j)>=97&&ID.charAt(j)<=122)||
                    ID.charAt(j)==95||(ID.charAt(j)>=48&&ID.charAt(j)<=57)){
            }else {
                format=false;
            }
        }
        return format;
    }


}
