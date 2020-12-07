import net.miginfocom.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StockGUI extends JFrame {
	private JPanel panelStock; 
	private JButton btnAdd, btnView;
	
	public StockGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panelStock = new JPanel();
	panelStock.setLayout(new MigLayout());
	add(panelStock);
	
	btnAdd = new JButton("Add item");
	btnView = new JButton("View items");
	
	panelStock.add(btnAdd, "wrap, pushx, growx");
	panelStock.add(btnView, "pushx, growx");
	}
}

