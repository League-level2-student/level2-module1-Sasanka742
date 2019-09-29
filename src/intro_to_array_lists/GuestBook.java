package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JButton addName = new JButton("Add Name");
	JButton viewName = new JButton("View Names");
	JPanel panel = new JPanel();
	
	
	
	ArrayList<String> names = new ArrayList<String>();
	public void run(){
		frame.setVisible(true);
		panel.add(addName);panel.add(viewName);
		frame.add(panel);
	
		viewName.addActionListener(this);
		addName.addActionListener(this);
		frame.pack();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a name to add: ");
			names.add(name);
		}else if(e.getSource()== viewName){
			for(int i=0;i<names.size();i++) {
			String s = names.get(i);
			System.out.println("Gues #"+i+":"+ s);
			}
		}
		
	}
}
