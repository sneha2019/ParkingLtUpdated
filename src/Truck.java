    public class Truck implements Parkable{

        private String name;

        public Truck ( String name)
        {
            this.name = name;
        }
        @Override
        public void park(ParkingLt parkingLt)

        {

            if (parkingLt.addVehicle())

                System.out.println ( "Truck " + this.name + " is parked. No of slots available: "+ parkingLt.availability);
            else
                System.out.println ( "Truck " + this.name + " is not parked. No slots available");
        }

        @Override
        public void unpark(ParkingLt parkingLt) {

            parkingLt.removeVehicle();
            System.out.println ("Truck " + this.name + " is un parked. No of slots available: "+ parkingLt.availability);
        }
    }


