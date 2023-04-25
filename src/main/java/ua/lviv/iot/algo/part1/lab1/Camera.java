package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Camera {
    private String brand;
    private String model;
    private int lens;

    public int getLens() {
        return lens;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void takePhoto();

    public String getHeaders(){
        return "brand" +","+ "model"+","+"lens";
    }

    public String toCSV(){
        return   brand +","+ model+","+lens;
    }
}
