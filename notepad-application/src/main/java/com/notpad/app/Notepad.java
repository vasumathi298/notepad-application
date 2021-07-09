package com.notpad.app;
import javax.swing.*;
/**
 * 
 * @author Vasumathi Narayanan
 *
 */
public class Notepad
{
	public static void main(String [] args)
	{
		NotepadFrame f1=new NotepadFrame();
		f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
	}
}
