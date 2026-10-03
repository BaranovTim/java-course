import java.util.Scanner;

class third_hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days_pr = 0;
        int days_us;

        do {
            System.out.println("Please enter the year");
            int year = scanner.nextInt();
            
            System.out.println("Please enter the amount of days");
            days_us = scanner.nextInt();

            if (year % 4 == 0 && year % 100 != 0) {
                days_pr = 366;
            } else {
                days_pr = 365;
            }
        } while (days_us == days_pr);
        
        if (days_us != days_pr) {
            System.out.println("Wrong, the amount of days in the year is " + days_pr);
        }
    }
}