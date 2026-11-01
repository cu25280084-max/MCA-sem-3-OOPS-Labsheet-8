import java.net.InetAddress;

public class NetworkInfo {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Host name: " + local.getHostName());
            System.out.println("IP address: " + local.getHostAddress());
        } catch (Exception e) {
            System.out.println("Unable to get network information: " + e.getMessage());
        }
    }
}
