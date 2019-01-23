
import static java.lang.Math.sqrt;
import java.util.Scanner;

    public class SoNguyenTo {



        public static boolean SoNguyenTo(int n) {

            int squareRoot = (int) sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n%i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập n = ");
            int n = scanner.nextInt();
            if(n<2){
                System.out.println("Không có số nguyên tố <2.");
            }else
            {
                System.out.println("Các số nguyên tố < "+ n + " là: ");
                System.out.print(2);
                for (int i = 3; i < n; i++) {
                    if (SoNguyenTo(i)) {
                        System.out.print(" " + i);
                    }
                }
            }
        }


    }