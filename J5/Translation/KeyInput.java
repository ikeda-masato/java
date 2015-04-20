import java.io.*;

public class KeyInput{
    public static void main(String[] args){
	try{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	    String str=br.readLine();
	    System.out.println(str);
	}
	catch(IOException e){}
    }
}