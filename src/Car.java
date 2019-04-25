    //added an abstract class vehicle which implements parkable
    public class Car implements Parkable {

        private String name;

        public Car ( String name)
        {
            this.name = name;
        }

        @Override
        public void park ( ParkingLt parkingLt)
        {

            if (parkingLt.addVehicle())

                System.out.println ( "car " + this.name + " is parked. No of slots available: "+ parkingLt.availability);
            else
                System.out.println ( "car " + this.name + " is not parked. No slots available");
        }

        @Override
        public void unpark ( ParkingLt parkingLt)
        {
            parkingLt.removeVehicle();
            System.out.println ("car " + this.name + " is un parked. No of slots available: "+ parkingLt.availability);

        }

    }


