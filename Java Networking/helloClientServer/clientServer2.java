import java.net.*;
import java.io.*; 

public class clientServer2 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1", 8080);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String value = din.readUTF();
            System.out.println(value);

            s.close();
        }
        catch(Exception e){
            System.out.println("in catch");
        }
    }
}
