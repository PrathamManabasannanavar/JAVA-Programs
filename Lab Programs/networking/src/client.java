import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		try
		{
		Socket s=new Socket("localhost",8000);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		String msg=(String)din.readUTF();
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		dout.writeUTF(str);
		String result=(String)din.readUTF();
		System.out.println("REVERSE OF STRING IS"+result);
		}		
		catch(Exception io)
		{
			io.printStackTrace();
		}

	}

}
