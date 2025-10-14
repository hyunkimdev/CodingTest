import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int est = sc.nextInt();
        
        int total = hour * 60 + min + est;
        int new_hour = (total / 60) % 24;
        int new_min = total % 60;
        
        System.out.println(new_hour + " " + new_min);
    }
}