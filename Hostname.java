import java.net.*;
public class Hostname {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia=InetAddress.getByName("104.21.79.8");
        System.out.println(ia.getCanonicalHostName());
    } 
}