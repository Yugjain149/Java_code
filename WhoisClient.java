import java.net.*;  
import java.io.*;  
public class WhoisClient {  
    public static void main(String[] args) {  
        // no arguments passed, simply return  
        if (args.length < 1)   
        return;  
        // initializing domainName with the name passed in the argument  
        String domainName = args[0];  
        // specifying the host name   
        String hostname = "whois.internic.net";  
        int port = 43;   
        try (Socket socket = new Socket(hostname, port)) {  
            // getOutputStream( ) returns the OutputStream   
            // associated with the invoking socket  
            OutputStream output = socket.getOutputStream();  
            PrintWriter writer = new PrintWriter(output, true);              
            // print the domain name  
            writer.println(domainName);  
            // getInputStream( ) returns the InputStream   
            // associated with the invoking socket  
            InputStream input = socket.getInputStream();  
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));  
            String line;  
            while ((line = reader.readLine()) != null) {  
                System.out.println(line);  
            }  
        }   
        catch (UnknownHostException ex) {  
             System.out.println("Server not found: " + ex.getMessage());  
         }   
        catch (IOException ex) {  
             System.out.println("I/O error: " + ex.getMessage());  
        }  
    }  
}  