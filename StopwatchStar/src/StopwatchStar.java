/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anil Jarly
 */
public class StopwatchStar {
    public StopWatchPanel() {
        setLayout(new BorderLayout());
        JPanel t1 = new JPanel();
        JPanel t3 = new JPanel();
        lbSecond = new JLabel("0" + Second);
        lbSecond.setFont(new Font("TimesRoman" , Font.BOLD , SIZE));
        lbSecond.setHorizontalAlignment(Second);
        TitledBorder titled = new TitledBorder("'");
        TitledBorder titled1 = new TitledBorder("\")");
        lbSecond.setBorder(titled);
        t1.add(lbSecond);
        lbTenthSecond = new JLabel("0" + tenthSecond);
        lbTenthSecond.setFont(new Font ("TimesRoman", Font.BOLD , SIZE));
        lbTenthSecond.setHorizontalAlignment(Second);
        lbTenthSecond.setBorder(titled1);
        t1.add(lbTenthSecond);
        t1.setBackground(Color.GRAY);
        add(t1 , BorderLayout.NORTH);
        t1.setLayout(new GridLayout(1,2));
        btnWatch = new JButton("START");
        t3.add(btnWatch);
        btnWatch.addActionListener((ActionListener) new WatchButtonListener());
        btnReset = new JButton("RESET");
        t3.add(btnReset);
        btnReset.addActionListener(new WatchButtonListener());
        add(t3, BorderLayout.CENTER);
        t3.setLayout(new GridLayout(1,2));
        timer= new Timer(DELAY , new TimerListener());
        setPreferredSize(new Dimension(SIZEWIDTH,SIZEHEIGHT));
        setBackground(Color.white);   
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
