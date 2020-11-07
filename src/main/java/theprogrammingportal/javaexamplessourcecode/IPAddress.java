package theprogrammingportal.javaexamplessourcecode;

/**
 *
 * @author TheProgrammingPortal
 */
import java.net.InetAddress;

public class IPAddress {

    public static void main(String[] args) {

        try {

            // get IP address and hostname for local system
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println(myIP);
            System.out.println(myIP.getHostName());
            System.out.println(myIP.getHostAddress());

            System.out.println("=======================");

            // get IP address and hostname for website
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip);
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
