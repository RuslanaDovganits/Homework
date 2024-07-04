package lesson28.homework28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество желаемых вкладов:");
        String string = scanner.nextLine();
        int numberOfDeposits = Integer.parseInt(string);
        List<Deposit> deposits = new ArrayList<>();

        Calculator calculator = new Calculator();

        //deposits.add(scanner.nextLine());


        System.out.println("Введите желаемые вклады: ");

        for (int i = 0; i < numberOfDeposits; i++) {
            String depositLine = scanner.nextLine();
            String[] data = depositLine.split(" ");
            int depositAmount = Integer.parseInt(data[0]);
            int percentForDeposit = Integer.parseInt(data[1]);
            int years = Integer.parseInt(data[2]);

            Deposit deposit = new Deposit(depositAmount,percentForDeposit,years);

            System.out.println(calculator.profitFromDeposit(deposit));

        }

        System.out.println(calculator.averageFromAllProfits(deposits));
        System.out.println(calculator.bestProfit(deposits));




    }
}





        //r (int i = 0; i < deposits.size(); i++) {
        //  Deposit deposit = deposits.get(i);
        //  double result = calculator.profitFromDeposit(deposit);
        //  System.out.println("Доход от вклада: " + result);



    // double bestProfit = calculator.bestProfit(deposits);
    // System.out.println("Самый выгодный вклад: " + bestProfit);




