package bt_LAB5;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Scanner;
public class BAI5_4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n : ");
		n = sc.nextInt();
		float array[] = new float[n];
		
		for(int i=0 ;i<n;i++) {
			System.out.printf("nhap phan tu thu %d : ",i+1);
			array[i] = sc.nextFloat();
		}
		

	System.out.println("Su dung set de hien thi cac phan tu xuat hien 1 lan ");
	 HashSet<Float> setA = new HashSet<Float>();
	 HashSet<Float> setB = new HashSet<Float>();
	 HashSet<Float> setC = new HashSet<Float>();
		for(float num : array) {
			if(setA.contains(num)) {
				setB.add(num);
			}
			else {
				setA.add(num);
			}
		}
		
		for(float num : array) {
			if(!setB.contains(num)) {
				setC.add(num);
			}
		}
		System.out.println("In ra nhung phan tu chi xuat hien 1 lan trong mang ");
		System.out.println(setC);
	
	
	}
} 
