import java.net.*;
public class JavaInternetAddressByName {
    public static void main(String[] args) {
        try {
            InetAddress address=InetAddress.getByName("www.google.com");
            System.out.println(address);

        }catch (UnknownHostException e) {
            System.out.println("Could not find www.google.com");

        }
    }
}