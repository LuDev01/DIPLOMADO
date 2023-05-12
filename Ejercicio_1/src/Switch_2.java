import javax.swing.*;
public class Switch_2 {
    public static void main (String [] args){
        String name=JOptionPane.showInputDialog("Ingresa tu nombre: ");

        switch (name){
            case "Luisa":
                String op=JOptionPane.showInputDialog("Confrma si eres Luisa (si o no): ");
                if (op.equals("si")){
                    JOptionPane.showMessageDialog(null,"Bienvenida Luisa :)");
                }
                else{
                    JOptionPane.showMessageDialog(null,"No eres Luisa :(");
                }
                break;
            case "MariaJo":
                String op2=JOptionPane.showInputDialog("Confrma si eres MariaJo (si o no): ");
                if (op2.equals("si")){
                    JOptionPane.showMessageDialog(null,"Bienvenida MariaJo :)");
                }
                else{
                    JOptionPane.showMessageDialog(null,"No eres MariaJo :(");
                }
                break;
        }
    }
}
