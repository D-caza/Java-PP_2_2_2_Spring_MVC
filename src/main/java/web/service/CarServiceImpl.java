package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService {
    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Dodge", "Tomahawk", 2003));
        carList.add(new Car("Toyota", "Tundra", 1999));
        carList.add(new Car("Nissan", "Navara", 1997));
        carList.add(new Car("Mitsubishi", "Pajero", 1981));
    }

    @Override
    public List<Car> getCarList(int count) {
        return IntStream.range(0, carList.size()).filter(l -> l < count).mapToObj(carList::get).toList();
    }
}
