public class CreditPaymentService {
    public String calculate (int sum, int period, double rate) {
        period *= 12;
        rate /= 12 * 100;
        double pow = Math.pow(1 + rate, period);
        double multiplier = rate * pow / (pow - 1);
        int result = (int) Math.round(sum * multiplier);
        return String.format("%,d", result);
    }
}