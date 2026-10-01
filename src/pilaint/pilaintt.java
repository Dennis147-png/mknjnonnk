package pilaint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pilaintt {
    private JPanel Ventana;
    private JTextField textDato;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton cimaButton;
    private JTextField textBuscar;
    private JButton buscarButton;
    private JTextArea textArea1;
    public PilaInt pila = new PilaInt();

     public pilaintt(){

         agregarButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Integer i = Integer.parseInt(textDato.getText());
                 pila.push(i);
             }
         });
         eliminarButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     Integer i = pila.pop();
                     JOptionPane.showMessageDialog(null, i);
                 }catch (Exception ex){
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                 }

             }
         });
         cimaButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    try {
                        Integer i = pila.peek();
                        JOptionPane.showMessageDialog(null, i);
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
             }
         });
         buscarButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     Integer i = Integer.parseInt(textBuscar.getText());
                     int posicon = pila.search(i);
                     JOptionPane.showMessageDialog(null,"El dato "+i+" se encuentra" +
                             " en la posición "+posicon);

                 }catch (Exception ex){
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                 }
             }
         });
     }

    public static void main(String[] args) {
        JFrame frame = new JFrame("pilaintt");
        frame.setContentPane(new pilaintt().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
