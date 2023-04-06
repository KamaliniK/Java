package programs1;
class Box{
	int length;
	int breadth;
	int height;
	
	// Constructor
	Box(int l,int b,int h){
		length=l;
		breadth=b;
		height=h;
	}
	
	// Using Seperate method for getting values
	void setDim(int l,int b,int h){
		length=l;
		breadth=b;
		height=h;
	}
	
	int volume() {
		return length*breadth*height;
	}
}


public class constructor{
	public static void main(String[] args) {
		Box black;
		black=new Box(10,20,30);// Constructor only for initializing values not for changing
		//Assingning values 
		black.setDim(2, 3, 3);
		System.out.println(black.volume()); //18
		black.setDim(2, 2, 3);
		System.out.println(black.volume()); //12
	}
}
