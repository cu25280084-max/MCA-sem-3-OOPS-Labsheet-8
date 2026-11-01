import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5001);
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {
            output.println("This is an echo test");
            System.out.println("Server replied: " + input.readLine());
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
