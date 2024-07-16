package classesAndObjects;
import java.util.Scanner;

class Book {
	String title;
	String author;
	float price;
	boolean technical;
	public static void displayBooks(Book b[], int n) {
		for(int j=0; j < n; j++) {
			System.out.println("book title: " + b[j].title);
			System.out.println("book author: " + b[j].author);
			System.out.println("book price: " + b[j].price);
			System.out.println("Discounted price: " + Discount.finalAmount(b[j]));
			System.out.println("technical : " + b[j].technical);
		}
	}
}

class Discount{
	public static float finalAmount(Book b) {
		if(b.technical == true)
			return b.price - b.price / 20;
		return b.price - b.price / 10;
		
	}
}

public class bookPrice {
	final static int SIZE = 5;
	
	public static void main(String[] args){
		int choice;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[SIZE];
		while(true) {
			System.out.println("Enter 1 to continue\nEnter 0 to exit\nEnter your choice:");
			choice = sc.nextInt();
			if(choice == 0) break;
			b[i] = new Book();
			System.out.println("Enter book " + (i+1));
			System.out.println("Enter book title: ");
			b[i].title = sc.next();
			System.out.println("Enter book author: ");
			b[i].author = sc.next();
			System.out.println("Book is technical or  not?");
			b[i].technical = sc.nextBoolean();
			System.out.println("Enter book price: ");
			b[i].price = sc.nextFloat();	
			i++;
		}
	    Book.displayBooks(b, i);
	}
}
	
