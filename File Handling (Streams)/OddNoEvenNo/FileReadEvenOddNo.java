//A simple Java program to copy odd and even nos in different files
import java.io.*;

class FileReadEvenNo{
    public static void main(String args[]){
        try{
            FileReader freader = new FileReader("Numbers.txt");
            FileWriter foddNo = new FileWriter("oddNos.txt");
            FileWriter fevenNo = new FileWriter("evenNos.txt");
            int no;
            while((no = freader.read()) != -1){
                if(no != ' '){
                    if((no - '0')%2 == 0){
                        // System.out.print((char)no + " ");
                        fevenNo.append((char) no + " ");
                    }
                    else{
                        foddNo.append((char) no + " ");
                    }
                }
            }
            freader.close();
            fevenNo.close();
            foddNo.close();
        }
        catch(Exception e){}
    }
}