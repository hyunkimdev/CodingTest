import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if (min >= 45) {
            min = min - 45;
        } else { //min < 45
            min = min + 15;
            if (hour >= 1) {
                hour = hour - 1;
            } else { //hour == 0
                hour = 23;
            }
        }
        System.out.println(hour + " " + min);
    }
}