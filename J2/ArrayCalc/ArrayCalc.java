class ArrayCalc{
    public static void main(String args[]){

	int array1[]={12,28,34,46,55};
	int array2[]={2,8,4,6,5};
	int add[]=new int[5];
	int sub[]=new int[5];
	int mult[]=new int[5];
	double div[]=new double[5];
	    
	System.out.println("=== 加算結果 ===");
	for(int i=0;i<array1.length;i++){
	    add[i]=array1[i]+array2[i];
	    sub[i]=array1[i]-array2[i];
	    mult[i]=array1[i]*array2[i];
	    div[i]=(double)array1[i]/(double)array2[i];
	}
	for(int i=0;i<array1.length;i++){
	System.out.println(array1[i]+"+"+array2[i]+"="+add[i]);
	}
	System.out.println("=== 減算結果 ===");
	for(int i=0;i<array1.length;i++){
	    System.out.println(array1[i]+"-"+array2[i]+"="+sub[i]);
	}
	System.out.println("=== 乗算結果 ===");
	for(int i=0;i<array1.length;i++){
	    System.out.println(array1[i]+"*"+array2[i]+"="+mult[i]);
	}
	System.out.println("=== 加算結果 ===");
	for(int i=0;i<array1.length;i++){
	    System.out.println(array1[i]+"/"+array2[i]+"="+div[i]);
	}

    }
}