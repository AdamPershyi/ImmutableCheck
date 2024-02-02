public class Engine {
    private double horsePower;
    private double litrage;
    private double moment;

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setLitrage(double litrage) {
        this.litrage = litrage;
    }

    public void setMoment(double moment) {
        this.moment = moment;
    }

    public Engine(double horsePower, double litrage, double moment) {
        this.horsePower = horsePower;
        this.litrage = litrage;
        this.moment = moment;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public double getLitrage() {
        return litrage;
    }

    public double getMoment() {
        return moment;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", litrage=" + litrage +
                ", moment=" + moment +
                '}';
    }

}
