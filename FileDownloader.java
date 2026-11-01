import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloader {
    public static void main(String[] args) {
        String fileUrl = "https://www.example.com/sample.txt";
        Path destination = Paths.get("sample.txt");

        try {
            URLConnection connection = new URL(fileUrl).openConnection();

            try (InputStream input = connection.getInputStream();
                 OutputStream output = Files.newOutputStream(destination)) {
                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("File downloaded to: " + destination.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("Download failed: " + e.getMessage());
        }
    }
}
