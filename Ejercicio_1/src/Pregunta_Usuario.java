import javax.swing.*;
public class Pregunta_Usuario {
    public static void main(String[] args) {


        String usuario = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        Integer contra = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu contraseña: "));

        if (usuario.equals("Luisa" ) && contra.equals(12345)) {
            JOptionPane.showMessageDialog(null, "Bienvenido!");
        }
        else {
            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no coinciden");
        }
    }
}
