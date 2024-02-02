import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Wheel> wheelList = new ArrayList<>();
        wheelList.add(new Wheel(22));
        wheelList.add(new Wheel(22));
        wheelList.add(new Wheel(18));
        wheelList.add(new Wheel(18));
        List<Wheel> wheelList1 = new ArrayList<>();
        wheelList1.add(new Wheel(5));
        wheelList1.add(new Wheel(5));
        wheelList1.add(new Wheel(10));
        wheelList1.add(new Wheel(10));
        Map<Car, List<Wheel>> carListMap = new HashMap<>();
        Car mercedes = new Car("Mercedes", "Black",2015,
                new Engine(400,6.3,555),wheelList);
        carListMap.put(mercedes, wheelList);
        List<Car> carList = new ArrayList<>();
        carList.add(mercedes);
        carList.add(mercedes.changeEngine(new Engine(11,22,11)));
        System.out.println(carList);





    }
}