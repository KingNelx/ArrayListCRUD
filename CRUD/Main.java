package CRUD;
import java.util.Scanner;
import java.util.ArrayList;

class CRUD{
    Scanner input = new Scanner(System.in);
    ArrayList<String>Names = new ArrayList<>();

    public void add(){
        System.out.print(" Enter name: ");
        String name = input.nextLine().toLowerCase();

        System.out.println(" Name added. ");
        Names.add(name);

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

    public void delete(){
        System.out.print(" Enter name to delete: ");
        String delete = input.nextLine().toLowerCase();
    }

    public void update(){

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
                case 1 ->{
                    s1.add();
                    break;
                }

                case 2 ->{
                    s1.read();
                    break;
                }
            }
        } while (choice != 5);
    }
}
