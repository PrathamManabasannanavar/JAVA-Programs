import java.net.*;
import java.io.*;

public class clientServerInteraction1 {

    static Integer countSpaces(String str){
        Integer count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //server
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
    
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
    
            dout.writeUTF("Enter the 1 line String");
            String str = din.readUTF();
            Integer strlen = countSpaces(str);
            dout.writeUTF(strlen.toString());

            ss.close();
        }
        catch(Exception e){
            System.out.println("in catch");
        }
    }
}
