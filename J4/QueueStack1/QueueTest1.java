// QueueTest1.java

class QueueTest1{
    public static void main(String args[]){
	QueueStack1 s=new QueueStack1(5);
	int x=0;
	
	System.out.println("capacity="+s.capacity());
	System.out.println("number="+s.number());
	System.out.println();
	
	while(x<args.length){
	    for(int i=x;i<args.length;i++){
		s.push(Integer.parseInt(args[i]));
		x++;
		if(s.isFull()){
		    break;
		}
	    }
	
	System.out.println();
	System.out.println("number="+s.number());
	System.out.println("isFull?"+s.isFull());
	System.out.println();

	while(!s.isEmpty()){
	    System.out.print(s.pop()+" ");
	    
	}

	}
	System.out.println();
	System.out.println("number="+s.number());
	System.out.println("isEmpty?"+s.isEmpty());
	System.out.println();
    }
}