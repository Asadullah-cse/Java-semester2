import java.util.Scanner;
public class UserInputofUni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String UniName, DeptName;
        int qtS;
        System.out.print("Enter University name: ");
        UniName = sc.nextLine();
        System.out.print("Enter Department name: ");
        DeptName = sc.nextLine();
        System.out.print("Enter the quantity of Students in the department: ");
        qtS = sc.nextInt();

        for(int i=1; i<=4; i++){
            System.out.println("The Roll No. of student "+i+" is: 25CS00"+(2*i));
        }

        for(int i=5; i<=qtS; i++){
            System.out.println("The Roll No. of student "+i+" is: 25CS0"+(2*i));
        }
    }
}
