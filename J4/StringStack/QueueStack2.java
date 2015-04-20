// QueueStack2.java
// Queue class

class QueueStack2{
    private String stack[];
    private int sp;
    private int i;

    public QueueStack2(){
	stack=new int[100];
	sp=0;
    }

    public QueueStack2(int size){
	stack=new int[size];
	sp=0;
    }
    public void push(int n){
	if(!isFull()){
	    stack[sp]=n;
	    sp++;
	    i=0;
	}
    }

    public int pop(){
	if(!isEmpty()){
	    sp--;
	    i++;
	    return stack[i-1];
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
