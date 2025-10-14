import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else { // y < 0 
                System.out.println(4);
            }
        } else { // x < 0
            if (y > 0) {
                System.out.println(2);
            } else { // y < 0 
                System.out.println(3);
            }
        }
    }
}