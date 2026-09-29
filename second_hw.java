import java.util.Scanner;
import ru.netology.service.second_hw2;

class second_hw {
    public static void main(String[] args) {
        System.out.print("Hello user, please enter the price of the product ");
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        System.out.print("Please enter the weight of the product in kg ");
        int weight = scanner.nextInt();
        System.out.println("The customs fee is: " + second_hw2.calcs(price, weight) + " RUB");
    }
}
