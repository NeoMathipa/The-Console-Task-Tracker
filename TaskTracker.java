import java.util.Scanner;
import java.util.ArrayList;

public class TaskTracker {
    public static void main(String[] args) {

        ArrayList<String> taskHolder = new ArrayList<>();


    //Instance of a scanner
    Scanner output = new Scanner(System.in);
   
    int choice;
    boolean running = true;

    while (running){
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

         choice = output.nextInt();

         if(choice == 1){
            System.out.print("Enter task: ");
            output.nextLine();
            String task = output.nextLine();
            taskHolder.add(task);
            System.out.println("Task added successfully!");
         } else if(choice == 2) {
            if(taskHolder.isEmpty()) {
                System.out.println("No tasks available.");
            } else {
                System.out.println("Your tasks:");
                for(int i = 0; i < taskHolder.size(); i++) {
                    System.out.println((i + 1) + ". " + taskHolder.get(i));
                }
            }
         } else if(choice == 3) {
            System.out.println("Exiting...");
            running = false;
         } else {
            System.out.println("Invalid choice. Please try again.");
         }
    }
        
    
}
}
