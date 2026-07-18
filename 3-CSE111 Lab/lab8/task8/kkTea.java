package lab8.task8;

public class kkTea extends Tea {

    public int totalTeaBagCount;
    public int teaBagWeight;
    private static int saleTotalMain = 0;
    private static int regularSales = 0;
    private static int flavouredSales = 0;

    public KKTea(int price, int totalTeaBagCount) {

        super("KK Regular Tea", price);
        this.totalTeaBagCount = totalTeaBagCount;
        this.teaBagWeight = totalTeaBagCount * 2;
    }

    public static void updateSoldStatusRegular(KKTea t) {

        if (!t.status) {

            t.status = true;
            saleTotalMain++;
            regularSales++;
        }
    }

    public static void saleTotalMain() {

        System.out.println("Total Sales: " + saleTotalMain);
        System.out.println("KK Regular Tea: " + regularSales);
        if (flavouredSales > 0) {

            System.out.println("KK Flavoured Tea: " + flavouredSales);
        }
    }

    @Override
    public void productDetail() {

        super.productDetail();
        System.out.println("teaBagWeight: " + teaBagWeight + ", Tea Bags: " + totalTeaBagCount);
    }

    public static void updateFlavouredSale() {

        saleTotalMain++;
        flavouredSales++;
    }
}
