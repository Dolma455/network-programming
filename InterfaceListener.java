import java.util.*;
import java.net.*;

public class InterfaceListener {
    public static void main(String[] args) throws SocketException{
        Enumeration<NetworkInterface> interfaces=NetworkInterface.getNetworkInterfaces();

        while(interfaces.hasMoreElements()) {
            NetworkInterface ni=interfaces.nextElement();
            System.out.println(ni);
        }
    }
    
}
