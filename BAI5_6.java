package bt_LAB5;
import java.util.*;

class SINHVIEN {
	String MaSV;
	String hoTen;
	String lop;
	
	public SINHVIEN(String MaSV,String hoTen,String lop) {
		this.MaSV=MaSV;
		this.hoTen=hoTen;
		this.lop=lop;
	}
}
public class BAI5_6 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n;
	do {
	System.out.println("nhap so sinh vien can nhap thong tin: ");
	n=sc.nextInt();
	}while(n<0);
	Map<Integer,SINHVIEN> hm = new HashMap<Integer,SINHVIEN>();
	for(int i=0;i<n;i++) {
		System.out.printf("Nhap thong tin cua sinh vien thu %d : \n",i+1);
		if(i==0){
            sc.nextLine();}
		hm.put(i, new SINHVIEN(sc.nextLine(),sc.nextLine(),sc.nextLine()));
		}
	
	   System.out.println("Bang SinhVien:");
       for(Map.Entry<Integer, SINHVIEN> D:hm.entrySet()){
           System.out.println("ho ten:"+D.getValue().hoTen+"\t MaSV: "+D.getValue().MaSV+"\t Lop:"+D.getValue().lop);
       }
       String LOP,MASV;
       System.out.println("nhap lop muon in thong tin: ");
       LOP=sc.nextLine();
       for(Map.Entry<Integer, SINHVIEN> B:hm.entrySet()) {
    	   if(B.getValue().lop.equals(LOP)) {
    		   System.out.println("ho ten:"+B.getValue().hoTen+"\t MaSV: "+B.getValue().MaSV+"\t Lop:"+B.getValue().lop);
    	   }
       }
       
       System.out.println("nhap ma sv muon in thong tin: ");
       MASV=sc.nextLine();
       for(Map.Entry<Integer, SINHVIEN> C: hm.entrySet()) {
    	   if(C.getValue().MaSV.equals(MASV)) {
    		   System.out.println("ho ten:"+C.getValue().hoTen+"\t Lop:"+C.getValue().lop);
    	   }
       }
	}
	
}
