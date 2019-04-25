//added an abstract class vehicle which implements parkable
public abstract class Vehicle implements Parkable {

    private String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void park ( ParkingLt parkingLt)
    {

        if (parkingLt.addVehicle())

            System.out.println ( this.name + " is parked. No of slots available: "+ parkingLt.availability);
        else
            System.out.println ( this.name + " is not parked. No slots available");
    }

    @Override
    public void unpark ( ParkingLt parkingLt)
    {
        parkingLt.removeVehicle();
        System.out.println ( this.name + " is un parked. No of slots available: "+ parkingLt.availability);

    }


}