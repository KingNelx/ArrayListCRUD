package CRUD;
import java.util.Scanner;
import java.util.ArrayList;

class CRUD{
    Scanner input = new Scanner(System.in);
    ArrayList<String>Names = new ArrayList<>();

    public void add(){
        System.out.print(" Enter name: ");
        String name = input.nextLine().toLowerCase();

        if(name.equals("")){
            System.out.println(" Name can't add in the list.");
        }else{
            System.out.println(" Name added. ");
            Names.add(name);
        }
    }

    public void read(){
        if(Names.size() == 0){
            System.out.println(" There are no existing data in the list. ");
        }else{
            System.out.println(" List of names. ");
            for(String nameList : Names){
                System.out.println(" " + nameList);
            }
        }

    }

    public void update(){
        System.out.print(" Enter name to edit: ");
        String update = input.nextLine().toLowerCase();

        if(Names.contains(update)){
            Names.remove(update);

            System.out.print(" Enter new name: ");
            String newName = input.nextLine();
            Names.add(newName);

            System.out.println(" Update Successfully ");
        }else{
            System.out.println(" Name does not exist in the list. ");
        }
    }

    public void delete(){
        System.out.print(" Enter name to delete: ");
        String delete = input.nextLine().toLowerCase();

        if(Names.contains(delete)){
            Names.remove(delete);
            System.out.println(" Deleted Successfully ");
        }else{
            System.out.println(" Name does not exist in the list. ");
        }
    }

}

public class Main {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        Option option = new Option();
        CRUD s1 = new CRUD();
        int choice;
        do {
            option.options();
            System.out.print(" Select option: ");
            choice = input.nextInt();

            switch (choice){

                case 1 ->
                    s1.add();

                case 2 ->
                    s1.read();

                case 3 ->
                    s1.update();

                case 4 ->
                    s1.delete();

            }
        } while (choice != 5);
    }
}
