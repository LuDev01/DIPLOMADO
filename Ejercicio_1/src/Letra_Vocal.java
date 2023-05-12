import javax.swing.*;
public class Letra_Vocal
{
    public static void main(String[] args) {
        String letra=JOptionPane.showInputDialog("Ingresa la letra: ");

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            JOptionPane.showMessageDialog(null, "La letra que ingresaste es una vocal");
        }
        else{
            JOptionPane.showMessageDialog(null,"La letra que ingresaste no es vocal");
        }
    }
}
