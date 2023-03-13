package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Camera {
    private String model;
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photoCount;

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

    private static Camera defaultcamera = new Camera();

    public static Camera getInstance() {
        return defaultcamera;
    }

    public static void main(String[] args) {

        Camera[] cameras = {
                Camera.getInstance(),
                new Camera(),
                new Camera("Sony", "158x979", 1.8, "32gb", 70),
                Camera.getInstance()
        };
        cameras[1].changeSettings("1920x1080", 2.5);
        for (Camera camera : cameras) {
            System.out.println("Camera : " + camera);
        }
    }
}
