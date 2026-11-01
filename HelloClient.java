import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
            output.println("Hello Server");
            System.out.println("Message sent to server.");
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
