import javax.swing.*;
public class Ciclo_While {
    public static void main(String[] args) {
        String ans=JOptionPane.showInputDialog("Estás trabajando?");
        while(ans.equals("Si")){
            JOptionPane.showMessageDialog(null,"Tomate un tintico");
            ans=JOptionPane.showInputDialog("Aún estás trabajando?");
        }
JOptionPane.showMessageDialog(null,"Vete a dormir");
    }
}