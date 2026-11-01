import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("HelloServer waiting on port 5000...");

            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(
                         new InputStreamReader(client.getInputStream()))) {
                System.out.println("Client connected");
                String message = input.readLine();
                System.out.println("Received from client: " + message);
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
