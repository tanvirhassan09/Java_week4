/**
 * 
 */
package week4;

/**
 * @author Tanvir
 *
 */
public class classwork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		classwork cr=new classwork();
		//cr.work();
		int ss=cr.total(10,20,30);
		System.out.println(ss+100);

	}
	public void work(){
	int a=10;
	int b=30;
	int c=20;
	System.out.println((a+b)-c);
	}
	
	public int total(int a,int b,int c) {
	 int total=(a+b+c);
		return total;
		
		
		
	}
}
