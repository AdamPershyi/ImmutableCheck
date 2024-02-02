import java.util.List;
import java.util.Objects;

public final class Car  implements Cloneable{

    private final String carName;
    private String carColor;
    private final int carRealise;
    private  Engine engine;
    private List<Wheel> wheel;
    public Car changeColor(String color){
        return new Car(carName,color,carRealise,engine,wheel).clone();
    }
    public Car changeEngine(Engine engine)  {


        return new Car(carName,carColor,carRealise,engine,wheel).clone();
    }
    public Car changeWheel(List<Wheel> wheel) {

        return new Car(carName,carColor,carRealise,engine, (List<Wheel>) wheel).clone();
    }

    public Car(String carName, String carColor, int carRealise, Engine engine) {
        this.carName = carName;
        this.carColor = carColor;
        this.carRealise = carRealise;
        this.engine = engine;
    }
    public Car(String carName, String carColor, int carRealise, Engine engine, List<Wheel> wheel) {
        this.carName = carName;
        this.carColor = carColor;
        this.carRealise = carRealise;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarRealise() {
        return carRealise;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheel() {
        return wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carRealise == car.carRealise && Objects.equals(carName, car.carName) && Objects.equals(carColor, car.carColor) && Objects.equals(engine, car.engine) && Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carColor, carRealise, engine, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carRealise=" + carRealise +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public Car clone()  {
        return new Car(carName,carColor,carRealise,engine,wheel);
    }
}
