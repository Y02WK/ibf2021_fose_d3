package FileTutorial3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class FileTutorial3 {
    public static void main(String[] args) throws IOException {
        File file = Path.of("tutorials/hello.txt").toFile();
        byte[] buffer = new byte[1024];
        int size = 0;
        
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream("tutorials/hello2.txt");
        
        while (-1 != (size = is.read(buffer))) {
            os.write(buffer, 0, size);
        }

        os.flush();
        os.close();
        is.close();
    }
}
