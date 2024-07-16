package classesAndObjects;
import java.util.Scanner;
class StacksImp{
	int SIZE;
	int top = -1;
	int stk[];
	
	public StacksImp(int SIZE, int stk[]){
		this.SIZE = SIZE;
		this.stk = stk;
	}
	public void push(int ele) {
		if(top == SIZE-1) {
			System.out.println("stack overflow");
			return;
		}
		stk[++top] = ele;
	}
	public int pop() {
		if(top == -1) return -1;	
		return stk[top--];
	}
	public void display() {
		if(top == -1) return;
		System.out.println("Elements are:");
		for(int i=top; i>=0; i--)
			System.out.print(stk[i] + " ");
		System.out.println();
	}
}

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksImp s = new StacksImp(3, new int[3]);
		while(true) {
			System.out.println("Enter :\n1 push\n2 pop\n3 display\n4 exit");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element to be inserted");
				s.push(sc.nextInt());
				break;
			case 2:
				System.out.println(s.pop() + " popped");
				break;
			case 3:
				s.display();
				break;
			case 4:
				System.out.println("You exited");
				return;
			}
		}
	}
}
