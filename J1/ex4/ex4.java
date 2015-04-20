class ex4{
    public static void main(String args[]){
	double a=-5.0,b=6.0,c=1.0,D=0,kai1=0,kai2=0;//a,b,cは変数宣言時に指定
	D=b*b-4*a*c;

	if(D>0){
	    kai1=(-b+Math.sqrt(D))/(2*a);
	    kai2=(-b-Math.sqrt(D))/(2*a);
	    System.out.println("a="+a+",b="+b+",c="+c+"のとき解は"+kai1+"と"+kai2+"です。");
	}
	else if(D==0){
	    kai1=-b/(2*a);
	    System.out.println("a="+a+",b="+b+",c="+c+"のとき解は"+kai1+"です。");
	}
	else{
	    System.out.println("a="+a+",b="+b+",c="+c+"のとき虚数解です。");
	}

    }
}