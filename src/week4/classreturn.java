/**
 * 
 */
package week4;

/**
 * @author Tanvir
 *
 */
public class classreturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		classreturn cc=new classreturn();
		
		
		System.out.println(cc.lac(25,30));
	}
		public boolean lac(int q,int b) {
			int res=q+b;
			boolean bl;
			if(res>=50) {
				bl=true;
			}
				else
				{
					bl=false;}
			return bl;
		}
	}
	
