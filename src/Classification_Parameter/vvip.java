package Classification_Parameter;

public class vvip extends general {
    private static int minTime=20;
    private static int minMoney=500000;
    final private static String grade = "VVIP";



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
                System.out.println(grade+" 등급의 최소 사용시간은 "+vip.getMinTime()+"시간 보다 커야합니다.");
                System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                int time = sc.nextInt();
                if(time>vip.getMinTime()) {
                    vvip.setMinTime(time);
                    System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 설정되었습니다.");
                }else {
                    System.out.println("올바른 형식이 아닙니다.");
                }
                break;
            case 2:
                System.out.println(grade+" 등급의 최소 사용금액은 "+vip.getMinMoney()+"원 보다 커야합니다.");
                System.out.print(grade+" 등급의 최소 사용금액을 입력하세요: ");
                int money = sc.nextInt();
                if(money>vip.getMinMoney()) {
                    vvip.setMinMoney(money);
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
                "3. 등급 선택 메뉴로 돌아가기." +
                "==============================\n" +
                "메뉴를 선택해주세요 :");
        select2();

    }
    public static void select2(){
        boolean status = true;
        int select = sc.nextInt();
        switch (select){
            case 1:
                System.out.println(grade+" 등급의 최소 사용시간은 "+vip.getMinTime()+"시간 보다 커야합니다.");
                System.out.print(grade+" 등급의 최소 사용시간을 입력하세요: ");
                int time = sc.nextInt();
                if(time>vip.getMinTime()) {
                    vvip.setMinTime(time);
                    System.out.println(grade+" 등급의 최소 사용시간이 "+time+"시간으로 수정되었습니다.");
                }else {
                    System.out.println("올바른 형식이 아닙니다.");
                }
                break;
            case 2:
                System.out.println(grade+" 등급의 최소 사용금액은 "+vip.getMinMoney()+"원 보다 커야합니다.");
                System.out.print(grade+" 등급의 최소 사용금액을 입력하세요: ");
                int money = sc.nextInt();
                if(money>vip.getMinMoney()) {
                    vvip.setMinMoney(money);
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
