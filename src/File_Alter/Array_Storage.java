package File_Alter;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Storage {
    public ArrayList<String> Task=new ArrayList<>();
    public ArrayList<String> Duedate=new ArrayList<>();
    public ArrayList<String> Status=new ArrayList<>();
    public ArrayList<String> Description=new ArrayList<>();


    public void rty(){
        Task.ensureCapacity(999);
        Duedate.ensureCapacity(999);
        Status.ensureCapacity(999);
        Description.ensureCapacity(999);
    }
    //select array
    public void selector(){
        Scanner in=new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        System.out.println("Which set of arrays would you like to alter?");
        int select=in.nextInt();
        System.out.println("Which value do you want changed?");
        System.out.println("task: " +Task.get(select));
        System.out.println("Due Date: " +Duedate.get(select));
        System.out.println("Status: " +Status.get(select));
        System.out.println("Description: " +Description.get(select));
        String choose=in2.nextLine().toLowerCase();
        switch (choose){
        case "task","t":
            System.out.println("Enter new Value: ");
            Task.set(select, in2.nextLine());
            break;
        case "due date","due","d":
            System.out.println("Enter new Value: ");
            Duedate.set(select, in2.nextLine());
            break;
        case "status","s":
            System.out.println("Enter new Value: 1=To be Done, 2=in Progress 3=Complete");
            int option=in.nextInt();
            switch (option){
                case 1:
                    Status.add(select,"To be Done");
                    break;
                case 2:
                    Status.add(select,"In Progress");
                    break;
                case 3:
                    Status.add(select,"Complete");
                    break;
            }

            break;
        case "description","de":
            System.out.println("Enter new Value: ");
            Description.set(select, in2.nextLine());
            break;
    }
}
public void mark(){
        Scanner in =new Scanner(System.in);
        System.out.println("How would you like to make this task? 1=To be Done, 2=in Progress 3=Complete");
        int choose=in.nextInt();
        switch (choose){
            case 1:
                Status.add("To be Done");
                break;
            case 2:
                Status.add("In Progress");
                break;
            case 3:
                Status.add("Complete");
                break;
        }
}
}
