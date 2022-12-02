package File_Alter;

import java.util.Scanner;

public class Array_Reader {

    public void read(Array_Storage call) {
        //Allows calling arrays to be displayed on screen
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("What would you like to do?" + "\n" +
                    "To read specific task enter='read'" + "\n" +
                    "To see all tasks enter='see'");
            String mode = in.nextLine();
            switch (mode) {
                //selects specific array
                case "read", "r":
                    System.out.println("What task would you lke to select? (enter task number)");
                    int select = in.nextInt();
                    System.out.println("--------------------------------");
                    System.out.println(call.Task.get(select));
                    System.out.println(call.Duedate.get(select));
                    System.out.println(call.Status.get(select));
                    System.out.println(call.Description.get(select));
                    System.out.println("--------------------------------");
                    System.out.println("\n");
                    break;
                case "see", "s":
                    //shows all arrays
                    for (int i = 0; i <= call.Task.size(); ) {
                        System.out.println("--------------------------------");
                        System.out.println(call.Task.get(i));
                        System.out.println(call.Duedate.get(i));
                        System.out.println(call.Status.get(i));
                        System.out.println(call.Description.get(i));
                        System.out.println("--------------------------------");
                        System.out.println("\n");
                        i++;
                        if (i == call.Task.size()) {
                            break;
                        }
                    }
                    break;
            }System.out.println("What would you like to do?");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
