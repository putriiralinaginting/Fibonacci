import java.util.Scanner;
public class Fibonancy{
	public static void main(String[]args){
		 Scanner scanner = new Scanner(System.in);
		 int n1=1,n2=1,n3,i,count; 
		 System.out.print("Masukkan Angka: ");// untuk memasukkan inputann angka

		 count = scanner.nextInt();
		 System.out.print(n1+" "+n2);  
		  
		 for(i=2;i<count;++i)  
		 {  
		  n3=n1+n2;  
		  System.out.print(" "+n3);  //hasil inputan 
		  n1=n2;  
		  n2=n3;  
		 }
	}
}
