import javax.swing.*;
public class Ciclo_While2 {
    public static void main(String[] args){
        Integer cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores a saludar"));
        Integer x=1;

        while (x<=cant){
            JOptionPane.showMessageDialog(null,"Hola trabajador número " +x);
            x++;
        }
        JOptionPane.showMessageDialog(null,"Hasta luego");
    }
}
