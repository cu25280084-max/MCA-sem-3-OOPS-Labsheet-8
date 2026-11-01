import java.io.PrintWriter;
import java.net.Socket;

public class MultiClient {
    public static void main(String[] args) {
        String message = args.length > 0 ? String.join(" ", args) : "Hello from client";

        try (Socket socket = new Socket("localhost", 5002);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
            output.println(message);
            System.out.println("Message sent: " + message);
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
