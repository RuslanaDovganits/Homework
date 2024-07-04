package lesson28.homework28;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //Посчитать, сколько пользователь заработает с каждого вклада
    public double profitFromDeposit(Deposit deposit) {
        return ((deposit.getDepositAmount() * deposit.getPercentForDeposit()) / 100.0) * deposit.getYears();
       // return profit;
    }

    // Найти самый выгодный вклад (по наибольшему доходу от вклада)
    public double bestProfit(List<Deposit> deposits) {
        double maxtProfit = 0;
        for (Deposit deposit : deposits) {
            double profit = profitFromDeposit(deposit);
            if (profit > maxtProfit) {
                maxtProfit = profit;
            }
        }
        return maxtProfit;
    }

    // Найти среднюю прибыль с каждого вклада
    public double averageFromAllProfits(List<Deposit> deposits) {
        double totalProfit = 0;
        for (Deposit deposit : deposits) {
            totalProfit += profitFromDeposit(deposit);
        }
        return totalProfit / deposits.size();



    }

}





