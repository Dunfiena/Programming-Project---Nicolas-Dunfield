package File_Alter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
public class Array_Writer {
    public static boolean flag = true;

    public void Writer(Array_Storage Add) {
        //This allows you to write everything to a txt file when you are done with the program
        try{
        Scanner in = new Scanner(System.in);
        System.out.println("Which file would you like to alter?");
        FileWriter file=new FileWriter(in.nextLine());
        BufferedWriter Write = new BufferedWriter(file);
            for (int i = 0; i <= Add.Task.size();) {
                Write.write("------------------------------");
                Write.write("\n");
                Write.write(Add.Task.get(i));
                Write.write("\n");
                Write.write(Add.Duedate.get(i));
                Write.write("\n");
                Write.write(Add.Status.get(i));
                Write.write("\n");
                Write.write(Add.Description.get(i));
                Write.write("\n");
                Write.write("------------------------------");
                i++;
                if(i==Add.Task.size()){
                    Write.close();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void write_to_array(Array_Storage Add) {
        //Writing and altering tasks in the array
        //Setting the flag to true at the beginning of the array allows us to use it multiple times
        //in the same session without it causing issues
        try{
        Scanner in = new Scanner(System.in);
        flag=true;
        while (flag) {
            System.out.println("To begin a task: enter 'begin'." + "\n" +
                    "To alter a task: enter 'alter" + "\n" +
                    "To end writing enter 'end'");
            String line = in.nextLine();
            switch (line) {
                case "end", "e":
                    System.out.println("What would you like to do?");
                    flag = false;
                    break;
                case "alter", "a":
                    Add.selector();
                    break;
                case "begin", "b":
                    int i=Add.Task.size();
                    System.out.println("Add Task Name");
                    Add.Task.add(i, in.nextLine());
                    System.out.println("Add a Status");
                    Add.mark();
                    System.out.println("Add a Due Date");
                    Add.Duedate.add(i, in.nextLine());
                    System.out.println("Add a description");
                    Add.Description.add(i, in.nextLine());

                    break;
            }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
