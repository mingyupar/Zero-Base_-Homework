
import java.util.Random;
import java.util.Scanner;


public class Identification_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int random = rd.nextInt(999999);
        String 임의번호 = String.valueOf(random);

        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String 출생년도 = scanner.next();
        System.out.print("출생월을 입력해 주세요.(mm):");
        String 출생월 = scanner.next();
        System.out.print("출생일을 입력해 주세요.(dd):");
        String 출생일 = scanner.next();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String 성별 = scanner.next();

        StringBuffer sb = new StringBuffer();
        sb.append(출생년도.substring(2, 4));
        sb.append(출생월);
        sb.append(출생일);
        sb.append("-");
        if (성별.equalsIgnoreCase("M") ) {
            if (Integer.parseInt(출생년도) >= 2000) {
                성별 = "3";
            } else {
                성별 = "1";
            }
        } else if (성별.equalsIgnoreCase("F")) {
            if (Integer.parseInt(출생년도) >= 2000) {
                성별 = "4";
            } else {
                성별 = "2";
            }
        }
        sb.append(성별);
        sb.append(임의번호);
        System.out.println(sb.toString());
    }
}
