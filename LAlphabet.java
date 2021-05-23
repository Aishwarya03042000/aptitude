import java.util.*;

class LAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
	    int mid = row/2;
		
	    for(int i=0; i<row; i++){
           for(int j=0; j<row; j++){
        
		if(j==0 || i==row-1 ){
        System.out.print("* ");
		}
        else
			System.out.print("   ");
		   }
        System.out.println();
        }
    }
}	


