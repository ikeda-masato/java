import java.net.*;

class DS{
    public static void main(String args[]){
	try{

	    InetAddress ia=InetAddress.getByName(args[0]);

	    int port=Integer.parseInt(args[1]);

	    DatagramSocket ds=new DatagramSocket(port);

	    byte buffer[]=args[2].getBytes();
	    DatagramPacket dp=new DatagramPacket(buffer,buffer.length,ia,port);

	    ds.send(dp);

	    DatagramPacket dp1=new DatagramPacket(buffer,buffer.length);
	    ds.receive(dp1);
	    
	    String str = new String(dp1.getData());
	    if(str.equalsIgnoreCase("hello")){
		System.out.println("こんにちわ");
	    }else{
	    if(str.equalsIgnoreCase("apple")){
		System.out.println("りんご");
	    }else{
	    if(str.equalsIgnoreCase("pen")){
		System.out.println("えんぴつ");
	    }else{
	    if(str.equalsIgnoreCase("goodmorning")){
		System.out.println("おはよう");
	    }else{
	    if(str.equalsIgnoreCase("name")){
		System.out.println("名前");
	    }else{
	    if(str.equalsIgnoreCase("telphone")){
		System.out.println("携帯電話");
	    }else{
	    
	    System.out.println("翻訳できませんでした。");
	    }}}}}}
	}

    
    
	    catch(Exception e){
	    System.out.println("Sender Erorr");
	}
    }
}