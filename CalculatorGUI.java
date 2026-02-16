import javax.swing.JOptionPane;

public class CalculatorGUI {
    public static void main(String[] args) {
        int a, b;
        char op='*';
        // Scanner sc = new Scanner(System.in);

        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second number: "));
        // System.out.print("Enter Operation: ");
        // op = JOptionPane.showInputDialog(null, "Enter Operation: ");
        
        if (op=='+'){
            JOptionPane.showMessageDialog(null, "The Addition is: "+(a+b));
        } 
        else if (op=='-'){
            JOptionPane.showMessageDialog(null, "The Subtraction is: "+(a-b));
        } 
        else if (op=='*'){
            JOptionPane.showMessageDialog(null, "The Multiplication is: "+(a*b));
        } 
        else if (op=='/'){
            JOptionPane.showMessageDialog(null, "The division is: "+((float)a/b));
        } 
        else {
            JOptionPane.showMessageDialog(null, "Invalid Operation");
        }
    }
}
