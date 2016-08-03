package cn.com.csii.spring1;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Car {
    private String name;
    private Integer price;
    private String color;

    public Car(String name, Integer price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
