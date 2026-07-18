package lab8.task8;

public class kkflavouredTea extends Tea {

    public KKFlavouredTea(String flavour, int price, int teaBagCount) {

        super(price, teaBagCount);
        this.name = "KK " + flavour + " Tea";
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {

        if (!t.status) {
            
            t.status = true;
            updateFlavouredSale();
        }
    }
}
