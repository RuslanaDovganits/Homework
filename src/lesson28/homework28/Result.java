package lesson28.homework28;

public class Result {

    private double profitFromDeposit;
    private double bestProfit;
    private double averageFromAllProfits;


    public Result(double profitFromDeposit, double bestProfit, double averageFromAllProfits) {
        this.profitFromDeposit = profitFromDeposit;
        this.bestProfit = bestProfit;
        this.averageFromAllProfits = averageFromAllProfits;
    }

    public double getProfitFromDeposit() {
        return profitFromDeposit;
    }

    public void setProfitFromDeposit(double profitFromDeposit) {
        this.profitFromDeposit = profitFromDeposit;
    }

    public double getBestProfit() {
        return bestProfit;
    }

    public void setBestProfit(double bestProfit) {
        this.bestProfit = bestProfit;
    }

    public double getAverageFromAllProfits() {
        return averageFromAllProfits;
    }

    public void setAverageFromAllProfits(double averageFromAllProfits) {
        this.averageFromAllProfits = averageFromAllProfits;
    }

    @Override
    public String toString() {
        return "Result{" +
                "profitFromDeposit=" + profitFromDeposit +
                ", bestProfit=" + bestProfit +
                ", averageFromAllProfits=" + averageFromAllProfits +
                '}';
    }
}
