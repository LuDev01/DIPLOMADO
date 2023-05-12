import javax.swing.*;
public class Pregunta_Trabajo {
    public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog("Estás trabajando? ");


        if (resp.equals("Si") ) {
            String resp1 = JOptionPane.showInputDialog("Tienes café? ");
            if (resp1.equals("Si")){
                JOptionPane.showMessageDialog(null, "Tomate un tintico");
            }
            else {
                JOptionPane.showMessageDialog(null, "Vete a dormir");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Vete a dormir ");
        }
        }
    }

