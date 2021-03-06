import java.awt.*;

interface IntContainer{
    public void push(int n);
    public int pop();
    public boolean isEmpty();
    public boolean isFull();
    public int number();
    public int capacyty();
}

class IntStack implements IntContainer{
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
	}else{
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

    public int capacyty(){
	return stack.length;
    }
}

class IntQueue implements IntContainer{
  private int queue[];
    private int qp1,qp2;

    public IntQueue(){
	queue=new int[100];
	qp1=0;
	qp2=0;
    }
    public IntQueue(int size){
	queue=new int[size];
	qp1=0;
	qp2=0;
    }
    public void push(int n){
	if(!isFull()){
	    queue[qp1]=n;
	    qp1++;
	}
    }


    public int pop(){
	if(!isEmpty()){
	   qp2++;
	   return queue[qp2 -1];  	  
	}else{
	    return 0;
	}
    }

    public boolean isEmpty(){
	return qp1==qp2;
    }

    public boolean isFull(){
	return qp1>=queue.length;
    }

    public int number(){
	return qp1-qp2;
    }

    public int capacyty(){
	return queue.length;
    }

    public void clear(){
	    qp1=0;
	    qp2=0;
	   }
}


public class SQtest{
public static void main(String args[]){
	IntQueue s=new IntQueue(5);
	IntStack t=new IntStack(5);

	System.out.println("---STACK---");
	System.out.println("capacity="+t.capacyty());
	System.out.println("number="+t.number());
	System.out.println();

	for(int i = 0;i<args.length;i++){
	    t.push(Integer.parseInt(args[i]));
	}

	System.out.println("number="+t.number());
	System.out.println("isFull?"+t.isFull());
	System.out.println();

	while(!t.isEmpty()){
	    System.out.print(t.pop()+" ");
	}
    
	System.out.println();
	System.out.println("number="+t.number());
	System.out.println("isEmpty?"+t.isEmpty());
	System.out.println();
	System.out.println();

	System.out.println("---QUEUE---");
	System.out.println("capacity="+s.capacyty());
	System.out.println("number="+s.number());
	System.out.println();

	for(int i = 0;i<args.length;i++){
	    s.push(Integer.parseInt(args[i]));
	    if(s.isFull()){
		System.out.println("number="+s.number());
		System.out.println("isFull?"+s.isFull());
		System.out.println();
	    
		while(!s.isEmpty()){
		    
		    System.out.print(s.pop()+" ");	
		}
		s.clear();
	    }
	}
	System.out.println();
	System.out.println();
	System.out.println("number="+s.number());
	System.out.println("isFull?"+s.isFull());
	System.out.println();

	while(!s.isEmpty()){
	    System.out.print(s.pop()+" ");
	}
	System.out.println();
	System.out.println();
	System.out.println("number="+s.number());
	System.out.println("isEmpty?"+s.isEmpty());
	System.out.println();
	
 
    }
}