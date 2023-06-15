package annotations.cap01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex_0 {
    public static void main(String[] args) {
        /*
         *Menor valor busca algoritmo
         * */
        Car cheapCar = null;


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lamborghini", 1000000.00));
        cars.add(new Car("Jipe",        46000.00));
        cars.add(new Car("Brasilia",    16000.00));
        cars.add(new Car("Smart",       46000.00));
        cars.add(new Car("Fusca",       17000.00));

//        for (Car car : cars) {
//            cheapCar = Objects.isNull(cheapCar) ?
//                    car : cheapCar.getValue() < car.getValue() ? cheapCar : car;
//        }

        cheapCar = mostCheapCarFunction(cars);
        System.out.println(String.format("The most cheap car is: %s %f", cheapCar.getName(), cheapCar.getValue()));
    }

    private static Car mostCheapCarFunction(List<Car> cars) {
        Car cheapCar = cars.get(0);
        for (Car car : cars) {
            cheapCar = cheapCar.getValue() < car.getValue() ? cheapCar : car;
        }
        return cheapCar;
    }
}
