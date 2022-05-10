package org.ssglobal.training.codes.objects;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormApplication {

	public static void main(String[] args) {
		
		FormFrame form = new FormFrame();
		form.show();
		//form.pack();
		FormFrame form1 = new FormFrame();
		form1.show();
		FormFrame form2 = new FormFrame();
		form2.show();
	}
	
}

class FormFrame extends JFrame{
	
	private List<String> names;
	private String description;
	
	
		
	static {
		//initialization
		//configuration
		System.out.println("loading data base connectivity........");
	}
	
	static {
		System.out.println("loading network config.......");
	}
	
	{
		// object initialization
		names = new ArrayList<>();
		description = "";
		
	}
	
	{
		JPanel panel = new JPanel();
		
		JTextField text1 = new JTextField("input username");
		JTextField text2 = new JTextField("input password");
		
		panel.add(text1);
		panel.add(text2);
		
		this.add(panel);
		
	}
	
	public FormFrame(){
		
		//instantiation
		System.out.println("A FormFrame instance is created");
		// layout the component/setup the component/ configure the component
		
		this.setSize(200, 200);
	}
	
	public void init() {
		
	}
	
}

