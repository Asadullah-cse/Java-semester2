public class Salary_Inc {
    public static void main(String[] args) {
        long salary = 50000;
        System.out.println("Salary: "+salary);
        for(int i=1; i<=5; i++){
            System.out.println("After "+i+" Years: "+(salary+i*(2000)));
        }
    }
}
