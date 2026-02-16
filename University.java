// import java.util.Scanner;
public class University{
public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    System.out.println("Mehran UET Jamshoro");
    System.out.println("Department of Computer Systems Engineering");
    System.out.println("List of Roll numbers of Section 2 upto 30 students");
    
    for(int i=1; i<=4; i++){
        System.out.println("Roll no. of student "+i+" is 25CS00"+(2*i));
    }

    for(int i=5; i<=30; i++){
        System.out.println("Roll no. of student "+i+" is 25CS0"+(2*i));
    }
}
}
