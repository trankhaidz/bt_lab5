package bt_LAB5;
import java.util.Scanner;
import java.util.ArrayList;

public class BAI5_1 {

	public static void main(String[] args) {
		int n,dem = 0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList();
		int X;
		while(n>0){
			X = n%10;
			list.add(X);
			n = n/10;
		}
		
		for( i=0;i<list.size()/2;i++) {
				if ( list.get(i) == list.get(list.size()-i-1)) {
					dem = dem+1;
				}
			}	
		if(dem >=(list.size()/2)) {
			System.out.println("la so thuan nghich");
		}	else {
			System.out.println("ko la so thuan nghich");
		}
		System.out.println(list);
	}

}
