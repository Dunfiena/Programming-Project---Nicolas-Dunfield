package File_Alter;
import java.io.File;
import java.util.Scanner;

public class File_Deleter {
    public boolean flag=true;
    public void Deleter(){
        //This is to delete a file
        Scanner in=new Scanner(System.in);

        System.out.println("Which file would you like to delete?");
        File check=new File(in.nextLine());
        System.out.println("Are you sure? (y or n)");
        String confirm=in.nextLine();
        switch (confirm){
            case "y","yes":
                check.delete();
                System.out.println("File "+check+" has been deleted");
                System.out.println("What would you like to do?");
                break;
            case "n","no":
                System.out.println("Ok, no files are deleted");
                System.out.println("What would you like to do?");
                break;
        }
    }
    public void delete_selected(Array_Storage call) {
        //this serves to delete a specific array based on the number of the array
        //Setting the flag to true at the beginning of the array allows us to use it multiple times
        //in the same session without it causing issues
        try {
            flag=true;
            while(flag) {
                Scanner in = new Scanner(System.in);
                Scanner in2 = new Scanner(System.in);
                System.out.println("Which task would you like to delete (please enter the number of the task)");
                int choose = in.nextInt();
                if (choose < call.Task.size()) {
                    call.Task.remove(choose);
                    call.Status.remove(choose);
                    call.Duedate.remove(choose);
                    call.Description.remove(choose);
                    System.out.println("Task has been removed.  Would you like to choose another?");
                    String ack = in2.nextLine().toLowerCase();
                    switch (ack) {
                        case "n", "no":
                            flag = false;
                            System.out.println("What would you like to do?");
                            break;
                        case "y", "yes":
                            break;
                    }
                } else {
                    System.out.println("That is not an available task.  Would you like to choose another?");
                    String ack = in2.nextLine().toLowerCase();
                    switch (ack) {
                        case "n", "no":
                            System.out.println("What would you like to do?");
                            flag = false;
                            break;
                        case "y", "yes":
                            break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

