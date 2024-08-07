import javax.swing.*;

public class gui {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Your name is " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double percentage = Double.parseDouble(JOptionPane.showInputDialog("Enter your percentage: "));
        JOptionPane.showMessageDialog(null, "Your percentage is " + percentage + "%");
    }
}
