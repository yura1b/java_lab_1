package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CameraWriterTest {
    private CameraWriter writer;
    private List<Camera> cameras;
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    @BeforeEach
    public void setUp(){
        writer = new CameraWriter();
        cameras = new LinkedList<>();
        cameras.add(new  FilmCamera("Flix","sk-2",1,"full",2));
        cameras.add(new NightCamera("Canon","cm-36",11,true));
        cameras.add(new CinematicCamera("Fuji","sj-3",29,"long"));
        cameras.add(new DigitalCamera("Sony","x-28",23, "27-x",2.4, "32GB", 23));

    }
    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    void writeListOfCamerasTest() throws IOException {
        writer.writeToFile(cameras);
        File resFile = new File(RESULT_FILENAME);
        File expFile = new File(EXPECTED_FILENAME);
        byte[] bytes = Files.readAllBytes(resFile.toPath());
        String content = new String(bytes);
        Files.write(expFile.toPath(),content.getBytes());
    }

    @Test
    void compareTwoFiles()throws IOException{
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        Assertions.assertEquals(-1L,Files.mismatch(expected, actual));
    }

    @Test
    void testEmptyWrite() throws IOException {
        List<Camera> cameras = new LinkedList<>();
        writer.writeToFile(cameras);
        File file = new File(RESULT_FILENAME);
        assertFalse(file.exists());
    }

    @Test
    void writeResultFileAgainToFile() throws IOException{
        Files.createFile(Path.of(RESULT_FILENAME));
        writeListOfCamerasTest();
    }


}