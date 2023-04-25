package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

public class FilmCamera extends Camera{

    private String filmType;
    private int filmISO;

    public FilmCamera(String brand, String model, int lens, String filmType, int filmISO) {
        super(brand,model,lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }

    @Override
    public String toString(){
        return "camera brand: " +getBrand() +", model: " +getModel() +", lens: " +getLens() +", filmtype: " +filmType+",filmISO: " +filmISO;
    }

    @Override
    public void TakePhoto() {
        System.out.println("Photo with cat " + filmType + filmISO);
    }

}
