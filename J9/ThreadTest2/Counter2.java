//Counter2.java
class Counter2 extends Thread{
    private int n;
    private int id;
    private int sleepTime;
    private String h;
    
    public Counter2(int vst,String vh){
	sleepTime=vst;
	h=vh;
    }

    public void run(){
	try{
	    while(true){
		System.out.println(h);
		sleep(sleepTime);
	    }
	}
	catch (InterruptedException e){
	}
    }
}

//ThreadTest2.java
class ThreadTest2{
    public static void main(String[] args){
	Counter2 c1=new Counter2(1000,"Hello");
	Counter2 c2=new Counter2(2500,"Goodbye");

	c1.start();
	c2.start();
    }
}