/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StopWatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;
import java.text.DecimalFormat;
import javax.swing.JFrame;


import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Jackson
 */
public class StopWatchPanel {
    //initializing variables
private static int Second = 0;
    private static int tenthSecond = 0;
    private static Timer timer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Stop Watch Main function
         JFrame frame = new JFrame ("STOP WATCH");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new StopWatchPanel());
         frame.pack();
        frame.setVisible(true);
        System.out.println("Main function to start, stop and Reset the stopWatch");
    }
    
}
