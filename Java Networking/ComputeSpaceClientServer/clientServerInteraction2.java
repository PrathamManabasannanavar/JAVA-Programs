import java.net.*;
import java.io.*;
import java.util.Scanner;

public class clientServerInteraction2 {
    //client
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 8080);
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            System.out.println(din.readUTF());
            Scanner sc = new Scanner(System.in);
            dout.writeUTF(sc.nextLine());

            System.out.println("The no of white spaces in the String are " + din.readUTF());
            sc.close();
            s.close();            
        }
        catch(Exception e){
            System.out.println("in catch");
        }
    }
}
