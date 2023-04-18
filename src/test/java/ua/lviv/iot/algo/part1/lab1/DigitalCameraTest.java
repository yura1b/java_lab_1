package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lombok.*;



import static org.junit.jupiter.api.Assertions.*;

class DigitalCameraTest {
    DigitalCamera digitalCamera = new DigitalCamera();
    DigitalCamera camera = new DigitalCamera(digitalCamera.getBrand(), digitalCamera.getModel(),digitalCamera.getLens(),digitalCamera.getResolution(),digitalCamera.getZoom(),digitalCamera.getMemoryCardType(),digitalCamera.getPhotoCount());

    @BeforeEach
    public void setUp(){
        var digitalCamera = new DigitalCamera();
    }

    @Test
    void takePhotoTest(){
        digitalCamera.setResolution("hj-34");
        digitalCamera.setZoom(0.3);
        digitalCamera.takePhoto();
        assertEquals("hj-34", digitalCamera.getResolution());
        assertEquals(0.3,digitalCamera.getZoom());
    }

    @Test
    void resetZoomTest(){
        digitalCamera.setZoom(0.3);
        digitalCamera.resetZoom();
        assertEquals(1,digitalCamera.getZoom());
    }

    @Test
    void eraseMemoryTest(){
        digitalCamera.setPhotoCount(24);
        digitalCamera.eraseMemory();
        assertEquals(0,digitalCamera.getPhotoCount());
    }

    @Test
    void savePhotoTest(){
        digitalCamera.setPhotoCount(0);
        digitalCamera.savePhoto();
        assertEquals(1,digitalCamera.getPhotoCount());
    }
    @Test
    void changeSettingsTest(){
        digitalCamera.setResolution("vs-22");
        digitalCamera.setZoom(0.2);
        digitalCamera.changeSettings("re-k",0.3);
        assertEquals("re-k", digitalCamera.getResolution());
        assertEquals(0.3,digitalCamera.getZoom());

    }

}