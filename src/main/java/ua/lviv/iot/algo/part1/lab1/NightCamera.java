package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString (callSuper = true)

public class NightCamera extends Camera{
    private boolean hasZoom;

    public NightCamera(String brand, String model, int lens,boolean hasZoom){

        super(brand,model,lens);
        this.hasZoom=hasZoom;
    }
    @Override
    public void takePhoto() {
        System.out.println("photo with.."+hasZoom);
    }
}
