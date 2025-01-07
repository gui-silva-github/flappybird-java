/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flappybirdgame;

import javax.swing.*;

/**
 *
 * @author guilh
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int boardWidth = 360;
        int boardHeight =  640;
        
        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        
        frame.setSize(boardWidth, boardHeight);
        
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
        
    }
    
}
