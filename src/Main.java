public class Main {
    public static void main(String[] args) {
        String payment;
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Кредит на сумму 1 000 000 ₽ на 1 год под 9,99 % годовых.");
        payment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽\n");

        System.out.println("Кредит на сумму 1 000 000 ₽ на 2 года под 9,99 % годовых.");
        payment = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽\n");

        System.out.println("Кредит на сумму 1 000 000 ₽ на 3 года под 9,99 % годовых.");
        payment = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж составит: " + payment + " ₽\n");
    }
}
