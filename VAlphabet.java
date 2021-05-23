import java.util.*;

class VAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
	    int mid = row/2;
		
	    for(int i=0; i<row; i++){
           for(int j=0; j<row; j++){
        
		if(i==j && mid>i || i+j==row-1 && mid>=i ){
        System.out.print("*  ");
		}
        else
			System.out.print("   ");
		   }
        System.out.println();
        }
    }
}	


