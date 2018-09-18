import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the file path: ");
        String filePath = reader.next();
        reader.close();
        String textExtension = filePath.substring(filePath.length()-3, filePath.length());
        Detector detector = new Detector();
        int[] jpgFirstBytes = Extension.getJpgFirstBytes();
        int[] gifFirstBytes = Extension.getGifFirstBytes();
        boolean isJpg = detector.detectFileExtension(filePath, jpgFirstBytes);
        boolean isGif = detector.detectFileExtension(filePath, gifFirstBytes);

        if (isJpg && !filePath.endsWith(".jpg")) {
            System.out.println("Extension is "+ textExtension +", while actually it's a jpg");
        } else if (isJpg) {
            System.out.println("Extension is jpg");
        } else if (isGif && !filePath.endsWith(".gif")) {
            System.out.println("Extension is "+ textExtension +", while actually it's a gif");
        } else if (isGif) {
            System.out.println("Extension is gif");
        } else if (filePath.endsWith(".txt")) {
            System.out.println("Extension is txt");
        } else {
            throw new UnsupportedExtensionException("Extension is not supported");
        }
    }
}
