package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString (callSuper = true)

public class DigitalCamera extends Camera {

    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photoCount;

    public DigitalCamera(String brand, String model, int lens,String resolution,double zoom,String memoryCardType,int photoCount){
        super(brand, model, lens);
        this.resolution =resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photoCount = photoCount;
    }

    @Override
    public void takePhoto(){
        System.out.println("Photo with cat"+ resolution + zoom);
    }
    public double resetZoom() {
        zoom = 1;
        return zoom;
    }
    public void eraseMemory() {
        photoCount = 0;
    }
    public int savePhoto() {
        photoCount = +1;
        return photoCount;
    }
    public void changeSettings(String resolution, double zoom) {
        this.resolution = resolution;
        this.zoom = zoom;
    }
    public String getHeaders(){
        return super.getHeaders()+","+"resolution"+","+"zoom"+","+"memoryCardType"+","+"photoCount";
    }
    public String toCSV(){
        return super.toCSV() + "," + resolution + "," + zoom+ "," + memoryCardType + "," + photoCount;
    }
}