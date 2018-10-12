package common;

public class Car {
  int oilAmount;

  public Car(int oilAmount) {
    this.oilAmount = oilAmount;
  }

  public String displayInfo() {
    return "燃料の残量:" + String.valueOf(oilAmount);
  }

  public Double calcTravelableDistance() {
    return Math.floor(oilAmount / 10.0);
  }
}
