import java.util.*;

class Server extends Thread{
    Thread client;

    public void setter(Thread client){
        this.client = client;
    }
    public void run(){
        try{
            System.out.println("in try");
            synchronized(this) { this.wait(); }
        }
        catch(Exception e){}
        System.out.println("Server: message is " + ServerClientThreads.message);
        System.out.println("Server: Message received");
        System.out.println(ServerClientThreads.message);
        synchronized(client){client.notifyAll();}
        System.out.println("Server: Message received");
        synchronized(client){client.notifyAll();}

    }
}

class Client extends Thread{
    Thread server;
    public void setter(Thread server){
        this.server = server;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Client: Enter your message");
        ServerClientThreads.message = sc.nextLine();
        synchronized(server) {server.notifyAll();}
        try {
            synchronized(this) { this.wait(); }
        } catch (Exception e) {}
        synchronized(server) {server.notifyAll();} //notify() doesn't work because notify() wakes one thread which not guaranteed the server Thread
        try {
            synchronized(this) { this.wait(); }
            // ServerClientThreads.message = "back to server";
        } catch (Exception e) {}
        System.out.println("Client exits");
    }
}

class ServerClientThreads{
    static String message;
    public static void main(String[] args) {
        Server s1 = new Server();
        Client c1 = new Client();

        s1.setter(c1);
        c1.setter(s1);

        s1.start();
        c1.start();

        try{
            s1.join();
            c1.join();
        }catch(Exception e){}

        System.out.println("Main thread exits");
    }
}