import javax.swing.*;
public class Usuario_While {
    public static void  main(String [] args){
        String user=JOptionPane.showInputDialog("Ingrese el usuario: ");
        Integer pass=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la contraseña: "));

       while(!user.equals("Luisa") || !pass.equals(123)){
           JOptionPane.showMessageDialog(null, "El usuario o contraseña son erroneos");
           user=JOptionPane.showInputDialog("Ingrese el usuario: ");
           pass=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la contraseña: "));

       }
        JOptionPane.showMessageDialog(null,"Bienvenida!");
    }

}
