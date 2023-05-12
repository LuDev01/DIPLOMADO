import javax.swing.*;
public class Sinosi {
    public static void main(String[] args) {
    String color= JOptionPane.showInputDialog("Ingresa un color: ");

    if(color.equals("Amarillo")){
        JOptionPane.showMessageDialog(null, "Esto es amarillo");
    }
    else if(color.equals("Azul")){
        JOptionPane.showMessageDialog(null, "Esto es azul ");
    }
    else if(color.equals("Rojo")){
        JOptionPane.showMessageDialog(null, "Esto es rojo ");
    }
    else{
        JOptionPane.showMessageDialog(null, "Ingresaste un color diferente a os de la lista de colores ");
    }
    }
}
