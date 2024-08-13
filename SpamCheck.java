import java.net.*;

public class SpamCheck {

    public static final String BLACKHOLE="spamhaus.org/sbl";
    public static void main(String[] args) throws UnknownHostException {
        for(String arg:args) {
            if(isSpammer(arg)) {
                System.out.println(arg+" appears to be spammer");
            } else {
                System.out.println(arg+" appears legitimate");
            }   
        }
    }

    private static boolean isSpammer(String args) {
        try {
            InetAddress address=InetAddress.getByName(args);
            byte[] quad=address.getAddress();
            String query=BLACKHOLE;
            for(byte octet:quad) {
                int unsignedByte=octet<0?octet+256:octet;
                query=unsignedByte+"."+query;
            }
            InetAddress.getByName(query);
            return false;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
    
}
