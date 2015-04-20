// IntStack.java
// Stack class

class IntStack{
    private int stack[];
    private int sp;

    public IntStack(){
	stack=new int[100];
	sp=0;
    }

    public IntStack(int size){
	stack=new int[size];
	sp=0;
    }
    public void push(int n){
	if(!isFull()){
	    stack[sp]=n;
	    sp++;
	}
    }

    public int pop(){
	if(!isEmpty()){
	    sp--;
	    return stack[sp];
	}else {
	    return 0;
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
