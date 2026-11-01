import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MessageSender {
    public static void main(String[] args) {
        byte[] data = "Ping".getBytes();

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(data, data.length, address, 6000);
            socket.send(packet);
            System.out.println("Ping sent to UDP port 6000.");
        } catch (Exception e) {
            System.out.println("Sender error: " + e.getMessage());
        }
    }
}
