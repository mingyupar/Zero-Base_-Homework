import java.util.Scanner;

public class Cashback_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) :1200");



    int input = scanner.nextInt();
    int cashBack = (int)(input * 0.1);

        if ( cashBack == 300 ) {
        System.out.println("cashBack = 300");
        } else if (cashBack == 200) {
            System.out.println("cashBack = 200");
        } else {
            System.out.println("cashBack = 100");
        }

        System.out.println(String.format("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", input, cashBack));
}
}
