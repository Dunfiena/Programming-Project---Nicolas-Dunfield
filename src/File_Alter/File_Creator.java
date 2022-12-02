package File_Alter;
import java.io.File;
import java.util.Scanner;

public class File_Creator {
    public boolean flag=true;
    public void createfile(){
        try {
            //Allows creation of file, and stops you from making multiple files with the same name
            Scanner in=new Scanner(System.in);
            System.out.println("Please enter the name of the file");
            File Tasks = new File(in.nextLine()+".txt");
            while(flag){
            if(Tasks.createNewFile()){
                flag=false;
                System.out.println("File created");
                System.out.println("What would you like to do?");
                break;
            }else{
                System.out.println("Name in already taken, please enter new name");
                break;
            }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
