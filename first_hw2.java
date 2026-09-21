import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int income = scanner.nextInt();
        int spending = scanner.nextInt();

        int finalBalance = income - spending;
        System.out.println("Final balance: " + finalBalance);

        scanner.close();
    }
}