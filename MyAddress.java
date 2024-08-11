import java.net.*;
public class MyAddress {
    public static void main(String[] args) {
        try {
            InetAddress ia=InetAddress.getLocalHost();
            System.out.println(ia);
            String ip=ia.getHostAddress();
            byte[] b=ia.getAddress();
            System.out.println(b);
            System.out.println("My address is" +ip);
        } catch (Exception e) {
            System.out.println("Could not find my address");
        }
    }
}