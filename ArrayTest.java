
public class ArrayTest {
	public static void main ( String args[] ) {
		
		int myArray[] = new int[10];
		
		for ( int x = 0; x < 10; x++ )
			myArray[x] = x;
		
		for ( int z : myArray) {
			System.out.print(myArray[z]);
			
		}
	}

}
