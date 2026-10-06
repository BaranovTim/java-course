import java.util.Scanner;

class sixthHw {
    public static void main(String[] args) {
        String[] products = { "Молоко", "Хлеб", "Гречневая крупа" };
        int[] prices = {50, 14, 80};

        int[] basket = new int[products.length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Список возможных товаров для покупки:");

        for (int i =0; i <= basket.length -1; i++) {
            System.out.println((i+1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        while (true) {
            System.out.println("Выберите товар и количество или введите end");

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(" ");

            int productNumber = Integer.parseInt(parts[0]);
            int quantity = Integer.parseInt(parts[1]);

            basket[productNumber - 1] += quantity;
        }

        System.out.println("Ваша корзина:");

        int total = 0;

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] > 0) {
                int productTotal = basket[i] * prices[i];

                System.out.println(products[i] + " " + basket[i] + " шт " + prices[i] + " руб/шт " + productTotal + " руб в сумме");
                total += productTotal;
            }
        }
        System.out.println("Итого: " + total + " руб");
    }
}