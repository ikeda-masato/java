import java.net.*;

class DatagramSender{
    public static void main(String args[]){
	try{

	    InetAddress ia=InetAddress.getByName(args[0]);

	    int port=Integer.parseInt(args[1]);

	    DatagramSocket ds=new DatagramSocket(port);

	    byte buffer[]=args[2].getBytes();
	    DatagramPacket dp=new DatagramPacket(buffer,buffer.length,ia,port);

	    ds.send(dp);
	}
	catch(Exception e){
	    System.out.println("Sender Erorr");
	}
    }
}