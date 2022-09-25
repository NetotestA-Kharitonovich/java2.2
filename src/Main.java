public class Main {
    public static void main(String[] args) {
        int userAccount = 1000;
        int bonusStep = 100;
        int uploadAccount = 5100;
        int bonus;

        if (uploadAccount >= 1000){
            bonus = uploadAccount / bonusStep;
        } else {
            bonus = 0;
        }

        int totalAccount = userAccount + uploadAccount + bonus;

        System.out.println("Вы пополнили счёт на " + uploadAccount + " рублей");
        System.out.println("Ваш бонус составил " + bonus + " рублей");
        System.out.println("Ваш баланс " + totalAccount + " рублей");


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
