

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

/**
 *
 * @author Chris, Cindy, Arlan, Ramond
 */
 public class app
 {
       public static void main(String[] args) 
       {
             String urlString;
             urlString = "https://www.facebook.com";
     //   InetAddress theAddress = inetAddress.getByName(new URL(urlString).getHost());
         try 
         {
             InetAddress theAddress = InetAddress.getByName(new URL(urlString).getHost());
             System.out.println(theAddress.getAddress());
             System.out.println(theAddress.getHostName());
             System.out.println(theAddress.getHostAddress());
             System.out.println(theAddress.getCanonicalHostName());
             System.out.println(theAddress.isReachable(5000));
             System.out.println(theAddress.hashCode());
       }
       catch(Exception e)
       {
  
       e.printStackTrace();

       }
  
 }
       
 }
