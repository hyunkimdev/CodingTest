import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prize;
        int[] numbers = new int[3];
        int i = 0;
        for (i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);

        if (numbers[2] == numbers[0]) {
            prize = 10000 + numbers[0] * 1000;
        } else if (numbers[0] == numbers[1] || numbers[1] == numbers[2]) {
            prize = 1000 + numbers[1] * 100;
        } else {
            prize = numbers[2] * 100;
        }

        System.out.println(prize);
    }
}