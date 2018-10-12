package common;

public class Truck extends Car {
  public Truck(int oilAmount) {
    super(oilAmount);
  }

  public Double calcTravelableDistance() {
    return Math.floor(oilAmount / 4.5);
  }
}
