import java.util.Scanner;

public class ChecklistRun {
	public static void main(String args[]) {
		boolean showval = true;
		boolean setup = true;
		boolean running = true;
		Scanner scanner = new Scanner(System.in);
		Checklist checklist1 = new Checklist(6, "Computer Science", "Math", "Chemistry", "AP World", "Spanish", "Euro. Literature");
		
		while(setup) {
			System.out.println("Set Descriptions? y/n:");
			int itemNum;

			String descInput = scanner.nextLine();
			
			if("y".equals(descInput)) {
				checklist1.display(showval);
				System.out.println("Choose item:");
				itemNum = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.println("Enter Description: ");
				descInput = scanner.nextLine();
				System.out.println("=========================");
				
				checklist1.setupDesc(itemNum, descInput);
			}
			else setup = false;
		}
		
		while(running) {
			if(checklist1.allDone() == 1) {
				System.out.println("###########################################");
				System.out.println("Good work! Nothing left to do for today.");
				System.out.println("###########################################");
				running = false;
			}
			
			else {
				System.out.println(" ");
				checklist1.display(showval);
				System.out.print(":");
				int input = scanner.nextInt();
				if(input == 0) {
					System.out.println("========STILL-TODO========");
					checklist1.displayNotDone();
					System.out.println("==========================");
				}
				else if(input == -1) {
					System.out.println("===========DONE===========");
					checklist1.displayDone();
					System.out.println("==========================");
				}
				else {
					checklist1.send(input - 1);
					System.out.println("==========================");
				}
			}
		}
		
	}
}
