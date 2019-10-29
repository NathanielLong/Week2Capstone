package co.grandcircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import composition.Person;

public class MainApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput;
		char userInput2 = 'n';
		char userReply;
		ArrayList<Task> mainList = new ArrayList<>();
		System.out.println("Welcome to the Task Manager!");
		do {
			System.out.println("1. List Tasks\n2. Add Task\n3. Delete Task\n4. Mark Task Complete\n5. Quit");
			System.out.println("\nWhat would you like to do: ");
			userInput = scnr.nextInt();
			scnr.nextLine();
			switch (userInput) {

			// this is for if they decide to ask for their list of tasks
			case 1:
				for (Task pTemp : mainList) {
					System.out.println(pTemp);
				}
				break;

			// this is for when they want to add a task
			case 2:
				System.out.println("Please enter the team members name: ");
				String memberName = scnr.nextLine();
				System.out.println("Please enter a description of the task: ");
				String taskDescription = scnr.nextLine();
				String dueDate = Validator.getStringMatchingRegex(scnr,
						"Please enter the due date of the task (dd/mm/yyyy): ", "\\d{0,2}\\/\\d{0,2}\\/\\d{0,4}");
				mainList.add(new Task(memberName, taskDescription, dueDate));
				break;

			// this is for when people want to delete a task
			case 3:

				for (Task pTemp : mainList) {
					System.out.println(pTemp);
				}
				int userDelete = Validator.getInt(scnr,
						"Please enter a number corresponding to the position of the task you would like to delete: ");
				System.out.println("Are you sure you want to delete this task? (y/n): ");
				userReply = scnr.next().charAt(0);
				if (userReply == 'y') {
					try {
					mainList.remove(userDelete + 1);
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Please enter a number corresponding to the position of the task...");
					}

				}

				break;

			// this is for when they have considered a task completed
			case 4:
				try {
					for (Task pTemp : mainList) {
						System.out.println(pTemp);
					}
					userDelete = Validator.getInt(scnr,
							"Please enter a number corresponding to the position of the task that has been completed: ");

					mainList.remove(userDelete + 1);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Please enter a number correponding to the position of the task...");
				}
				System.out.println("Task has been completed and will be removed from the list!");
				break;

			// this is for when they want to quit out of the application
			case 5:
				userReply = 'n';
				break;

			default:
				System.out.println("Please enter a value between 1-5 to use the menu: ");

			}
			System.out.println("Would you like to continue? (y/n) ");
			userReply = scnr.next().charAt(0);
		} while (userReply == 'y');
		System.out.println("Good-Bye!");
	}

}
