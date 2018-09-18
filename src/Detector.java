import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;


public class Detector {

    public boolean detectFileExtension(final String path, final int[] firstBytes) throws IOException {
        int[] actualFileBytes = new int[firstBytes.length];
        FileInputStream input = new FileInputStream(path);
        for (int i = 0; i < firstBytes.length; i ++){
            actualFileBytes[i] = input.read();
        }
        input.close();
        return Arrays.equals(actualFileBytes, firstBytes) ? true : false;
    }
}
