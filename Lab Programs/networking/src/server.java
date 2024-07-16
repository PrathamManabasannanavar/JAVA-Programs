import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {
		try
		{
		System.out.println("WAITING FOR THE CLIENT");
		ServerSocket ss=new ServerSocket(8000);
		Socket s=ss.accept();
		System.out.println("CONNECTION ESTABLISHED");
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("ENTER THE STRING");
		String str=(String)din.readUTF();
		String str2=new StringBuilder(str).reverse().toString();
		dout.writeUTF(str2);
		}		
		catch(Exception io)
		{
			io.printStackTrace();
		}

	}

}
