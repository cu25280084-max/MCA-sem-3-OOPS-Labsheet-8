import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MessageReceiver {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];

        try (DatagramSocket socket = new DatagramSocket(6000)) {
            System.out.println("UDP server waiting on port 6000...");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + message);
        } catch (Exception e) {
            System.out.println("Receiver error: " + e.getMessage());
        }
    }
}
