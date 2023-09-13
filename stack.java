import java.util.*;
class stack_array{
	int top=-1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	void push(){
		if(top==(n-1)){
			System.out.println("stack is overflow");
		}else{
			System.out.println("enter item to push into stack");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			top=top+1;
			arr[top]=i;
			System.out.println("item inserted into stack");
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("stack is empty");
		}else{
			top=top-1;
			System.out.println("item deleted from stack");
		}
	}
	void peek(){
		if(top==-1){
			System.out.println("stack is empty");
		}else{
			System.out.println("top element of stack is  :"+arr[top]);
		}
	}
	void display(){
		if(top==-1){
			System.out.println("stack is empty");
		}else{
			System.out.println("stack elements :");
			for(int i=top;i>=0;i--){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
public class stack{
	public static void main(String args[]){
		System.out.println("enter the size of the stack");
		stack_array s=new stack_array();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do{
			System.out.println("\nstack operations");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.display");
			System.out.println("5.exit");
			ch=sc.nextInt();
			switch(ch){
				case 1:
				s.push();
				break;
				case 2:
				s.pop();
				break;
				case 3:
				s.peek();
				break;
				case 4:
				s.display();
				break;
				case 5:
				System.exit(0);
				break;
				default:
				System.out.println("invalid choice");
				break;
			}
		}while(ch!=5);
	}
}
			
		
		
		
			
		
			
		
			
			
			
	
