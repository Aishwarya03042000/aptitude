import java.util.*;

class ZAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
	    int mid = row/2;
		
	    for(int i=1; i<=row; i++){
           for(int j=1; j<=row; j++){
        
		if(i==1 || i==row || i+j==row+1 ){
        System.out.print("*  ");
		}
        else
			System.out.print("   ");
		   }
        System.out.println();
        }
    }
}	


