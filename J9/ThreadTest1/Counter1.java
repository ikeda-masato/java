//Counter1.java
class Counter1 extends Thread{
    private int n;
    private int id;
    private int sleepTime;

    public Counter1(int vid,int vst,int vn){
	id=vid;
	sleepTime=vst;
	n=vn;
    }

    public void run(){
	try{
	    for(int i=0;i<n;i++){
		System.out.println("Counter ["+id+"] = "+i);
		sleep(sleepTime);
	    }
	}
	catch (InterruptedException e){
	}
    }
}

//ThreadTest1.java
class ThreadTest1{
    public static void main(String[] args){
	Counter1 c1=new Counter1(1,100,6);
	Counter1 c2=new Counter1(2,300,6);
	Counter1 c3=new Counter1(3,500,6);
	Counter1 c4=new Counter1(4,700,6);
	Counter1 c5=new Counter1(5,900,6);

	c1.start();
	c2.start();
	c3.start();
	c4.start();
	c5.start();
    }
}