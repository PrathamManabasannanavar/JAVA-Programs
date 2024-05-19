
class Bye
{
    private int data;
    public int sum(int key)
    {
        data += key;
        System.out.println(data);
        return 0;
    }
     Bye(int no) //Using constructors
    {
        data = no; //setting the no
    }
}

class intro {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Bye hello = new Bye(20); //creating a object
        hello.sum(10);
    }
}

