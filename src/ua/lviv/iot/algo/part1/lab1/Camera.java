package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
class Camera {
    private String model;
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photoCount;

    static void resetZoom () {
        double zoom = 1;
    }

    static void eraseMemory(){
        int photoCount = 0;
    }

    static void savePhoto(){
        int photoCount=+1;
    }

    static void changeSettings(){
        String resolution = "1024x768";
        double zoom = 1.5;
    }

    private static Camera defaultcamera = new Camera();
    public static Camera getInstance(){
        return defaultcamera;
    }

    @Override
    public String toString(){
        return "camera model: " +model +", resolution: " +resolution +", zoom: " +zoom +", memoryCardType: " +memoryCardType+",photoCount: " +photoCount;
    }

    public static void main ( String [] args ){
        Camera nikon = new Camera( "nikon", "188x929", 1.5 , "16gb", 40);
        nikon.resetZoom();

        Camera[]cameras = new Camera[4];
        cameras[0]=Camera.getInstance();
        cameras[1]=new Camera();
        cameras[2]=new Camera("Sony", "158x979", 1.8 , "32gb", 70);
        cameras[3]=Camera.getInstance();

        for (int i=0;i< cameras.length;i++){
            System.out.println("Camera model: "+ cameras[i].getModel()+", zoom: "+cameras[i].getZoom());
        }
        System.out.println(nikon.toString());

    }

}
