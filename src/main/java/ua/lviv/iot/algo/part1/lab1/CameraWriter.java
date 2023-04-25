package ua.lviv.iot.algo.part1.lab1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CameraWriter {
        String defaultFileName = "result.csv";

        public String writeToFile(List<Camera> cameras) throws IOException{
//                if (new File(defaultFileName).exists()){
//                        Files.delete(Path.of(defaultFileName));
//                }

                if (cameras == null || cameras.isEmpty()){
                        return null;
                }


        try (FileWriter writer = new FileWriter(defaultFileName)){
                for(var camera : cameras){
                        writer.write(camera.getHeaders());
                        writer.write("\r\n");
                        writer.write(camera.toCSV());
                        writer.write("\r\n");

                }
        } catch (IOException e) {
        }
        return defaultFileName;
        }


}
