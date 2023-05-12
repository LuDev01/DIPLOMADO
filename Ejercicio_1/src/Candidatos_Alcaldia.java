import javax.swing.*;
public class Candidatos_Alcaldia {
public static void  main(String [] args) {

    Integer cont1 = 0;
    Integer cont2 = 0;
    Integer hab;

    for (hab = 1; hab <= 6; hab++) {
        String cand = JOptionPane.showInputDialog(null, "Ingrese en nombre del candidato a votar: ");
        if (cand.equals("Luisa")) {
            cont1++;
        } else {
            cont2++;
        }
    }
 if (cont1>cont2) {
        JOptionPane.showMessageDialog(null,"El ganador es Luisa con " +cont1);
    }
 else if (cont2>cont1){
        JOptionPane.showMessageDialog(null,"El ganador es Maria con " +cont2);
    }
 else{
     JOptionPane.showMessageDialog(null, "Hay un empate de: " +cont1  +cont2);
 }
}
}