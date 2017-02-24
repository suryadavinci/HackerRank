package algorithms.dynamic;

public class CoinChangeProblem {

	static int a[]={1,2,10};
	
	public static void main(String[] args) {
		getCoinChange(0,10 , "");
	}
	
	public static void getCoinChange(int start, int expSum, String op){
	
		
		
		
		for(int i=1;i<=expSum/i;i++){
			System.out.println(i+" "+a[start]);
			if(i*a[start]>expSum)
				return;
			if(i*a[start]==expSum){
				op=op+"+ "+a[start]+"x"+i;
				System.out.println(op);
				return;
			}else
				op=op+"+ "+a[start]+"x"+i;
				getCoinChange(start, expSum, op);
		}
		
	}
	
	
	
}
