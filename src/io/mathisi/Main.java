package io.mathisi;

public class Main {

    public static void main(String[] args) {
        Forex forex = new Forex();
        double amountInLcy = 2349.45;
        String fcy1 = "USD";
        String fcy2 = "RUB";

        String param1 = fcy1 + "]" + amountInLcy;   // "USD]2349.45"
        double amountInUSD = forex.calculate(param1);

        String param2 = fcy2 + "]" + amountInLcy;   // "RUB]2349.45"
        double amountInRUB = forex.calculate(param2);

        System.out.println("EUR " + amountInLcy + " = USD "+ amountInUSD); //EUR 2349.45 = USD 2769.3
        System.out.println("EUR " + amountInLcy + " = RUB "+ amountInRUB); //EUR 2349.45 = RUB 211409.38
    }
}
