import java.net.*;

class DatagramReceiver{
    public static void main(String args[]){
	try{

	    int port=Integer.parseInt(args[0]);

	    DatagramSocket ds=new DatagramSocket(port);

	    byte buffer[]=new byte[100];

	    DatagramPacket dp=new DatagramPacket(buffer,buffer.length);

	    while(true){
		
		ds.receive(dp);

		String str=new String(dp.getData());

		System.out.println(str);

		for(int i=0;i<100;i++){
		    buffer[i]=0;
		}
	    }
	}

	    InetAddress ia=InetAddress.getByName(args[0]);

	    int port=Integer.parseInt(args[1]);

	    DatagramSocket ds=new DatagramSocket(port);

	    byte buffer[]=str.getBytes();
	    DatagramPacket dp=new DatagramPacket(buffer,buffer.length,ia,port);

	    ds.send(dp);

	catch(Exception e){
	    System.out.println("Receiver Error");
	}
    }
}