package bt_LAB5;
import java.util.*;
public class BAI5_3 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap n: ");
		n=sc.nextInt();
		
		//them n phan tu vao queue
		System.out.printf("them %d phan tu vao queue: \n",n);
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			queue.offer(x);
		}
		// xuat queue
		System.out.println("queue: "+queue);
		int m;
		do {
		System.out.println("so phan tu lay ra khoi queue m =  ");
		m=sc.nextInt();
		}while(m<0 || m>n);
		for(int i=0;i<m;i++) {
			int y = queue.poll();
			System.out.println("phan tu lay ra khoi queue: ");
      	   	System.out.println("====>"+y);
		}
		System.out.println("phan tu con lai trong queue: ");
		System.out.println(queue);
	}
}
