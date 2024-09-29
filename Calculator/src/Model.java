
public class Model 
{
	
	String Operations(String operation,float num1,float num2)
	{
		String result="";
		float resnum=0;
		
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
			resnum=num1/num2;
		}
		if(isInteger(resnum))
		{
			int res=(int)resnum;
			result=Integer.toString(res);
			return result;
		}
		result=Float.toString(resnum);
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
