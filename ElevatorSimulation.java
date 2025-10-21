
import java.util.Scanner;
public class ElevatorSimulation {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		// Declare constants and variables
		final int SHUTDOWN = -1;
		int currentFloor = 1;

		// Display Heading and prompt user
		String heading = "--------------------------------------\r\n"
				+ "  Welcome to Palmer Center\r\n"
				+ "--------------------------------------\r\n";
		System.out.print(heading);
		int floorSelection = getFloorSelection(userInput);

		// outer loop while elevator is in service
		while (floorSelection != SHUTDOWN) {
			
			// simulate moving
			if (currentFloor == floorSelection) {
				System.out.println("You have arrived to " + currentFloor + ". Doors are opening.");
			} 
			else {
				System.out.println("Doors closing");
				System.out.println("Moving");
				
				//determine simulated stop
				int otherUserFloor = simulateOtherUser(currentFloor, floorSelection);
				
				//for loops to simulate elevator motion
				//Going up
				for (int i = currentFloor + 1; i < floorSelection; i++) {
					System.out.println("Ding! Floor: " + i);
					if (i == otherUserFloor) {
						System.out.println("Stopping for external request");
						System.out.println("Doors opening");
						System.out.println("Doors closing");
					}
				}
				//Going down
				for (int i = currentFloor - 1; i >= floorSelection; i--) {
					System.out.println("Ding! Floor: " + i);
					if (i == otherUserFloor) {
						System.out.println("Stopping for external request.");
						System.out.println("Doors opening.");
						System.out.println("Doors closing.");
				}
				}
				System.out.println("Ding! You have arrived to floor " + floorSelection +" Doors are opening.");
			}
			currentFloor = floorSelection;
			floorSelection = getFloorSelection(userInput);
		}
		System.out.println("Shutting down...");
		userInput.close();

	}

	//method for determining selection and handeling invalid entries
	public static int getFloorSelection(Scanner userInput) {
		int option = 0;
		System.out.print("Please Select a floor number 1-14 or insert key to shutdown: ");
		option = userInput.nextInt();

		// loop to handel invalid input
		while (option < -1 || option > 14) {
			System.out.println(option + " is not a valid entry - " + "please try again. ");
			System.out.println("Please Select a floor number 1-14 or insert key to shutdown.");
			option = userInput.nextInt();
		}
		return option;
	}
	
	//method to simulate external request
	public static int simulateOtherUser(int currentFloor, int floorSelection) {
		int otherUserFloor;
		if (currentFloor == floorSelection) {
			otherUserFloor = currentFloor; // no travel possible
		}
		else {
			int lower = Math.min(currentFloor, floorSelection);
			int upper = Math.max(currentFloor, floorSelection);
			otherUserFloor = (lower + 1) + (int) (Math.random() * (upper - lower));
		}
		return otherUserFloor;
	}
}
