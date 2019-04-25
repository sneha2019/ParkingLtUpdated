    //added an abstract class vehicle which implements parkable
    public class TestMain {

        public static void main(String[] args) {
            //System.out.println();
            //System.out.println("Hello World!");


            Parkable car1 = new Car("car1");

            Parkable car2 = new Car("car3");

            Parkable Jeep1 = new Truck ("Truck1");
            Parkable Jeep2 = new Truck("Truck2");
            ParkingLt parkingLt = new ParkingLt(2);

            car1.park(parkingLt);
            car2.park(parkingLt);

            Jeep1.park(parkingLt);

            car2.unpark(parkingLt);

            Jeep2.park(parkingLt);

            System.out.println();
            System.out.println ( "no of slots available: " + parkingLt.availability );
            System.out.println ("Is the parking lot full: " + parkingLt.isFull());

        }
    }


