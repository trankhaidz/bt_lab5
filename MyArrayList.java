package bt_LAB5;
import java.util.*;
public class MyArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	ArrayList<Object> list = new ArrayList<>();
	System.out.println("them 1 so nguyen vao arraylist");
	list.add(sc.nextInt());
	System.out.println("them 1 so thuc vao arraylist");
	list.add(sc.nextFloat());
	System.out.println("them 1 chuoi vào arraylist");
	sc.nextLine();
	list.add(sc.nextLine());
	System.out.println("them 1 gia tri boolean vào arraylist");
	list.add(sc.nextBoolean());
	
	
	System.out.println("gia tri vua them vao list : ");
	System.out.println(list);
	}

}
