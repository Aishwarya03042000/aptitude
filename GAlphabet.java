import java.util.*;

class GAlphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = sc.nextInt();
	    int mid = row/2;
		
	    for(int i=0; i<row; i++){
           for(int j=0; j<row; j++){
        
		if(i==0 && mid>=j || j==0 || i==row-1 && mid>=j || mid==j && mid<=i || mid==i && mid<j ||j==row-1 &&mid<=i) 
		{
        System.out.print("* ");
		}
        else
			System.out.print("   ");
		   }
        System.out.println();
        }
    }
}	


 