import java.util.Scanner;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] a = new int[102];
        int[][] b = new int[102][102];
        int n;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean check;
            for (int i = 0; i < n - 1; i++) {
                check = false;
                for (int j = 1; j < n - i; j++) {
                    if (a[j-1] > a[j]) {
                        int c = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = c;
                        check = true;
                    }
                }
                if(check)
                    dem++;
                else
                    break;
                if (n >= 0) System.arraycopy(a, 0, b[i + 1], 0, n);

            }
            for (int i = dem; i >= 1; i--) {
                System.out.print("Buoc " + i + ": ");
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
    // test
}

