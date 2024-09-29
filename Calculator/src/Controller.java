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
	
	
	
	private void calculate(String newInput)
	{
	
		int index=0;
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
		float num1=0;
		float num2=0;
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
		String result=module.Operations(operator, num1, num2);
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
				calculate(input);

			}
			else if(e.getSource()==window.Two)
			{
				
				input+="2";
				setInput("2");
				calculate(input);

			}
			else if(e.getSource()==window.Three)
			{
				
				input+="3";
				setInput("3");
				calculate(input);
			}
			else if(e.getSource()==window.Four)
			{
				
				input+="4";
				setInput("4");
				calculate(input);
			}
			else if(e.getSource()==window.Five)
			{
				
				input+="5";
				setInput("5");
				calculate(input);
			}
			else if(e.getSource()==window.Six)
			{
				
				input+="6";
				setInput("6");
				calculate(input);
			}
			else if(e.getSource()==window.Seven)
			{
				
				input+="7";
				setInput("7");
				calculate(input);
			}
			else if(e.getSource()==window.Eight)
			{
				
				input+="8";
				setInput("8");
				calculate(input);
			}
			else if(e.getSource()==window.Nine)
			{
				
				input+="9";
				setInput("9");
				calculate(input);
			}
			else if(e.getSource()==window.Zero)
			{
				
				input+="0";
				setInput("0");
				calculate(input);
			}
			else if(e.getSource()==window.Multiplication)
			{
				input+="*";
				setInput("*");
				calculate(input);
				
			}
			else if(e.getSource()==window.Addition)
			{
				input+="+";
				setInput("+");
				calculate(input);
				
			}
			else if(e.getSource()==window.Substraction)
			{
				input+="-";
				setInput("-");
				calculate(input);
				
			}
			else if(e.getSource()==window.Division)
			{
				input+="/";
				setInput("/");
				calculate(input);
				
			}
			else if(e.getSource()==window.C)
			{
				input="";
				window.Input.setText("0");
				window.Result.setText("0");
				
			}
			
			
			
		
			
		}
		
	}
	
	
}
