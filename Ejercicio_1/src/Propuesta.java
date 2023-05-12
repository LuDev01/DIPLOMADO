import javax.swing.*;
public class Propuesta {
    public static void main(String [] args){
        String name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        String ans=JOptionPane.showInputDialog(name+ " ¿Quieres casarte conmigo?");

        if (ans.equals("Si")){
            JOptionPane.showMessageDialog(null, "" , "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/cora.gif"));
        }
        else{
            JOptionPane.showMessageDialog(null, "" , "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/sad.gif"));
        }
    }
}