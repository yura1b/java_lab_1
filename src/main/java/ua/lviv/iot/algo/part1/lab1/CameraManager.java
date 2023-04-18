package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CameraManager {

    List<Camera> cameras = new ArrayList<>();

    public void addCamera(Camera camera) {
        cameras.add(camera);
    }
    public void addCameras(List<Camera> camera){
        cameras.addAll(camera);
    }

    public List<Camera> CameraWithLensMoreThan(int lens) {
        return cameras.stream().
                filter(camera -> camera.getLens() > lens).
                collect(Collectors.toList());
    }

    public List<Camera> findCameraWithBrandSony(String brand) {
        return cameras.stream().
                filter(camera -> camera.getBrand() == brand).toList();
    }

}
