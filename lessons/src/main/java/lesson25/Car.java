package lesson25;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Car {
    private Engine engine;
    private String name;
    private BigDecimal price;
//    @JsonProperty("tyres")
    private List<Tyre> tyreList;

    public Car() {
    }

    public Car(Engine engine, String name, BigDecimal price, List<Tyre> tyreList) {
        this.engine = engine;
        this.name = name;
        this.price = price;
        this.tyreList = tyreList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @JsonGetter("carName")
    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonSetter("carName")
    public void setCarName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Tyre> getTyreList() {
        return tyreList;
    }

    public void setTyreList(List<Tyre> tyreList) {
        this.tyreList = tyreList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tyreList=" + tyreList +
                '}';
    }
}
