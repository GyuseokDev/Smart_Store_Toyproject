package Classification_Parameter;

import com.sun.jdi.VoidValue;

public class vip extends general {
    private static int minTime= 10;
    private static int minMoney=100000;
    final private static String grade = "VIP";


    public static void setMinTime(int time){
        minTime = time;
    }
    public static int getMinTime(){
        return minTime;
    }
    public static void setMinMoney(int money){
        minMoney = money;
    }
    public static int getMinMoney(){
        return minMoney;
    }

    public static void showInfo(){
        System.out.println(grade+"등급의 최소 사용시간은 "+minTime+"시간 이며 최소 사용금액은 "+minMoney+"원 입니다.");
    }

    public static void set() {
        showInfo();
        System.out.print("==============================\n" +
                "1. 최소 사용 시간 설정\n" +
                "2. 최소 사용 금액 설정\n" +
                "3. 등급 선택 메뉴로 돌아가기.\n" +
                "==============================\n" +
                "메뉴를 선택해주세요 :");
        select();

    }
            public static void select(){
            boolean status = true;
            int select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.println(grade+" 등급의 최소 사용시간은 "+general.getMinTime()+"시간 보다 크고 "+vvip.getMinTime()+"시간보다 작아야합니다.");
                    System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                    int time = sc.nextInt();
                    if(time>general.getMinTime()&&time<vvip.getMinTime()){
                        vip.setMinTime(time);
                        System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 설정되었습니다.");
                    }else {
                        System.out.println("올바른 형식이 아닙니다.");
                    }
                    break;
                case 2:
                    System.out.println(grade+" 등급의 최소 사용금액은 "+general.getMinMoney()+"원 보다 크고 "+vvip.getMinMoney()+"원보다 작아야합니다.");
                    System.out.print(grade+" 등급의 최소 사용금액을 입력하세요: ");
                    int money = sc.nextInt();
                    if (money>general.getMinMoney()&&money<vvip.getMinMoney()) {
                        vip.setMinMoney(money);
                        System.out.println(grade+" 등급의 최소 사용금액이 "+money+"원으로 설정되었습니다.");
                    }else {
                        System.out.println("올바른 형식이 아닙니다.");
                    }
                    break;
                case 3:
                    System.out.println("등급 선택 메뉴로 돌아갑니다.");
                    status = false;
                    break;
                default:
                    System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                    select();
        }
        if (status){
            set();
        } else if (!status) {
            Set_Parameter.set_menu();
        }
    }

    public static void set2() {
        showInfo();
        System.out.print("==============================\n" +
                "1. 최소 사용 시간 수정\n" +
                "2. 최소 사용 금액 수정\n" +
                "3. 등급 선택 메뉴로 돌아가기.\n" +
                "==============================\n" +
                "메뉴를 선택해주세요 :");
        select2();

    }
    public static void select2(){
        boolean status = true;
        int select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println(grade+" 등급의 최소 사용시간은 "+general.getMinTime()+"시간 보다 크고 "+vvip.getMinTime()+"시간보다 작아야합니다.");
                System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                int time = sc.nextInt();
                if(time>general.getMinTime()&&time<vvip.getMinTime()){
                    vip.setMinTime(time);
                    System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 수정되었습니다.");
                }else {
                    System.out.println("올바른 형식이 아닙니다.");
                }
                break;
            case 2:
                System.out.println(grade+" 등급의 최소 사용금액은 "+general.getMinMoney()+"원 보다 크고 "+vvip.getMinMoney()+"원보다 작아야합니다.");
                System.out.print(grade+" 등급의 최소 사용금액을 입력하세요: ");
                int money = sc.nextInt();
                if (money>general.getMinMoney()&&money<vvip.getMinMoney()) {
                    vip.setMinMoney(money);
                    System.out.println(grade+" 등급의 최소 사용금액이 "+money+"원으로 수정되었습니다.");
                }else {
                    System.out.println("올바른 형식이 아닙니다.");
                }
                break;
            case 3:
                System.out.println("등급 선택 메뉴로 돌아갑니다.");
                status = false;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                select();
        }
        if (status){
            set();
        } else if (!status) {
            Update_Parameter.set_menu();
        }
    }
}
