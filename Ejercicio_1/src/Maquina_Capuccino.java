import javax.swing.*;
public class Maquina_Capuccino {
    public static void main(String[] args) {
        for (int cap = 1; cap <= 10; cap++) {
        JOptionPane.showMessageDialog(null,"Vendiste el café número: " +cap);
        }
        JOptionPane.showMessageDialog(null, "Debe recargar la máquina");
    }
}
