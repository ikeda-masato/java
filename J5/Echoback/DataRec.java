import java.net.*;

class EchobackRec{
    public static void main(String args[]){
	try{

	    int port=Integer.parseInt(args[1]);

	    DatagramSocket ds=new DatagramSocket(port);

	    byte buffer[]=new byte[100];

	    DatagramPacket dp=new DatagramPacket(buffer,buffer.length);

	    InetAddress ia=InetAddress.getByName(args[0]);

	    while(true){
		
		ds.receive(dp);

		String str=new String(dp.getData());

		System.out.println(str);

		byte buffer1[] = str.getBytes();
		
		DatagramPacket dp1=new DatagramPacket(buffer1,buffer1.length,ia,port);
				
		ds.send(dp1);

		for(int i=0;i<100;i++){
		    buffer[i]=0;
		    buffer1[i]=0;
		}
	    }
	}
	catch(Exception e){
	    System.out.println("Receiver Error");
	}
    }
}