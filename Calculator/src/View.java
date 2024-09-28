import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class View extends JFrame{
	public View() {
		getContentPane().setBackground(new Color(0, 0, 0));
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel Background = new JPanel();
		Background.setBackground(new Color(0, 0, 0));
		Background.setBounds(0, 0, 434, 261);
		getContentPane().add(Background);
		Background.setLayout(null);
		
		JPanel Buttons = new JPanel();
		Buttons.setBackground(new Color(0, 255, 0));
		Buttons.setBounds(10, 109, 414, 152);
		Background.add(Buttons);
		Buttons.setLayout(new GridLayout(4, 5, 1, 1));
		
		JButton C = new JButton("C");
		Buttons.add(C);
		
		JButton delete = new JButton("Delete");
		Buttons.add(delete);
		
		JButton upoloipo = new JButton("%");
		Buttons.add(upoloipo);
		
		JButton dia = new JButton("/");
		Buttons.add(dia);
		
		JButton epta = new JButton("7");
		Buttons.add(epta);
		
		JButton eight = new JButton("8");
		Buttons.add(eight);
		
		JButton nine = new JButton("9");
		Buttons.add(nine);
		
		JButton multi = new JButton("X");
		Buttons.add(multi);
		
		JButton four = new JButton("4");
		Buttons.add(four);
		
		JButton five = new JButton("5");
		Buttons.add(five);
		
		JButton six = new JButton("6");
		Buttons.add(six);
		
		JButton minus = new JButton("-");
		Buttons.add(minus);
		
		JButton one = new JButton("1");
		Buttons.add(one);
		
		JButton two = new JButton("2");
		Buttons.add(two);
		
		JButton three = new JButton("3");
		Buttons.add(three);
		
		JButton plus = new JButton("+");
		Buttons.add(plus);
		
		JButton btnOut = new JButton("out");
		Buttons.add(btnOut);
		
		JButton zero = new JButton("0");
		Buttons.add(zero);
		
		JButton comma = new JButton(",");
		Buttons.add(comma);
		
		JButton result = new JButton("=");
		Buttons.add(result);
		
		JLabel Result = new JLabel("0");
		Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Result.setForeground(new Color(255, 255, 255));
		Result.setBackground(new Color(255, 255, 255));
		Result.setHorizontalAlignment(SwingConstants.RIGHT);
		Result.setVerticalAlignment(SwingConstants.BOTTOM);
		Result.setBounds(0, 61, 424, 37);
		Background.add(Result);
	}
}
