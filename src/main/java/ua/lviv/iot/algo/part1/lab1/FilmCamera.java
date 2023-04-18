package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString (callSuper = true)

public class FilmCamera extends Camera{

    private String filmType;
    private int filmISO;

    public FilmCamera(String brand, String model, int lens, String filmType, int filmISO) {
        super(brand,model,lens);
        this.filmType = filmType;
        this.filmISO = filmISO;
    }
    public String getHeaders(){
        return super.getHeaders() + "," + "filmType" + "," + "filmISO";
    }
    public String toCSV(){
        return super.toCSV() + "," + filmType + "," +filmISO;
    }
    @Override
    public void takePhoto() {
        System.out.println("Photo with cat " + filmType + filmISO);
    }
}
