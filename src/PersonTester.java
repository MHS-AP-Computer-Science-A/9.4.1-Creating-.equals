import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Collect input for first Person
        System.out.print("Please enter the Person's name: ");
        String name1 = scanner.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String birthday1 = scanner.nextLine();

        // Collect input for second Person
        System.out.print("Please enter the second Person's name: ");
        String name2 = scanner.nextLine();
        System.out.print("Please enter the second Person's birthday: ");
        String birthday2 = scanner.nextLine();

        // Collect input for Student
        System.out.print("Please enter the Student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String studentBirthday = scanner.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int studentGrade = scanner.nextInt();

        // Create the objects
        Person p1 = new Person(name1, birthday1);
        Person p2 = new Person(name2, birthday2);
        Student s = new Student(studentName, studentBirthday, studentGrade);

        // Test .equals to see that the parameter can be a Person or a Student
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(s): " + p1.equals(s));
        System.out.println("s.equals(p2): " + s.equals(p2));
        
    }
}
