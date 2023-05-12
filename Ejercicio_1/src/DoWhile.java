import javax.swing.*;
public class DoWhile {
    public static void  main(String [] args){
        String user= JOptionPane.showInputDialog("Ingrese el usuario: ");
        Integer pass=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la contraseña: "));

        do{
            JOptionPane.showMessageDialog(null, "El usuario o contraseña son erroneos");
            user=JOptionPane.showInputDialog("Ingrese el usuario: ");
            pass=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la contraseña: "));

        }
        while(!user.equals("Luisa") || !pass.equals(123));
        JOptionPane.showMessageDialog(null,"Bienvenida!");
    }
}
