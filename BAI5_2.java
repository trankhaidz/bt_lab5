package bt_LAB5;
import java.util.Scanner;
import java.util.Stack;
public class BAI5_2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		Scanner sc = new Scanner(System.in);
        int n,x;
        System.out.println("nhap n: ");
      	n = sc.nextInt();
      	
      	// push n elements
      	System.out.printf("them %d so nguyen vao stack \n" ,n);
      	for(int i = 0;i<n;i++) {
      		x = sc.nextInt();
      		//push x vao stack
      		stack.push(x); 
      	}
      	//
      	System.out.println(stack);
      	System.out.println(stack.search(5));
      	int m;
      	do {
      	System.out.println("so phan tu lay ra khoi stack m =  ");
      	m = sc.nextInt();
      	}while(m<0 || m>n);
      	System.out.println();
      	for(int i=0;i<m;i++) {
      		int y = stack.pop();
      		System.out.println("phan tu lay ra khoi stack: ");
      	   	System.out.println("====>"+y);
      	}
      	System.out.println(stack);
	}

}
