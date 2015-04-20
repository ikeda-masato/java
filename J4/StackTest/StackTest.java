// StackTest.java

class StackTest{
    public static void main(String args[]){
	IntStack s=new IntStack(3);

	System.out.println("capacity="+s.capacity());
	System.out.println("number="+s.number());
	System.out.println();

	for(int i=0;i<args.length;i++){
	    s.push(Integer.parseInt(args[i]));
	}
	
	System.out.println("number="+s.number());
	System.out.println("isFull?"+s.isFull());
	System.out.println();

	while(!s.isEmpty()){
	    System.out.print(s.pop()+"");
	}
	System.out.println();
	System.out.println("number="+s.number());
	System.out.println("isEmpty?"+s.isEmpty());
	System.out.println();
    }
}