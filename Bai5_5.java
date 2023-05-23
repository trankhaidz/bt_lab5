package bt_LAB5;
import java.util.*;

public class Bai5_5{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n;
	float A;
	do {
	System.out.println("nhap so phan tu cua mang: ");
	n = sc.nextInt();
	}while(n<0);
	float X[] = new float[n];
	
	//nhap mang so thuc X co n phan tu
	for(int i=0; i<n ;i++) {
		System.out.printf("X[%d] = ", i+1);
		X[i]=sc.nextFloat();
		}
	
	TreeSet<Float> setA = new TreeSet<Float>();
	TreeSet<Float> setB = new TreeSet<Float>();
	TreeSet<Float> setC = new TreeSet<Float>();
	for(float num : X) {
		if(setA.contains(num)) {
			setB.add(num);
		}
		else {
			setA.add(num);
		}
	}
	System.out.println(setA);
	System.out.println("-----------------------------");
	//nhap so thuc A
	System.out.println("Nhap so thuc A : ");
	A = sc.nextFloat();
	if(setA.contains(A)) {
		System.out.println("Mang X co chua A ");
	}else {
		System.out.println("Mang X khong chua A ");
		}
	
	for(float num : X) {
		if(!setB.contains(num)) {
			setC.add(num);
		}
	}
	
	Iterator<Float> D=setC.descendingIterator();
	System.out.println("In ra nhung phan tu chi xuat hien 1 lan trong mang va theo thu tu giam dan:");
    while(D.hasNext()){
        System.out.println(D.next());
    	}
	}
}