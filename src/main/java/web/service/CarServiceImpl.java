package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "calina", 9));
        cars.add(new Car(1, "granta", 11));
        cars.add(new Car(1, "priora", 7));
        cars.add(new Car(1, "volga", 30));
        cars.add(new Car(1, "chaika", 35));
    }

    public List<Car> getCar(Integer count) {
        List<Car> list = new ArrayList<>();
        if(count!= null && count >=1 && count <= 4){
            for(int i = 0; i < count; i++) {
                list.add(cars.get(i));
            }
        }else{
            list = cars;
            }
        return list;
    }

}
