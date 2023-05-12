import javax.swing.*;
public class Juego_Piedra_Papel_Tijera {
    public static void main(String[] args) {
        String user1 = JOptionPane.showInputDialog("Usuario 1 ingresa piedra,papel o tijera ");
        String user2 = JOptionPane.showInputDialog("Usuario 2 ingresa piedra,papel o tijera ");

        if (user1.equals("piedra") && user2.equals("tijera")) {
            JOptionPane.showMessageDialog(null, "Gana usuario 1 con piedra");
        } else if (user1.equals("tijera") && user2.equals("papel")) {
            JOptionPane.showMessageDialog(null, "Gana usuario 1 con tijera");
        } else if (user1.equals("papel") && user2.equals("piedra")) {
            JOptionPane.showMessageDialog(null, "Gana usuario 1 con papel");
        } else if (user1.equals(user2)) {
            JOptionPane.showMessageDialog(null, "Empate!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Gana el usuario 2 con " +user2);
        }
    }
}