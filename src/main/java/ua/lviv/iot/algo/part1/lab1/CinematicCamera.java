package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString (callSuper = true)

public class CinematicCamera extends Camera{
    private String lensType;

    public CinematicCamera(String brand, String model, int lens,String lensType){

        super(brand,model,lens);
        this.lensType=lensType;
    }
    public String getHeaders(){
        return super.getHeaders()+","+"lensType";
    }
    public String toCSV(){
        return super.toCSV()+","+lensType;
    }

    @Override
    public void takePhoto() {
        System.out.println("photo for Tytanic"+lensType);
    }
}
