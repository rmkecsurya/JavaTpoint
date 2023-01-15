
public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		//try-catch
		try {
			int i=10/0;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		/**
		 * Multiple Catch block
		 */
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");
           
           try{    
        	    int a[]=new int[5];    
        	    a[5]=30/0;    
        	   }
           		catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
           		catch(ArithmeticException e){
    		   System.out.println("task1 is completed");
    		   }
        	   catch(Exception e){
        		   System.out.println("common task completed");
        		   }    
        	       
        	       
        	   System.out.println("rest of the code...");
		

	}

}
