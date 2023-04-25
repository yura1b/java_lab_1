package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

public class DigitalCamera extends Camera {
    private String resolution;
    private double zoom;
    private String memoryCardType;
    public int photoCount;

    public DigitalCamera(String brand, String model, int lens,String resolution,double zoom,String memoryCardType,int photoCount){
        super(brand, model, lens);
        this.resolution =resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photoCount = photoCount;
    }
    @Override
    public String toString(){
        return "camera model: " +getBrand() +"camera model: " +getModel() +"camera model: " +getLens() +", resolution: " +resolution +", zoom: " +zoom +", memoryCardType: " +memoryCardType+",photoCount: " +photoCount;
    }
    @Override
    public void TakePhoto(){
        System.out.println("Photo with cat"+ resolution + zoom);
    }

    public void resetZoom() {
        zoom = 1;
    }

    public void eraseMemory() {
        photoCount = 0;
    }

    public void savePhoto() {
        photoCount = +1;
    }

    public void changeSettings(String resolution, double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }

}

