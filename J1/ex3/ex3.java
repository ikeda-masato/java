class ex3{
    public static void main(String args[]){
	int n=6,a=0,b=1;//nの初期値は変数宣言で指定
	for(a=n;a>0;a--){
	    b*=a;
	}
	System.out.println(n+"の階乗は"+b);
    }
}