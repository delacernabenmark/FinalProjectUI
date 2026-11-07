/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;
import view.Atelier;
import javax.swing.SwingUtilities;
/**
 *
 * @author admin
 */
public class Main {
     public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Atelier atelier = new Atelier();

            atelier.setLocationRelativeTo(null);
            atelier.setVisible(true);

        });
    }
}
