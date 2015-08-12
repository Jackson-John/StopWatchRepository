/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anil Jarly
 */
public class StopwatchStart {
public StopWatchPanel() {
        setLayout(new BorderLayout()); //setting the design layout
        JPanel t1 = new JPanel();
        JPanel t3 = new JPanel();
        lbSecond = new JLabel("0" + Second);
        lbSecond.setFont(new Font("TimesRoman" , Font.BOLD , SIZE)); //Assigning font
        TitledBorder titled = new TitledBorder("'");
        TitledBorder titled1 = new TitledBorder("\")");
        lbSecond.setBorder(titled);
         
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
