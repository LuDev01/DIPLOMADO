import javax.swing.*;
public class Area_triangulo {
public static void main (String[] args){
    Integer base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base del triángulo: "));
    Integer altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura del triángulo: "));
    Float res=base*altura/2f;

    JOptionPane.showMessageDialog( null,"El área del triángulo es: " +res);
}
}
