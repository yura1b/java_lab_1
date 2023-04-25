package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CameraManagerTest {

    @Test
    public void addCameraToListTest() {
    CameraManager cameraManager = new CameraManager();
    cameraManager.addCameras(List.of(
            new NightCamera(),
            new DigitalCamera(),
            new CinematicCamera(),
            new FilmCamera()));
            assertEquals(4,cameraManager.getCameras().size());

    }
    @Test
    public void findCameraWithLensMoreThanTest(){
        CameraManager cameraManager = new CameraManager();
        cameraManager.addCameras(List.of(
                new NightCamera("Canon","cm-36",11,true),
                new DigitalCamera("Sony","x-28",23, "27-x",2.4, "32GB", 23),
                new CinematicCamera("Fuji","sj-3",29,"long"),
                new FilmCamera("Flix","sk-2",1,"full",2)));
        assertEquals(3,cameraManager.CameraWithLensMoreThan(5).size());

    }
    @Test
    public void findCameraWithBrand(){
        CameraManager cameraManager = new CameraManager();
        cameraManager.addCameras(List.of(
                new NightCamera("Canon","cm-36",11,true),
                new DigitalCamera("Sony","x-28",23, "27-x",2.4, "32GB", 23),
                new CinematicCamera("Fuji","sj-3",29,"long"),
                new FilmCamera("Flix","sk-2",1,"full",2)));
        assertEquals(1,cameraManager.findCameraWithBrandSony("Sony").size());

    }
}
