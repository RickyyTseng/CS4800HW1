class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print() {
        System.out.println("Ship Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
    }
}

class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Maximum Passengers: " + maxPassengers);
    }
}

class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship", "1956");
        ships[1] = new CruiseShip("CruiseShip", "2002", 6243);
        ships[2] = new CargoShip("CargoShip", "2011", 87234);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
