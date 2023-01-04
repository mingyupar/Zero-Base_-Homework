
import java.util.Calendar;
import java.util.Scanner;


public class Calendar_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.printf("달력의 년도를 입력해 주세요.(2023):");
        int year = scanner.nextInt();
        System.out.printf("달력의 월을 입력해 주세요.(01):");
        int month = scanner.nextInt();

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(year, month - 1, 1);
        end.set(year, month, 1);
        end.add(Calendar.DATE, -1);

        START_DAY_OF_WEEK = start.get(Calendar.DAY_OF_WEEK);
        END_DAY = end.get(Calendar.DATE);
        System.out.println();
        System.out.println();
        System.out.println(String.format("[%d년 %02d월]\n일\t월\t화\t수\t목\t금\t토",year, month));

        for(int q = 1 ; q < START_DAY_OF_WEEK ; q++) {
            System.out.print("\t");
        }

        int cnt = START_DAY_OF_WEEK - 1;
        for(int q = 1 ; q <= END_DAY ; q++) {
            System.out.print(q+"\t");
            cnt ++;
            if(cnt == 7) {
                cnt = 0;
                System.out.println("\n");
            }
        }
    }
}
