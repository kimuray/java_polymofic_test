import common.Car;
import common.SportsCar;
import common.Truck;

class Test {
  public static void main(String args[]){
    Car car = new Car(100);
    SportsCar sportsCar = new SportsCar(100);
    Truck truck = new Truck(100);

    // 継承
    // CarクラスにdisplayInfoが実装されているのでCarを継承しているSportsCarとCarはdisplayInfoをクラス内に定義しなくても使える
    System.out.println(car.displayInfo());
    System.out.println(sportsCar.displayInfo());
    System.out.println(truck.displayInfo());

    // ポリモーフィック
    // polymoficTestは引数にCarを来ることを期待している
    // SportsCarとTruckはCarを継承しているので引数として渡せる
    System.out.println(polymoficTest(car));
    System.out.println(polymoficTest(sportsCar));
    System.out.println(polymoficTest(truck));
  }

  private static String polymoficTest(Car car) {
    return "残り" + String.valueOf(car.calcTravelableDistance()) + "km";
  }
}
