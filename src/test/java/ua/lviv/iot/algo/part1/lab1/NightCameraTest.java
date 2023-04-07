package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NightCameraTest {
    NightCamera nightCamera = new NightCamera();
    NightCamera camera = new NightCamera(nightCamera.getBrand(), nightCamera.getModel(), nightCamera.getLens(), nightCamera.isHasZoom());



    @Test
    void superTest(){
        nightCamera.setBrand("vision");
        assertEquals("vision", nightCamera.getBrand());
        nightCamera.setModel("ms-24");
        assertEquals("ms-24",nightCamera.getModel());
        nightCamera.setLens(3);
        assertEquals(3,nightCamera.getLens());
    }
    @Test
    void takePhotoTest(){
    nightCamera.setHasZoom(true);
    nightCamera.takePhoto();
    assertTrue(nightCamera.isHasZoom());
    }
}