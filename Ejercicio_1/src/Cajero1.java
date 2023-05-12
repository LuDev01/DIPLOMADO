
import javax.swing.*;
public class Cajero1 {
    public static void main(String[] args) {
        Integer card1=30000;
        Integer card2=10000;
        Integer ans=1;
        while (!ans.equals(0)) {
            ans = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO! Qué desea hacer? \n\n"
                    +"1. Consultar saldo tarjeta 1\n"
                    +"2. Consultar saldo tarjeta 2\n"
                    +"3. Transferir dinero \n"
                    +"4. Retirar dinero \n"
                    +"O. Salir \n\n"));

            switch (ans) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El saldo de la tarjeta es: " + card1);

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "El saldo de la tarjeta es: " + card2);
                    break;
                case 3:
                    Integer transf = Integer.parseInt(JOptionPane.showInputDialog("De qué tarjeta vas a transferir?"));
                    Integer valor = Integer.parseInt(JOptionPane.showInputDialog("Cuánto vas a transferir?"));

                    if (transf.equals(1) && valor > card1) {
                        JOptionPane.showMessageDialog(null, "No tienes saldo");
                    } else if (transf.equals(1) && valor < card1) {
                        card1=card1-valor;
                        card2=card2+valor;
                        JOptionPane.showMessageDialog(null,"Transferencia completada");
                    } else if (transf.equals(2) && valor > card2) {
                        JOptionPane.showMessageDialog(null, "No tienes saldo");

                    } else if (transf.equals(2) && valor < card2) {
                        card2=card2-valor;
                        card1=card1+valor;
                        JOptionPane.showMessageDialog(null,"Transferencia completada");
                    }

                    break;
                case 4:
                    Integer ret = Integer.parseInt(JOptionPane.showInputDialog("De qué tarjeta vas a retirar?"));
                    Integer valor1 = Integer.parseInt(JOptionPane.showInputDialog("Cuánto vas a retirar?"));

                    if (ret.equals(1) && valor1 > card1) {
                        JOptionPane.showMessageDialog(null, "No tienes saldo");
                    } else if (ret.equals(1) && valor1 < card1) {
                        card1=card1-valor1;
                        JOptionPane.showMessageDialog(null,"Retiro completado");
                    } else if (ret.equals(2) && valor1 > card2) {
                        JOptionPane.showMessageDialog(null, "No tienes saldo");

                    } else if (ret.equals(2) && valor1 < card2) {
                        card2=card2-valor1;

                        JOptionPane.showMessageDialog(null,"Retiro completado");
                    }
                    break;
                //            default:
                //              JOptionPane.showMessageDialog(null,"Has presionado salir");
            }
        }
    }
}



