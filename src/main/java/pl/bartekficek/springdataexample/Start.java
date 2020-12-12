package pl.bartekficek.springdataexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public Start(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {

//        carRepo.deleteById(3L);

        Iterable<Car> allCars = carRepo.findAll();
        allCars.forEach(System.out::println);

        List<Car> yellowCars = carRepo.findAllByColor(Color.YELLOW);
        yellowCars.forEach(System.out::println);


//        Car car1 = new Car("Fiat", "125", Color.BLACK);
//        carRepo.save(car1);
//
//        Car car2 = new Car("Citroen", "Xsara", Color.RED);
//        carRepo.save(car2);
//
//        Car car3 = new Car("Peugeot", "206", Color.YELLOW);
//        carRepo.save(car3);
    }
}
