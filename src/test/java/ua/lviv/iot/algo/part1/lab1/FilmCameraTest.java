package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmCameraTest {
    FilmCamera filmCamera = new FilmCamera();
    FilmCamera camera = new FilmCamera(filmCamera.getBrand(), filmCamera.getModel(), filmCamera.getLens(), filmCamera.getFilmType(), filmCamera.getFilmISO());


    @Test
    public void superTest(){
        filmCamera.setBrand("samsung");
        assertEquals("samsung", filmCamera.getBrand());
        filmCamera.setModel("fr-24");
        assertEquals("fr-24",filmCamera.getModel());
        filmCamera.setLens(4);
        assertEquals(4,filmCamera.getLens());
    }

    @Test
    public void takePhotoTest(){
       filmCamera.setFilmType("dj");
       filmCamera.setFilmISO(45);
       filmCamera.takePhoto();
       assertEquals("dj", filmCamera.getFilmType());
       assertEquals(45,filmCamera.getFilmISO());
    }
}