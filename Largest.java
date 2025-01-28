public class Largest{
	public static void main(String x[]){
		int a[]={2,3,4,5};
		int b[]=new int[a.length];
		int t=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>t){
				t=a[i];
			}
		}
		for(int i=0;i<a.length;i++){
			if(t==a[i])
				continue;
			else
				b[i]=a[i];
		}
		t=b[0];
		for(int i=0;i<b.length;i++){
			if(b[i]>t){
				t=b[i];
				break;
			}
		}
		System.out.println("2nd Largest "+t);
	}
}