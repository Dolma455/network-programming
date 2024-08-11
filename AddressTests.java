import java.net.*;

public class AddressTests {
    public static void main(String[] args) {
        try {
          
            InetAddress ipv4Address = InetAddress.getByName("192.168.0.1");
            System.out.println("192.168.0.1 is IPv" + getVersion(ipv4Address));
            
          
            InetAddress ipv6Address = InetAddress.getByName("2001:db8::ff00:42:8329");
            System.out.println("2001:db8::ff00:42:8329 is IPv" + getVersion(ipv6Address));
            
           
            InetAddress googleAddress = InetAddress.getByName("google.com");
            System.out.println("google.com is IPv" + getVersion(googleAddress));
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) return 4;
        else if (address.length == 16) return 6;
        else return -1;
    }
}
