import javax.swing.*;
public class Switch_Nombres {
    public static void main(String [] args){
        String name=JOptionPane.showInputDialog("Ingresa tu nombre: ");
        switch (name){
            case "Luisa":
                JOptionPane.showMessageDialog(null,"Eres admin");
                break;
            case "Carlos":
                JOptionPane.showMessageDialog(null,"Eres el jefe");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Eres invitado");
        }
    }
}
