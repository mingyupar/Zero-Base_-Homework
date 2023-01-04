import java.util.Scanner;

public class Annual_Income_Taxable_Amount {
    public static void main(String[] args) {
        int[] 지불 = new int[8];
        Scanner scanner = new Scanner(System.in);
        int[] 과세표준 = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000, 0}; // 과세표준 상한선
        int[] 과세표준계산 = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000, 0}; // 과세표준 상한선 - 이전 상한선
        int[] 세율 = {6, 15, 24, 35, 38, 40, 42, 45};
        int[] 누진공제금액 = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:35000000");
        int 연소득 = scanner.nextInt();
        지불[500000] = 연소득;

        for (int i = 0; i < 7; i++) {
            if (지불[i] > 과세표준계산[i]) {
                int a = 지불[i] - 과세표준계산[i];
                지불[i] = 과세표준계산[i];
                지불[i + 1] = a;
            } else {
            }
        }

        // 세율 세금 계산식
        int 결과 = 0;
        for (int i = 0; i < 8; i++) {
            if (지불[i] == 0) {
            } else {
                int ab = 지불[i] / 100 * 세율[i];
                System.out.print(String.format("%10d * %2d", 지불[i], 세율[i]));
                System.out.print("% = ");
                System.out.printf("%10d\n", ab);
                결과 += ab;
            }
        }

        // 누진 공제 세금 계산식
        int 계산결과 = 0;
        for (int i = 0; i < 8; i++) {
            if (연소득 < 과세표준[i]) {
                계산결과 = 연소득 / 100 * 세율[i] - 누진공제금액[i];
                break;
            } else if (연소득 > 1000000000) {
                i = 7;
                계산결과 = 연소득 / 100 * 세율[i] - 누진공제금액[i];
                break;
            } else {
            }
        }
        System.out.println("");
        System.out.print("[세율에 의한 세금]:");
        System.out.println(String.format("\t\t %10d", 결과));
        System.out.print("[누진 공제 계산에 의한 세금]:");
        System.out.println(String.format("%10d", 계산결과));
    }
}
