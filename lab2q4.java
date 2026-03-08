public class lab2q4 {
    public static void main(String[] args) {
        // String name = "Asad";
        // int age = 20;
        // double marks = 85.5;
        // char grade = 'A';
        // boolean result = true;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(marks);
        // System.out.println(grade);

        int[] numbers = { 10, 20, 30 };
        for(int i:numbers){
            System.out.println("The number "+(i/10)" is: "+i);
        }
        
        class Student {
            String name;
            int age;

        public void display() {
            System.out.println("The Name of student is: "+name);
            System.out.println("The Age of student is: "+age);
            }
        }
            Student s1 = new Student();
            s1.name="Asif";
            s1.age=18;
            s1.display();
        
        }
    }


// System.out.println(result);
