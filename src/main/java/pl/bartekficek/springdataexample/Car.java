package pl.bartekficek.springdataexample;

import javax.persistence.*;

@Entity
//Changing table name in db with annotation @Table
@Table(name = "MyCars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String carMake;

    @Transient
    private String model;

    @Enumerated(EnumType.STRING)
    private Color color;

    public Car(String carMake, String model, Color color) {
        this.carMake = carMake;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carMake='" + carMake + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}
