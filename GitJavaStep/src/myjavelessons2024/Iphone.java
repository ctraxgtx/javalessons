package myjavelessons2024;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Iphone iphone = (Iphone) o;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }

}

