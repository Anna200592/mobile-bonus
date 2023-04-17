public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int check = 1100;
        int bonus = check / 100;
        if (check < 1000) {
            bonus = 0;
        }

        int finalCheck = balans + check + bonus;
        System.out.println("У клиента на счету" + balans + "рублей");
        System.out.println("Сумма пополнения" + check + "рублей");
        System.out.println("Бонус равен" + bonus + "рубрей");
        System.out.println("Итоговая сумма пополнения" + finalCheck + "рублей");
    }
}
