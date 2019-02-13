import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 027937 on 2/12/2019.
 */
public class main {
    public static void main(String[] args) {
        String personName;
        String personEmail;
        String nameGet;
        int personOption = 4;

        Scanner name = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner option = new Scanner(System.in);
        Scanner input = new Scanner(System.in);


        HashMap<String, String> info = new HashMap<>();


        while (personOption != 0) {
            System.out.println("What would you like to do?");
            System.out.println("(1)- Add person ");
            System.out.println("(2)- Search email by name ");
            System.out.println("(3)- Display all");
            System.out.println("(0)- Exit ");

            personOption = option.nextInt();

            if (personOption == 1) {
                System.out.println("What is the person's name?");
                personName = name.nextLine();

                System.out.println("What is the person's email?");
                personEmail = email.nextLine();

                Person person = new Person(personName, personEmail);


                info.put(personName, personEmail);
            } else if (personOption == 2) {
                System.out.println("Enter a person's name to get their email.");
                nameGet= input.nextLine();
                String val = info.get(nameGet);
                System.out.println("The email is: "+ val);

            } else if (personOption == 3) {
                System.out.println(info.toString());
            }

        }
    }
}