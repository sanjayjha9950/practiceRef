package problems;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hostname {

    public static void main(String args[]){
        try {
            System.out.print("I am on "+InetAddress.getLocalHost().getHostName());
        }catch (UnknownHostException e){
            System.err.print("Something went wrong : "+e);
        }
    }
}
