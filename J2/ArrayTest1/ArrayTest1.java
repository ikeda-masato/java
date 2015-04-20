class ArrayTest1{
    public static void main(String args[]){
	int x[]; //define an array variable x.

	x=new int[3];
	//"x.lengs" equals a number of elements of the
	//array x. (i.e. x.length==3 in this case)
	
	for(int i=0;i<x.length;i++){
	    x[i]=i*i;
	}

	for(int i=0;i<x.length;i++){
	    System.out.println(x[i]);
	}

	int y[]=new int[6];

	y[0]=1;
	y[1]=1;
	for(int i=2;i<y.length;i++){
	    y[i]=y[i-1]+y[i-2];
	}
	
	for(int i=0;i<y.length;i++){
	    System.out.println(y[i]);
	}
	
	int z[]={10,20,30,40,50};

	for(int i=0;i<z.length;i++){
	    System.out.println(z[i]);
	}
    }
}