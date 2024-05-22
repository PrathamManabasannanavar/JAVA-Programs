import java.io.*;

class FileDemo1 {
    public static void main(String[] args) {
         File f1 = new File("demo1.txt");
        // or FileReader freader = new FileReader("demo1.txt");
        
        FileReader freader = null;
        try {
            freader = new FileReader(f1);
            int ch;
            while((ch = freader.read())!= -1){
                System.out.println((char)ch); //typecasting to character
            }
            freader.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
