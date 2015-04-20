// StringStack.java
// Queue class

class StringStack{
    private String stack[];
    private int sp;
    private int i;

    public StringStack(){
	stack=new String[100];
	sp=0;
    }

    public StringStack(int size){
	stack=new String[size];
	sp=0;
    }
    public void push(String n){
	if(!isFull()){
	    stack[sp]=n;
	    sp++;
	    i=0;
	}
    }

    public String pop(){
	if(!isEmpty()){
	    sp--;
	    i++;
	    return stack[i-1];
	}else {
	    return " ";
	}
	
    }


    public boolean isEmpty(){
	return sp<=0;
    }
    
    public boolean isFull(){
	return sp>=stack.length;
    }

    public int number(){
	return sp;
    }
    
    public int capacity(){
	return stack.length;
    }
}
