class CountChar{
    public static void main(String[] args){
	int count=0;
	for(int i=0;i<args[1].length();i++){
	    if(args[0].charAt(0)==args[1].charAt(i))
		count++;
	}
	    System.out.println("count ="+count);
    }
}