import java.util.Random;

public class Presidential_Election {
    public static void main(String[] args) {
        String[] 대선후보 = {"이재명", "윤석열", "심상정", "안철수"};
        int[] 후보별득표수 = new int[대선후보.length];
        Random random = new Random();
        int 후보자번호 = random.nextInt(4);
        double 투표진행률;
        int 누적투표수 = 0;
        String 당선인 = "";
        String 투표한후보자 = "";
        int 총투표수 = 100000;
        int 기준값 = 0;

        for (int i = 1; i <= 총투표수; i++) {
            후보자번호 = random.nextInt(4);
            후보별득표수[후보자번호]++;
            누적투표수++;
            투표진행률 = ((double) 누적투표수 / 100000) * 100;
            투표한후보자 = 대선후보[후보자번호];
            if (i % 100000 == 0) {
                System.out.println("[투표진행율]: " + String.format("%.2f", 투표진행률) + "%, " + 누적투표수 + "명 투표 => " + 투표한후보자);
                System.out.printf("[기호:1] 이재명: %.2f, (투표수: %d)\n", ((double) 후보별득표수[0] / 총투표수) * 100, 후보별득표수[0]);
                System.out.printf("[기호:2] 윤석열: %.2f, (투표수: %d)\n", ((double) 후보별득표수[1] / 총투표수) * 100, 후보별득표수[1]);
                System.out.printf("[기호:3] 심상정: %.2f, (투표수: %d)\n", ((double) 후보별득표수[2] / 총투표수) * 100, 후보별득표수[2]);
                System.out.printf("[기호:4] 안철수: %.2f, (투표수: %d)\n", ((double) 후보별득표수[3] / 총투표수) * 100, 후보별득표수[3]);
                for (int j = 0; j < 후보별득표수.length; j++) {
                    if (후보별득표수[j] > 기준값) {
                        기준값 = 후보별득표수[j];
                        당선인 = 대선후보[j];
                    }
                }
                System.out.println("[투표결과] 당선인 : " + 당선인);
            }
        }
    }
 }
