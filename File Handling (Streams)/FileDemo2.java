import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) {
        try{
            FileWriter fwriter = new FileWriter("demo2.txt", true);
            FileReader freader = new FileReader("demo1.txt");
            int ch;
            while((ch = freader.read()) != -1){
                fwriter.write(ch);
            } 
            freader.close();
            fwriter.close();
        }
        catch(Exception e){}
    }

}
