package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AskisiLocationKef9 {
    public static void main(String[] args) {
        String inputFilePath = "C:/tmp2/location.txt";
        String outputFilePath = "formatted_locations.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            // Skip the header line
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 3) {
                    String location = tokens[0].trim();
                    String latitude = tokens[1].trim();
                    String longitude = tokens[2].trim();

                    String formattedLine = String.format("{ location: '%s', latitude: %s, longitude: %s },", location, latitude, longitude);
                    writer.write(formattedLine);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}