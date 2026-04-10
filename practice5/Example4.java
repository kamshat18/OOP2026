package practice5;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double leftOperand, r6esult, rightOperand;
       
       Scanner in = new Scanner(System.in);
       while(in.hasNext()) 
       {
    	   String expression = in.next();
    	   StringTokenizer tokenizer = new StringTokenizer(
    			   expression , "+-*/",true);


           try
           {
              String leftString   = tokenizer.nextToken();
              String operator     = tokenizer.nextToken();
              String rightString  = tokenizer.nextToken();

              try{leftOperand  = Double.parseDouble(leftString);}
              catch(NumberFormatException e) {
            	  System.out.println(
                          "Left operand is not a number"
                      );
                      continue;

              }
              try{rightOperand = Double.parseDouble(rightString);}
              catch(NumberFormatException e) {
            	  System.out.println(
                          "Left operand is not a number"
                      );
                      continue;
              }
              double result = 0;
           
              if (operator.equals("+"))
                 result = leftOperand + rightOperand;
             
              else if (operator.equals("*"))
                  result = leftOperand * rightOperand;
            
              else if (operator.equals("-"))
                  result = leftOperand - rightOperand;
        
              else if (operator.equals("/"))
                  result = leftOperand / rightOperand;
               else
                  result = 0.0;

              System.out.println("Result: " + result);
           }
           catch (NoSuchElementException nsee)
           {
              System.out.println("Invalid syntax");
           }
           catch (NumberFormatException nfe)
           {
              System.out.println("One or more operands is not a number");
           }

    	   
       }



    }
}
