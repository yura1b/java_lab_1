package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString (callSuper = true)

public class NightCamera extends Camera{
    public boolean hasZoom;

    public NightCamera(String brand, String model, int lens,boolean hasZoom){
        super(brand,model,lens);
        this.hasZoom=hasZoom;
    }


    public String getHeaders(){
        return super.getHeaders()+","+"hasZoom";
    }

    public String toCSV(){
        return super.toCSV()+","+hasZoom;
    }

    @Override
    public void takePhoto() {
        System.out.println("photo with.."+hasZoom);
    }
}
