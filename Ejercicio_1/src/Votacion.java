import javax.swing.*;
public class Votacion {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Ingresa tu nombre:");
        Integer age= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

        if (name.equals("Luisa") && age>=18){
            JOptionPane.showMessageDialog(null,name+ " Eres jurado de votación");
        }
        else if (name.equals("Luisa") || !name.equals("Luisa") && age<18){
            JOptionPane.showMessageDialog(null, " No puedes votar");
        }
        else if (!name.equals("Luisa") && age>=18 && age<=25 ){
            JOptionPane.showMessageDialog(null," Tu mesa de votación es la #1 ");
        }
        else if (!name.equals("Luisa")  && age>=26 && age<=35 ){
            JOptionPane.showMessageDialog(null," Tu mesa de votación es la #2 ");
        }
        else{
            JOptionPane.showMessageDialog(null," Tu mesa de votación es la #3");
        }
    }
}