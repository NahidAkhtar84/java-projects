/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloddbank2;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class BloddBank2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomepage hm = new welcomepage();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //connectjdbc cojdbc = new connectjdbc();
    }
    
}
