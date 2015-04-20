class AddValue{
    public static void main(String[] args){
	int sum=0,count=0;
	for(int i=0;i<args.length;i++){
	    count=Integer.parseInt(args[i]);
	    sum=sum+count;
	}
	    System.out.println("sum = "+sum);
    }
}