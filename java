import java.net.*;

public class Arp {
    public static void main(String[] args) throws SocketException, UnknownHostException {

        // Obtém o endereço IP da máquina local
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Endereço IP da máquina local: " + ip.getHostAddress());

        // Obtém a interface de rede da máquina local
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        // Obtém o MAC address da interface de rede
        byte[] mac = network.getHardwareAddress();

        System.out.print("Endereço MAC da máquina local: ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        System.out.println(sb.toString());
    }
}
