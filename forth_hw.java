import java.util.Scanner;

class forth_hw_main {
    

    public static double first_option(int income, int expenses) {
        double res = income * 0.06;
        return res;
    }

    public static double second_option(int income, int expenses) {
        double res = (income - expenses) * 0.15;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0, expenses = 0;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String option = scanner.next();

            if (option.equals("1")) {
                System.out.println("Введите сумму дохода:");
                income += scanner.nextInt();
            } else if (option.equals("2")) {
                System.out.println("Введите сумму расхода:");
                expenses += scanner.nextInt();


            } else if (option.equals("3")) {
                double firstOption = first_option(income, expenses);
                double secondOption = second_option(income, expenses);
                if (firstOption < secondOption) {
                    System.out.println("Мы советуем вам УСН доходы");
                    System.out.println("Ваш налог составит:" + firstOption);
                    System.out.println("Налог на другой системе: " + secondOption);
                    
                } else if (firstOption > secondOption) {
                    System.out.println("Мы советуем вам УСН доходы минус расходы");
                    System.out.println("Ваш налог составит:" + secondOption);
                    System.out.println("Налог на другой системе: " + firstOption);
                    
                } else {
                    System.out.println("Обе системы налогообложения одинаково выгодны для вас");
                }
                System.out.println("Экономия:" + Math.abs(firstOption - secondOption));
                System.out.println("");


            } else if (option.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            } else {
                System.out.println("Неверный номер операции");
            }

        
        }
    }
}