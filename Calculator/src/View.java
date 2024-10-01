import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;

public class View extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField Input;
	JButton C = new JButton("C");
	JButton Delete = new JButton("Delete");
	JButton Remaining = new JButton("%");
	JButton Division = new JButton("/");
	JButton Seven = new JButton("7");
	JButton Eight = new JButton("8");
	JButton Nine = new JButton("9");
	JButton Four = new JButton("4");
	JButton Five = new JButton("5");
	JButton Multiplication = new JButton("X");
	JButton Six = new JButton("6");
	JButton Substraction = new JButton("-");
	JButton One = new JButton("1");
	JButton Two = new JButton("2");
	JButton Three = new JButton("3");
	JButton Addition = new JButton("+");
	JButton btnOut = new JButton("out");
	JButton Zero = new JButton("0");
	JButton Comma = new JButton(",");
	JButton result = new JButton("=");
	JLabel Result = new JLabel("0");



	
	void setDocumentListener(DocumentListener test)
	{
		Input.getDocument().addDocumentListener(test);
	}

	
	 void setActionListeners(ActionListener ButtonHandler)
	{
		this.C.addActionListener(ButtonHandler);
		this.Delete.addActionListener(ButtonHandler);
		this.Remaining.addActionListener(ButtonHandler);
		this.Division.addActionListener(ButtonHandler);
		this.Seven.addActionListener(ButtonHandler);
		this.Eight.addActionListener(ButtonHandler);
		this.Nine.addActionListener(ButtonHandler);
		this.Four.addActionListener(ButtonHandler);
		this.Five.addActionListener(ButtonHandler);
		this.Multiplication.addActionListener(ButtonHandler);
		this.Six.addActionListener(ButtonHandler);
		this.Substraction.addActionListener(ButtonHandler);
		this.One.addActionListener(ButtonHandler);
		this.Two.addActionListener(ButtonHandler);
		this.Three.addActionListener(ButtonHandler);
		this.Addition.addActionListener(ButtonHandler);
		this.btnOut.addActionListener(ButtonHandler);
		this.Zero.addActionListener(ButtonHandler);
		this.Comma.addActionListener(ButtonHandler);
		this.result.addActionListener(ButtonHandler);




	}
	public View() 
	{
		setSize(new Dimension(449, 300));
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(255, 255, 255));
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
		Buttons.setBackground(new Color(255, 255, 255));
		Buttons.setBounds(0, 109, 434, 152);
		Background.add(Buttons);
		Buttons.setLayout(new GridLayout(5, 4, 0, 0));
	
		Buttons.add(C);
		Buttons.add(Delete);
		Buttons.add(Remaining);
		Buttons.add(Division);
		Buttons.add(Seven);
		Buttons.add(Eight);
		Buttons.add(Nine);
		Buttons.add(Multiplication);
		Buttons.add(Four);
		Buttons.add(Five);
		Buttons.add(Six);	
		Buttons.add(Substraction);
		Buttons.add(One);
		Buttons.add(Two);
		Buttons.add(Three);
		Buttons.add(Addition);
		Buttons.add(btnOut);
		Buttons.add(Zero);
		Buttons.add(Comma);
		Buttons.add(result);

		Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Result.setForeground(new Color(255, 255, 255));
		Result.setBackground(new Color(255, 255, 255));
		Result.setHorizontalAlignment(SwingConstants.RIGHT);
		Result.setVerticalAlignment(SwingConstants.BOTTOM);
		Result.setBounds(0, 61, 424, 37);
		Background.add(Result);
		
		Input = new JTextField();
		Input.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Input.setForeground(new Color(255, 255, 255));
		Input.setText("0");
		Input.setBackground(new Color(0, 0, 0));
		Input.setHorizontalAlignment(SwingConstants.RIGHT);
		Input.setBounds(0, 11, 434, 42);
		Background.add(Input);
		Input.setColumns(10);
		this.setVisible(true);
	}
}
