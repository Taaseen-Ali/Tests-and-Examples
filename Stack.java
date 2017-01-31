
public class Stack {
	int stck[];
	int top;
	int size;
	int currentSize;
	
	Stack(int length) {
		stck = new int[length];
		size = length;
		currentSize = 0;
	}
	
	
	void Push(int item) {
		
		System.out.println("=======================");
		System.out.println("Pushing " + item + " to Stack");
		if ( currentSize < size ) {
			for ( int i = size - 1; i > 0; i-- ) {
				stck[i] = stck[i - 1];
			}
			stck[0] = item;
			++currentSize;
		}
		else {
			System.out.println("Stack Overflow: no changes made");	
		}
	}
	
	int Pull() {
		
		System.out.println("=======================");
		System.out.println("Pulling out First Value from Stack:");
		if ( currentSize <= 0 ) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int pullVal = stck[0];
			for ( int i = 0; i < size; i++) {
				if ( i == (size - 1)) stck[i] = 0;
				else stck[i] = stck[i + 1];
			}
			
			--currentSize;
			System.out.println(pullVal);
			return pullVal;
		}
	}
	
	void ShowContent() {
		
		System.out.println("=======================");
		System.out.println("Current Size: " + currentSize + " Current Stack:");
		for ( int item : stck ) {
			System.out.println(item);
		}
	}
}


