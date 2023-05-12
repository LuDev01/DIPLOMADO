import javax.swing.*;
public class Switch {
    public static void main(String[] args){
        Integer cod=3;
        //Dentro del parentesis va la expresión a evaluar
        switch (cod)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Entraste a la opción 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Entraste a la opción 2");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No ingresaste ninguna opción válida");
        }
    }
}

