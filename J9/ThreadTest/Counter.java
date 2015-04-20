//Counter.java
class Counter extends Thread{
    private int n;
    private int id;
    private int sleepTime;

    public Counter(int vid,int vst,int vn){
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

//ThreadTest.java
class ThreadTest{
    public static void main(String[] args){
	Counter c1=new Counter(1,500,6);
	Counter c2=new Counter(2,900,6);

	c1.start();
	c2.start();
    }
}