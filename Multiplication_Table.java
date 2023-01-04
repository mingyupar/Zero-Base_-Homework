public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.printf("%2s%n", "[구구단 출력]");
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + String.format("%2d", i * j));
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}