package com.notpad.app;

import javax.swing.*;
/**
 * 
 * @author Vasumathi Narayanan
 *
 */
public class FontSizeFrame extends JFrame
{
	public JSpinner spin;
	FontSizeFrame()
	{
		setVisible(true);
		setSize(100,100);
		setLocation(300,300);
		setResizable(true);
		setTitle("Font Size Chooser");
		spin=new JSpinner();
		add(spin);
	}
}