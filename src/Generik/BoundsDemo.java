package Generik;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(nums);
        double v = iOb.average();
        System.out.println("iOb average is: " + v);
        System.out.println();

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is: " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<Float>(fnums);
        double x = fOb.average();
        System.out.println("fOb average is: " + x);

        if(iOb.sumAvg(dOb)) {
            System.out.println("Average are the same");
        }
        else {
            System.out.println("Averages differ");
        }


    }
}
