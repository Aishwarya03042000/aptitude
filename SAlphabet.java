import java.util.*;

class SAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
	    int mid = row/2;
		
	    for(int i=0; i<row; i++){
           for(int j=0; j<row; j++){
        
		if(j==0 && i!=0 && mid>=i || i==0 && j!=0 || mid==i ||j==row-1 && mid<i && i!=row-1 || i==row-1 && j!=row-1)
		{
        System.out.print("*  ");
		}
        else
			System.out.print("   ");
		   }
        System.out.println();
        }
    }
}	


 