public class Car {
    private final int number;
    private final String brand;

    public Car(int number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (number != car.number) return false;
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }
}
