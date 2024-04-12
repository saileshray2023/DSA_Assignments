import java.util.Scanner;
public class QH4 {
    public static void main(String[] args) {
        // Create an array of Distance objects
        Scanner sc=new Scanner(System.in);
        Distance[] distances = new Distance[5];
       for(int i=0;i<5;i++){
           System.out.println("Enter the metre,centimetre distance");
           distances[i]=new Distance(sc.nextInt(), sc.nextInt());
       }
        // Display individual distances
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Distance " + (i + 1) + ":");
            distances[i].display();
        }

        // Calculate and display the sum of distances
        Distance totalDistance = distances[0];
        for (int i = 1; i < distances.length; i++) {
            totalDistance = Distance.sum(totalDistance, distances[i]);
        }

        System.out.println("Sum of distances:");
        totalDistance.display();
    }
}
class Distance {
    private final int meters;
    private final int centimeters;

    // Parameterized constructor
    public Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    // Display method
    public void display() {
        System.out.println("Distance: " + meters + " meters " + centimeters + " centimeters");
    }

    // Sum method to add two distances
    public static Distance sum(Distance d1, Distance d2) {
        int totalMeters = d1.meters + d2.meters;
        int totalCentimeters = d1.centimeters + d2.centimeters;

        // Adjust centimeters if they exceed 100
        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters %= 100;
        }

        return new Distance(totalMeters, totalCentimeters);
    }


}

