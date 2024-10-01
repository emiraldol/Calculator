import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



/*
 * !TODO CREATE A FUNCTION TO REMOVE ZERO IF IT IS ONLY ZERO
 * !TODO CREATE A FUNCTION TO NOT ALLOW MULTIPLE OPERATIONS CLICKED
 * !TODO FIX THE NAME OF TESTING AND ADD THE FEATURES OF SIMPLE CALCULATOR
 * !TODO ADD THE MORE BUTTONS TO THE VIEW AND MAKE THEM DO OPERATIONS
 * !TODO FIX SOME BUGS IN CALCULATE METHOD!
 * 
 */
public class Controller 
{
	
	View window;
	Model module;
	String input="";
	boolean operator=false;
	HashSet<String>operators;
	
	Controller()
	{
		operators=new HashSet<>();
		operators.add("*");
		operators.add("/");
		operators.add("+");
		operators.add("%");
		operators.add("-");
		module=new Model();
		window=new View();
		window.setActionListeners(new ButtonHandler());
		window.setDocumentListener(new Testing());
	}
	
	
	
	private void calculate(String newInput)
	{
	
		int index=0;
		String result="";
		String newres="";
		String operator="";
		if(newInput.contains("*"))
		{
			index=newInput.indexOf("*");
			operator="*";
		}
		else if(newInput.contains("/"))
		{
			index=newInput.indexOf("/");
			operator="/";
			
		}
		else if(newInput.contains("+"))
		{
			index=newInput.indexOf("+");
			operator="+";
		}
		else if(newInput.contains("-"))
		{
			index=newInput.indexOf("-");
			operator="-";
		}
		else
		{
			window.Result.setText("="+newInput);
			return;
		}

		String array[]=newInput.split("");
		double num1=0;
		double num2=0;
		int lastindex=index;
		int firstindex=index-1;
		String reserve="";
		for(int i=index-1;i>=0;i--)
		{
			if(!operators.contains(array[i]))
			{
				reserve+=array[i];
				firstindex=i;
			}
			else
			{
				break;	
			}
		}
		StringBuffer sbr = new StringBuffer(reserve);
		sbr.reverse();
		reserve=sbr.toString();
		num1=Double.valueOf(reserve);
		if(index+1<array.length)
		{
			reserve="";
			for(int i=index+1;i<array.length;i++)
			{
				if(!operators.contains(array[i]))
				{
					reserve+=array[i];
					lastindex=i;
				}
				else
				{					
					break;
				}
			}
			num2=Double.valueOf(reserve);
		}
		else
		{
			lastindex=index;
			if(operator.equals("*")|| operator.equals("/"))
			{
				num2=1;
			}
			else if(operator.equals("+") || operator.equals("-"))
			{
				num2=0;
			}
		}
		try
		{
			result=module.Operations(operator, num1, num2);
		}
		catch(ArithmeticException e)
		{
			window.Result.setText("Can't Devide By Zero");
			return;
		}
		for(int i=0;i<newInput.length();i++)
		{
			if(i==firstindex)
			{
				newres+=result;
				i=lastindex;
			}
			else
			{
				newres+=array[i];
			}
		}
		newInput=newres;
		calculate(newInput);

	}
	
	
	
	
	public static String removeLastCharRegex(String s) {
	    return (s == null) ? null : s.replaceAll(".$", "");
	}
	
	
	
	
	void setInput(String num)
	{
		if(window.Input.getText().equals("0"))
		{
			window.Input.setText(num);
			input=num;
		}
		else
		{
			input+=num;
			window.Input.setText(window.Input.getText()+num);
		}
	}
	
	
	class Testing implements DocumentListener
	{

		@Override
		public void insertUpdate(DocumentEvent e) {
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {

		}

		@Override
		public void changedUpdate(DocumentEvent e) {

		}
		
	}
	
	class ButtonHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			
			if(e.getSource()==window.One)
			{
				
				setInput("1");
				operator=true;
				calculate(input);

			}
			else if(e.getSource()==window.Two)
			{
				
				setInput("2");
				operator=true;
				calculate(input);

			}
			else if(e.getSource()==window.Three)
			{
				
				setInput("3");
				operator=true;
				calculate(input);
			}
			else if(e.getSource()==window.Four)
			{
				
				setInput("4");
				operator=true;
				calculate(input);
			}
			else if(e.getSource()==window.Five)
			{
				
				setInput("5");
				operator=true;
				calculate(input);
			}
			else if(e.getSource()==window.Six)
			{
				operator=true;
				setInput("6");
				calculate(input);
			}
			else if(e.getSource()==window.Seven)
			{
				operator=true;
				setInput("7");
				calculate(input);
			}
			else if(e.getSource()==window.Eight)
			{
				operator=true;
				setInput("8");
				calculate(input);
			}
			else if(e.getSource()==window.Nine)
			{
				operator=true;
				setInput("9");
				calculate(input);
			}
			else if(e.getSource()==window.Zero)
			{
				if(!input.equals("0"))
				{
					setInput("0");
					calculate(input);
				}
				
			}
			else if(e.getSource()==window.Multiplication)
			{
				if(operator)
				{
					setInput("*");
					operator=false;
					calculate(input);
				}
				
				
			}
			else if(e.getSource()==window.Addition)
			{
				if(operator)
				{
					setInput("+");
					calculate(input);
					operator=false;
					
				}
				
			}
			else if(e.getSource()==window.Substraction)
			{

				if(operator)
				{
					setInput("-");
					calculate(input);
					operator=false;
				}
			}
			else if(e.getSource()==window.Division)
			{

				if(operator)
				{
					setInput("/");
					calculate(input);
					operator=false;
					
				}
				
				
			}
			else if(e.getSource()==window.C)
			{
				input="";
				window.Input.setText("0");
				window.Result.setText("0");
				
			}
			else if(e.getSource()==window.Delete)
			{
				input=removeLastCharRegex(input);
				String arr[]=input.split("");
				if(operators.contains(arr[arr.length-1]))
				{
					operator=false;
				}
				else
				{
					operator=true;
				}
				if(input.equals(""))
				{
					input="";
					window.Result.setText("=0");
				}
				window.Input.setText(input);
				calculate(input);
				
			}
			
			
			
		
			
		}
		
	}
	
	
}
