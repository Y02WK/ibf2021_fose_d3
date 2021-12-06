package fT2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class fT2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of(
                "/Users/waikinyong/Documents/NUS_ISS/Fundamentals_of_Software_Engineering/Day_3/day3/tutorials/hello.txt");

        BufferedReader reader = Files.newBufferedReader(path);
        System.out.println(reader.readLine());
    }
}
