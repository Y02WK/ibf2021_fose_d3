package fileTutorial;

import java.io.File;
import java.nio.file.Path;

public class fileTutorial {
    public static void main(String[] args) {
        Path path = Path.of(
                "/Users/waikinyong/Documents/NUS_ISS/Fundamentals_of_Software_Engineering/Day_3/day3/tutorials/file.txt");
        File file = path.toFile();

        if (file.exists()) {
            System.out.println("File exists!");
            System.out.println("Length is " + file.length());
        } else {
            System.out.println("File not found!");
        }
    }
}
