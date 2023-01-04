import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lotto_Winning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int 로또개수 = scanner.nextInt();
        String[] 행문자 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", ""};
        int[][] 로또번호 = new int[로또개수 + 1][6];

        if (로또개수 <= 10) {
            for (int i = 0; i < 로또개수 + 1; i++) {
                for (int j = 0; j < 6; j++) {
                    int 번호 = random.nextInt(45) + 1;
                    로또번호[i][j] = 번호;
                    for (int k = 0; k < j; k++) {
                        if (로또번호[i][j] == 로또번호[i][k]) {
                            j--;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 로또번호.length; i++) {
            int[] 정렬배열 = 로또번호[i];
            Arrays.sort(정렬배열);
            로또번호[i] = 정렬배열;
        }

        for (int i = 0; i < 로또번호.length - 1; i++) {
            int[] 내로또 = 로또번호[i];
            System.out.printf(행문자[i]+"\t");
            for (int j = 0; j < 6; j++) {
                if (j != 5) {
                    System.out.print(String.format("%02d,", 내로또[j]));
                } else {
                    System.out.print(String.format("%02d", 내로또[j]));
                }
            }
            System.out.println();
        }
        System.out.println();

        // 로또 발표
        System.out.println("[로또 발표]");
        int[] 당첨번호 = 로또번호[로또개수];
        System.out.printf("\t");
        for (int i = 0; i < 6; i++) {
            if (i != 5) {
                System.out.print(String.format("%02d,", 당첨번호[i]));
            } else {
                System.out.print(String.format("%02d", 당첨번호[i]));
            }
        }
        System.out.println();
        System.out.println();

        // 로또 번호 확인하기
        int[] 당첨 = 로또번호[로또개수];
        System.out.println("[내 로또 결과]");
        for (int i = 0; i < 로또개수; i++) {
            System.out.printf(행문자[i]+"\t");
            int 일치개수 = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (로또번호[i][j] == 당첨[k]) {
                        일치개수++;
                    }
                }
                if (j != 5) {
                    System.out.print(String.format("%02d,", 로또번호[i][j]));
                } else {
                    System.out.print(String.format("%02d", 로또번호[i][j]));
                    System.out.printf(" => %d개 일치\n", 일치개수);
                }
            }
        }
    }
}
