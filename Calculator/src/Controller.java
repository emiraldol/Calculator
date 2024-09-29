import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class Controller 
{
	
	View window;
	Model module;
	String input="";
	HashSet<String>operators;
	
	Controller()
	{
		operators=new HashSet<>();
		operators.add("x");
		operators.add("/");
		operators.add("+");
		operators.add("%");
		module=new Model();
		window=new View();
		window.setActionListeners(new ButtonHandler());
	}
	
	
	
	private void calculate()
	{
	
		int index=0;
		String operator="";
		if(input.contains("*"))
		{
			index=input.indexOf("*");
			operator="*";
		}
		else if(input.contains("/"))
		{
			index=input.indexOf("/");
			operator="/";
			
		}
		else if(input.contains("+"))
		{
			index=input.indexOf("+");
			operator="+";
		}
		else if(input.contains("-"))
		{
			index=input.indexOf("-");
			operator="-";
		}
		else
		{
			window.Result.setText("="+input);
			return;
		}

		String array[]=input.split("");
		float num1=0;
		float num2=0;
		int lastindex=index;
		int firstindex=-1;
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
		num1=Float. valueOf(reserve);
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
			num2=Float. valueOf(reserve);
		}
		String result=module.Operations(operator, num1, num2);
		String newInput="";
		for(int i=0;i<input.length();i++)
		{
			if(i==firstindex)
			{
				newInput+=result;
				i=lastindex;
			}
			else
			{
				newInput+=array[i];
			}
		}
		
		input=newInput;
		calculate();
	
		
		
		
		
		
	
	}
	
	void setInput(String num)
	{
		if(window.Input.getText().equals("0"))
		{
			window.Input.setText(num);
		}
		else
		{
			window.Input.setText(window.Input.getText()+num);
		}
	}
	
	class ButtonHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			
			if(e.getSource()==window.One)
			{
				
				input+="1";
				setInput("1");
				calculate();

			}
			else if(e.getSource()==window.Two)
			{
				
				input+="2";
				setInput("2");
				calculate();

			}
			else if(e.getSource()==window.Three)
			{
				
				input+="3";
				setInput("3");
				calculate();
			}
			else if(e.getSource()==window.Four)
			{
				
				input+="4";
				setInput("4");
				calculate();
			}
			else if(e.getSource()==window.Five)
			{
				
				input+="5";
				setInput("5");
				calculate();
			}
			else if(e.getSource()==window.Six)
			{
				
				input+="6";
				setInput("6");
				calculate();
			}
			else if(e.getSource()==window.Seven)
			{
				
				input+="7";
				setInput("7");
				calculate();
			}
			else if(e.getSource()==window.Eight)
			{
				
				input+="8";
				setInput("8");
				calculate();
			}
			else if(e.getSource()==window.Nine)
			{
				
				input+="9";
				setInput("9");
				calculate();
			}
			else if(e.getSource()==window.Multiplication)
			{
				input+="*";
				setInput("*");
				
			}
			else if(e.getSource()==window.Addition)
			{
				input+="+";
				setInput("+");
				
			}
			else if(e.getSource()==window.Substraction)
			{
				input+="+";
				setInput("+");
				
			}
			else if(e.getSource()==window.Division)
			{
				input+="+";
				setInput("+");
				
			}
			
			
			
		
			
		}
		
	}
	
	
}
