package common;

public class SportsCar extends Car {
  public SportsCar(int oilAmount) {
    super(oilAmount);
  }

  public Double calcTravelableDistance() {
    return Math.floor(oilAmount / 8.0);
  }
}
