import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt() + 1;
        for (int i = 1; i < n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}