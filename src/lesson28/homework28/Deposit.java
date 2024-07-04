package lesson28.homework28;

import java.util.Objects;

public class Deposit {
    private int depositAmount;
    private double percentForDeposit;
    private int years;

    public Deposit() {
    }

    public Deposit(int depositAmount, double percentForDeposit, int years) {
        this.depositAmount = depositAmount;
        this.percentForDeposit = percentForDeposit;
        this.years = years;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getPercentForDeposit() {
        return percentForDeposit;
    }

    public void setPercentForDeposit(double percentForDeposit) {
        this.percentForDeposit = percentForDeposit;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "depositAmount=" + depositAmount +
                ", percentForDeposit=" + percentForDeposit +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit deposit)) return false;
        return depositAmount == deposit.depositAmount && percentForDeposit == deposit.percentForDeposit && years == deposit.years;
    }

    @Override
    public int hashCode() {
        return Objects.hash(depositAmount, percentForDeposit, years);
    }
}
