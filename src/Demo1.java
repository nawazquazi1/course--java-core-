public class Demo1 {
    public static void main(String[] args) {
        bike b1 = new bike("on", 4, 4, 10, "on", "on");
        System.out.println(b1);


    }

}

class Vehicle_udemy {
    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String light;

    public Vehicle_udemy(String engine, int wheels, int seats, int fuelTank, String light) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.wheels = wheels;
        this.light = light;
        this.seats = seats;
    }

    public Vehicle_udemy() {

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Vehicle_udemy{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", light='" + light + '\'' +
                '}';
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }




}

class bike extends Vehicle_udemy {
    private String handel;

    public bike(String engine, int wheels, int seats, int fuelTank, String light, String handel) {
        super(engine, wheels, seats, fuelTank, light);
        this.handel = handel;
    }

    public String getHandel() {
        return handel;
    }

    @Override
    public String toString() {
        return "bike{" +
                "handel='" + handel +
                "engine='" + getEngine() + '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fuelTank=" + getFuelTank() +
                ", light='" + getLight() + '\'' +
                '}';
    }

    public void setHandel(String handel) {
        this.handel = handel;
    }
}
