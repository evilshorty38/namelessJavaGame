import java.util.Scanner;

public class Game{
    static Scanner input = new Scanner(System.in);
    public static void menu(){
        System.out.println("\nPlease enter selection");
        System.out.println("------------------------");
        System.out.println("PLAY");
        System.out.println("QUIT\n");
        System.out.print("Selection:");
        String option = input.next();
        switch (option.toLowerCase()) {
            case "play":
                break;
            case "quit":
                break;
        
            default:
                menu();
                break;
        }
    }
    public static void main(String[] args){
        menu();
    }
}