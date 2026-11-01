import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5001)) {
            System.out.println("EchoServer waiting on port 5001...");

            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(
                         new InputStreamReader(client.getInputStream()));
                 PrintWriter output = new PrintWriter(client.getOutputStream(), true)) {
                String message = input.readLine();
                System.out.println("Received: " + message);
                output.println(message);
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
