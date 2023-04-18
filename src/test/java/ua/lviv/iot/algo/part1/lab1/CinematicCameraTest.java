package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinematicCameraTest {
    CinematicCamera cinematicCamera = new CinematicCamera();
    CinematicCamera camera = new CinematicCamera(cinematicCamera.getBrand(), cinematicCamera.getModel(), cinematicCamera.getLens(), cinematicCamera.getLensType());


    @Test
    public void superTest(){
        cinematicCamera.setBrand("samsung");
        assertEquals("samsung", cinematicCamera.getBrand());
        cinematicCamera.setModel("fr-24");
        assertEquals("fr-24",cinematicCamera.getModel());
        cinematicCamera.setLens(4);
        assertEquals(4,cinematicCamera.getLens());
        cinematicCamera.setLensType("djd");
        assertEquals("djd",cinematicCamera.getLensType());
    }
    @Test
    public void takePhotoTest(){
        cinematicCamera.setLensType("wjls");
        cinematicCamera.takePhoto();
        assertEquals("wjls", cinematicCamera.getLensType());
    }
}