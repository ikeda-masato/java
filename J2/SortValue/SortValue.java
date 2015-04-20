class SortValue{
    public static void main(String[] args){
	int sort[]=new int[args.length];
	System.out.print("入力数字列:");
	for(int i=0;i<args.length;i++){
	    System.out.print(args[i]+" ");
	    sort[i]=Integer.parseInt(args[i]);
	}
	for(int i=0;i<args.length-1;i++){
	    for(int j=0;j<args.length-i-1;j++) {
		if(sort[j] > sort[j+1]) {
            		int temp=sort[j];
            		sort[j]= sort[j+1];
            		sort[j+1]=temp;
		}
	    }
	}

	System.out.println("");
	System.out.print("昇順にソート後:");
	    for(int i=0;i<sort.length;i++){
		System.out.print(sort[i]+" ");
	    }
	System.out.println("");
    }
}