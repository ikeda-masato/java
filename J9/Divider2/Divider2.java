//Divider2.java
class Divider2{
    
    public static void main(String args[]){
	try{
	    System.out.println("Before Division");
	    int i=Integer.parseInt(args[0]);
	    int j=Integer.parseInt(args[1]);
	    if(j==0){
		throw new Exception(":Don't divide by zero");
	    }
	    System.out.println(i/j);
	    System.out.println("After Division");
	}
	
	catch (ArithmeticException e){
	    System.out.println("ArithmeticException");
	}
	
	catch (ArrayIndexOutOfBoundsException e){
	    System.out.println("ArrayIndex"+"OutOfBoundsException");
	}

	catch (NumberFormatException e){
	System.out.println("NumberFormatException");
	}
	catch (Exception e){
	    System.out.println("error : " + e);
	}

	finally{
	    System.out.println("Finally block");
	}
    }
}