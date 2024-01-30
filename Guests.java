import java.util.Scanner;



public class Guests {
    static Scanner scanner = new Scanner(System.in);
    static String[] guests = new String[10];
    public static void main(String[] args) {

    insertTestNames();



        do {
            displayMenu();
            guests();
            int option = getOption();


            if (option == 1) {
                addGuest();
            } else if (option == 2) {
                insertGuest();
            } else if (option == 3) {
                removeGuest();
            } else if (option == 4 ) {
                renameGuest();
            } else if (option == 5) {
                System.out.println("Exiting.....");
                break;
            }
        } while (true);

    }
    public static void guests () {
        System.out.println("___________________________");
        System.out.println("- Guests -");
        System.out.println();

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println( i+1 + ". " + guests[i]);

            }
        }
        if ( guests[0] == null) {
            System.out.println("Guest list is empty.");
        }

    }
    public static void displayMenu () {
        System.out.println("______________________________");
        System.out.println("- Menu -");
        System.out.println();
        System.out.println("1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Remove Guest");
        System.out.println("4 - Rename Guest");
        System.out.println("5 - Exit");
        System.out.println();

    }
    public static int getOption () {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        return option;


    }
    public static void addGuest() {
        System.out.println("___________________________");
        System.out.println("- Add Guest -");
        System.out.println();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }
    public static void removeGuest(){
        System.out.println("___________________________");
        System.out.println("- Remove Guests -");
        System.out.println();
        System.out.print("Name: ");
        String name = scanner.next();
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && (guests[i].equals(name) || i+1 == Integer.valueOf(name))) {
                guests[i] = null;
                break;
            }


        }
        for ( int i = 0; i < 9 ; i++) {
            if (guests[i] == null) {
                guests[i] = guests[i+1];
                guests[i+1] = null;
            }

        }
    }
    public static void insertTestNames(){
        guests[0] = "Jhon";
        guests[1] = "Seeb";
        guests[2] = "Foot";
        guests[3] = "Banana";
        guests[4] = "SomeoneElse";
    }
    public static void renameGuest() {
        System.out.print("Guest Number: ");
        int guest = scanner.nextInt()-1;
        System.out.print("Name: ");
        scanner.nextLine();
        guests[guest] = scanner.nextLine();

    }
    public static void insertGuest() {
        System.out.println("Guest Number: ");
        int guest = scanner.nextInt()-1;
        System.out.println("Name: ");
        String Name = scanner.nextLine();
        for(int i = 8; i >= guest; i--  ){
            guests[i+1] = guests[i];
        }
        guests[guest] = Name;
    }

}

