import javax.swing.*;

public class Operacion_num {
    public static void main (String[] args){
        Integer [] num={2,4,6};
        Integer [] res={2*3,4*3,6*3};

       //JOptionPane.showMessageDialog(null,"El triple de los números " + num + "es: " + res);
        JOptionPane.showMessageDialog(null,num);
        JOptionPane.showMessageDialog(null,res);
        JOptionPane.showMessageDialog(null,num[0]*3+ " "+num[1]*3+" "+num[2]*3);
    }
}
