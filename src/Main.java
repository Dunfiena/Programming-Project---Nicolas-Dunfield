import File_Alter.*;

import java.util.Scanner;

public class Main {
    public static boolean program=true;
    public static void main(String[] args) {

        //All the methods and base values
        File_Creator create=new File_Creator();
        File_Deleter delete=new File_Deleter();
        Array_Reader read=new Array_Reader();
        Array_Writer write=new Array_Writer();
        Array_Storage storage = new Array_Storage();
        Scanner in=new Scanner(System.in);

        //Selecting the action you want to perform
        System.out.println("What would you like to do?");
        System.out.println("For create new File enter=create"+"\n"+
                "To enter information in the file enter=write"+"\n"+
                "To remove information from the file enter=subtract"+"\n"+
                "To read all information enter=read"+"\n"+
                "To permanently delete the file enter=delete"+"\n"+
                "To review options enter=?"+"\n"+
                "To end the program enter=end");

        //choose your action and loop, so we can continue altering Files
        while(program){
        String action=in.nextLine().toLowerCase();
        switch (action){
            case "create","c":
                create.createfile();
                break;
            case "write","w":
                write.write_to_array(storage);
                break;
            case "subtract","s":
                delete.delete_selected(storage);
                break;
            case "read","r":
                read.read(storage);
                break;
            case "delete","d":
                delete.Deleter();
                break;

                //shows the options for what to do
            case"?":
                System.out.println("For create new File enter=create"+"\n"+
                        "To enter information in the file enter=write"+"\n"+
                        "To remove information from the file enter=subtract"+"\n"+
                        "To read all information enter=read"+"\n"+
                        "To permanently delete the file enter=delete"+"\n"+
                        "To review options enter=?"+"\n"+
                        "To end the program enter=end");
                break;

                //exit program
            case "end","e":
                System.out.println("Would you like to Write this to a txt file?");
                String confirm=in.nextLine().toLowerCase();
                switch(confirm){
                    case "n","no":
                        System.out.println("Have a good day!");
                        break;
                    case "y","yes":
                        write.Writer(storage);
                        System.out.println("Have a good day!");
                }
                program=false;
        }

    }
}
}