
public class Model 
{
	
	String Operations(String operation,double num1,double num2)throws ArithmeticException
	{
		String result="";
		double resnum=0;
		
		if(operation.equals("+"))
		{
			resnum=num1+num2;
		}
		else if(operation.equals("-"))
		{
			resnum=num1-num2;
		}
		else if(operation.equals("*"))
		{
			resnum=num1*num2;
		}
		else if(operation.equals("/"))
		{
			if(num2==0)
			{
				throw new ArithmeticException();
				
			}
			else
			{
				resnum=num1/num2;
			}
			
		}
		if(isInteger(resnum))
		{
			int res=(int)resnum;
			result=Integer.toString(res);
			return result;
		}
		result=Double.toString(resnum);
		return result;
		
	}
	
	private boolean isInteger(double N)
	{
	 
	    int X = (int)N;
	    double temp2 = N - X;
	    if (temp2 > 0) 
	    {
	        return false;
	    }
	    return true;
	}
	
	
	
	
}
