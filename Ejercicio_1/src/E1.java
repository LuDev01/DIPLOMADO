import javax.swing.*;
public class E1 {
    public static void main(String[] args){
        String x="Saludos cordiales";
        Integer y=3;
        float z=1.5f;
        float c;
        boolean a=true;
        String name=JOptionPane.showInputDialog("Ingresa tu nombre: ");
        Integer age=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
        System.out.println("Mi primer programa en Java :D");

        //Este me sirve para imprimir texto
      /*  JOptionPane.showMessageDialog(null,x);
        JOptionPane.showMessageDialog(null,a);
        JOptionPane.showMessageDialog(null,c=y+z);*/
        JOptionPane.showMessageDialog( null,"Hola " + name+ " tienes "+ age+ " años");

    }
}
