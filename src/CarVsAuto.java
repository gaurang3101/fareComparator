import java.util.Scanner;

public class CarVsAuto {
    double dist;
    double fuelPrice;
    double baseFare;

    public void BhaiyaSahiPaiseBatao() {
        double fareAuto = baseFare + (dist*2);
        double costCar = (fuelPrice*dist/20) + dist;
        int comp = Double.compare(fareAuto,costCar);
        if (comp==1) System.out.println("Take the car. It will only cost "+costCar+" rupees.\nThe auto will cost you "+fareAuto+" rupees.");
        else if (comp==0) System.out.println("Take the car. It's more convenient, both costs the same i.e, "+costCar+" rupees.");
        else System.out.println("Take the auto. It's cheaper and will only cost you "+fareAuto+" rupees.\nThe car will cost you "+costCar+" rupees.");
    }

    CarVsAuto(double dist, double fuelPrice, double baseFare) {
        this.baseFare=baseFare;
        this.dist=dist;
        this.fuelPrice=fuelPrice;
    }
}

class AbPataLagiReality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance you have to travel - ");
        double distance = sc.nextDouble();
        System.out.println("Please enter current price of Fuel - ");
        double fuelCost = sc.nextDouble();
        System.out.println("Please enter the base fare for auto - ");
        double baseFare = sc.nextDouble();
        CarVsAuto cVa = new CarVsAuto(distance,fuelCost,baseFare);
        cVa.BhaiyaSahiPaiseBatao();
    }
}
