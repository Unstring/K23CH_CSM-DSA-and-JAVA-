import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = scanner.nextInt();
            }
            boolean allNoTillNIsPresent = isAllNoTillNIsPresent(arr);
            System.out.println(allNoTillNIsPresent);
        }
    }

    private static boolean isAllNoTillNIsPresent(int[] arr) {
        
    }
}
