package ua.lviv.iot.algo.part1.lab1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CameraManager {

     List<Camera> cameras = new ArrayList<>();

        public void addCamera (Camera camera){
            this.addCamera(camera);

        }
        public List<Camera> CameraWithLensMoreThan(int lens){
            return cameras.stream().
                    filter(camera -> camera.getLens()>lens).toList();

        }
        public List<Camera> findCameraWithBrandSony(String brand){
            return cameras.stream().
                    filter(camera -> camera.getBrand() == "sony").toList();
    }


    public static void main (String[] args){
        List<Camera> cameras = new ArrayList<Camera>();
        CameraManager cameraManager = new CameraManager();
        cameras.add(new FilmCamera("Flix","sk-2",1,"full",2));
        cameras.add(new NightCamera("Canon","cm-36",11,true));
        cameras.add(new CinematicCamera("Fuji","sj-3",29,"long"));
        cameras.add(new DigitalCamera("Sony","x-28",23, "27-x",2.4, "32GB", 23));
        for(Camera camera : cameras){
            System.out.println(camera);
        }
        System.out.println("Camera with lens");
        var CameraWithLensMoreThan = cameraManager.CameraWithLensMoreThan(5);

        for (Camera camera: CameraWithLensMoreThan){
            System.out.println(camera);
        }
        System.out.println("Camera with brand Sony");
        var findCameraWithBrandSony = cameraManager.findCameraWithBrandSony("sony");

        for (Camera camera: findCameraWithBrandSony){
            System.out.println(camera);
        }

    }

}
