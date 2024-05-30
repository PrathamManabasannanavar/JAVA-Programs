import java.io.*;
import java.net.*;

class clientServer1{
    public static void main(String[] args) {
        // server
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("hello user");
            ss.close();
        }
        catch(Exception e){
            System.out.println("in catch");
        }
    }
}