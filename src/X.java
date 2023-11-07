import java.awt.HeadlessException;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rc
 */
public class X extends JApplet
{
	public JButton button = new JButton("Button");

	public X()
	{
		super();
		button.addActionListener(a -> JOptionPane.showMessageDialog(null, "Button clicked!"));
		button.setBounds(20, 20, 120, 30);
		this.add(button);
	}

	
	
}
