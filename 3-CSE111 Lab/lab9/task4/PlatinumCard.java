package lab9.task4;

public class PlatinumCard extends CreditCard {

    public PlatinumCard(String cardNumMain, String cardAcNum) {

        super(cardNumMain, cardAcNum, 100);  
    }

    public void spendCash(int taka) {

        System.out.println("Previous Reward Points: " + rewardPoints);
        rewardPoints += (taka / 100) * 2; 
        System.out.println("Reward points after spending " + taka + " taka: " + rewardPoints);
    }
}

