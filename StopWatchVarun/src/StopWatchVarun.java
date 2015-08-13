/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Varun
 */
public class StopWatchVarun {
//test program
    public void actionPerformed(ActionEvent event)
        {
            DecimalFormat fmt= new DecimalFormat("00");
            if (event.getActionCommand().equals("START")){
                btnWatch.setText("STOP");
                btnReset.setEnabled(false);
                timer.start();
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
