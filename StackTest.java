
public class StackTest {
	public static void main(String args[]) {
		Stack stack1 = new Stack(10);
		 
		for (int i = 1; i <= 11; i++) {
			stack1.Push(i);
			stack1.ShowContent();
		}
		
		for (int i = 0; i <= 11; i++) {
			stack1.Pull();
			stack1.ShowContent();
		}
	}
	
}