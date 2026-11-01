import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClientServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5002)) {
            System.out.println("Multi-client server waiting on port 5002...");

            while (true) {
                Socket client = server.accept();

                Thread clientThread = new Thread(() -> handleClient(client));
                clientThread.start();
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    private static void handleClient(Socket client) {
        try (Socket socket = client;
             BufferedReader input = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()))) {
            String message = input.readLine();
            System.out.println(Thread.currentThread().getName()
                    + " received: " + message);
        } catch (Exception e) {
            System.out.println("Client handling error: " + e.getMessage());
        }
    }
}
