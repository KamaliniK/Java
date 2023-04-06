// This keyword is used when we are using same name for instance variables and for the parameters
//But generally we have to avoid giving same names 
//If this is not given JVM defaultly make it as This 
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
	void setDim(int length,int breadth,int heigth){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	int volume() {
		return length*breadth*height;
	}
}


public class This{
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
