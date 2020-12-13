package groupAssignment;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class Basket extends JFrame implements ActionListener {
	int total = 0;
	int test = 0;
	LinkedList<BasketList> basket = new LinkedList<BasketList>();
	String[] exampleItems = { " " ,"Luxury", "Essential", "Gift" };// Sets three items for dropdown box
	String[] exampleQuantity = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }; // Sets numbers for other dropdownbox
	private JPanel parentPanel = new JPanel(new MigLayout());
	JPanel basketPanel = new JPanel(new MigLayout());
	JButton add = new JButton("Add");
	JComboBox goods = new JComboBox(exampleItems);
	JComboBox quantity = new JComboBox(exampleQuantity);
	JTextField question = new JTextField("Enter the name of the product here");
	JTextField types = new JTextField(6);
	JButton clear = new JButton("Clear");

	public Basket() {

		parentPanel.add(basketPanel);
		basketPanel.setLayout(new MigLayout());
		add(parentPanel);
		setTitle("Basket");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		basketPanel.add(question);
		basketPanel.add(types);
		basketPanel.add(goods);
		basketPanel.add(quantity);
		basketPanel.add(add);
		basketPanel.add(clear);
		question.setEditable(false);
		add.addActionListener(this);
		goods.addActionListener(this);
		quantity.addActionListener(this);
		clear.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String type = (String) goods.getSelectedItem();
			String quant = (String) quantity.getSelectedItem();
			String product = types.getText();
			int quantity = Integer.parseInt(quant);
			int price = 0;
			if (type.equals("Luxury")) {
				price = 50;
			} else if (type.equals("Essential")) {
				price = 30;
			} else if (type.equals("Gift")) {
				price = 20;
			}
			basket.add(new BasketList(type,product, price, quantity));// adds what ever is selected to basket linked list
//			for(int i = 0;i<basket.size();  i++) {
//				total = total + basket.get(i).getPrice() * basket.get(i).getQuantity() ;
//
//			}

			
		}
		
		if (e.getSource()==clear) {
			goods.setSelectedIndex(0);
			quantity.setSelectedIndex(0);
		}

	}

	public static void main(String[] args) {
		new Basket();

	}
}
