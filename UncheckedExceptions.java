public class Main
{
    
	public static void main(String[] args) {
		int a=5,b=0;
		int c=0;
	    int arr[]= new int[5];
		try{
		    System.out.println(arr[5]);
		    int arr1[]=null;
		    System.out.println(arr1[4]);
		    c=a/b;
		}
		catch(ArithmeticException ae){
	        System.out.println("ArithmeticException occured");		    
		}
		catch(NullPointerException np){
		    System.out.println("NullPointer Exception occured");
		}
			catch(ArrayIndexOutOfBoundsException ai){
		    System.out.println("ArrayIndexOutOfBounds Exception occured");
		}
	
	}
}
