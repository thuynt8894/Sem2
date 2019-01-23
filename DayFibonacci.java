import java.util.Scanner;
    public class DayFibonacci {

        private static int fibonacci(int n) {
            int f0 = 0, f1 = 1, fn = 1;
            if(n<0) {
                return n;
            }else if((n==0)||(n==1)) {
                fn=n;
            }else {
                for(int i=2; i<n; i++) {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                }
            }
            return fn;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập n: ");
            int n = scanner.nextInt();
            System.out.println(""+n+" số đầu tiên trong dãy Fibonacci:");
            int tong=0;
            for(int i=0; i<n; i++) {
                System.out.print((fibonacci(i))+"\t");
                tong+=fibonacci(i);
            }
            System.out.println("\nTổng dãy Fibonacii = "+tong);

        }
    }
