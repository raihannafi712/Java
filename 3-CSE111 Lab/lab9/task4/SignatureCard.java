package lab9.task4;

public class SignatureCard extends CreditCard {

    public SignatureCard(String cardNumMain, String cardAcNum) {

        super(cardNumMain, cardAcNum, 200);  
    }

    public void spendCash(int taka) {

        System.out.println("Previous Reward Points: " + rewardPoints);
        rewardPoints += (taka / 100) * 4;  
        System.out.println("Reward points after spending " + taka + " taka: " + rewardPoints);
    }

    public void cardDetails() {
        
        super.cardDetails();  
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}

