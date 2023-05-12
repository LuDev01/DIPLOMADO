import javax.swing.*;
public class Cuestionario {
    public static void main(String[] args) {
        Integer intento;


        for (intento = 1; intento <= 3; intento++) {
            String p1 = JOptionPane.showInputDialog("Cuál es la capital de Colombia? ");
            String p2 = JOptionPane.showInputDialog("Dónde se celebra la feria de las flores? ");
            String p3 = JOptionPane.showInputDialog("Quién es el presidente de Colombia? ");

            if (!p1.equals("Bogota") || !p2.equals("Medellin") || !p3.equals("Petro")) {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo " +intento);
            } else if (p1.equals("Bogota") && p2.equals("Medellin") && p3.equals("Petro")) {
                    JOptionPane.showMessageDialog(null, "Felicidades, ganaste!");
                    break;
            }
        }
        if (intento>=3) {
            JOptionPane.showMessageDialog(null, "No tienes más intentos, perdiste :(");
        }
    }
}

