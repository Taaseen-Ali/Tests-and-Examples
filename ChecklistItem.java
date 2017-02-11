
public class ChecklistItem {
	int done = 0;
	private String task;
	String name;
	private String description;
	
	ChecklistItem(String item) {
		name = item;
	}	
	
	String get() {
		if(done == 1) task = name + "[ X ]";
		else task = name + "[ O ]";
		return task;
	}
	
	void done() {
		done = 1;
	}
	
	void undo() {
		done = 0;
	}
	
	void setDescription(String desc) {
		description = desc;
	}
	
	String getDescription() {
		return description;
	}
}

