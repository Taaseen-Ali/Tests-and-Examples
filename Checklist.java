import java.util.*;


public class Checklist {
	List<ChecklistItem> itemlist = new ArrayList<ChecklistItem>();
	
	Checklist(int length, String ...names) {
		for(String item : names) {
			itemlist.add(new ChecklistItem(item));
			
		}
	}
	
	void display(boolean show) {
		for(ChecklistItem item : itemlist) {
			System.out.print((itemlist.indexOf(item) + 1) + ") ");
			System.out.println(item.get());
			if(show == true && item.getDescription() != null) {
				System.out.println("    -- " + item.getDescription() + " --");
				System.out.println(" ");
			}
		}
	}
	
	void setupDesc(int num, String description) {
		ChecklistItem item = itemlist.get(num - 1);
		item.setDescription(description);
	}
	
	void send(int number) {
		ChecklistItem task = itemlist.get(number);
		if(task.done == 0) task.done = 1;
		else task.done = 0;
	}
	
	void displayDone() {
		for(ChecklistItem item : itemlist) {
			if(item.done == 1) {
				System.out.print((itemlist.indexOf(item) + 1) + ") ");
				System.out.println(item.get());
			}
		}
	}
	
	void displayNotDone() {
		for(ChecklistItem item : itemlist) {
			if(item.done == 0) {
				System.out.print((itemlist.indexOf(item) + 1) + ") ");
				System.out.println(item.get());
			}
		}	
	}
	
	int allDone() {
		int numDone = 0;
		for(ChecklistItem item : itemlist) {
			if(item.done == 1) numDone++;
		}
		
		if(numDone == itemlist.size()) {
			System.out.println("All tasks complete? y/n:");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if("y".equals(input)) {
				return 1;
	
			}
			
			else return 0;
		}
		
		else return 0;
	}
	
	
}
