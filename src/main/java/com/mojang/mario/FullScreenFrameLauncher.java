package com.mojang.mario;

import java.awt.*;
import javax.swing.*;

public class FullScreenFrameLauncher
{
    public static void main(String[] args)
    {
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        JFrame frame = new JFrame("Infinite Tux");
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
        GraphicsDevice device = env.getDefaultScreenDevice();
        device.setFullScreenWindow(frame);  
        MarioComponent mario = new MarioComponent(320*frame.getHeight()/240, frame.getHeight());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setLayout( new GridBagLayout() );
        frame.add(mario, new GridBagConstraints());        
        //frame.setContentPane(mario);
        frame.pack();
        //frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);
        
        frame.setVisible(true);
        
        mario.start();
        frame.addKeyListener(mario);
        frame.addFocusListener(mario);
    }
}
