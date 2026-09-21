public class Main {
    public static void main(String[] args) {

        // Create 3 different Vehicle objects
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Honda";
        vehicle1.model = "Civic";
        vehicle1.year = 2020;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Honda";
        vehicle2.model = "Civic";
        vehicle2.year = 2011;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Ford";
        vehicle3.model = "Mustang";
        vehicle3.year = 2010;

        // Vehicle 1
        System.out.println("Vehicle 1:");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        // Vehicle 2
        System.out.println("Vehicle 2:");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        // Vehicle 3
        System.out.println("Vehicle 3:");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}