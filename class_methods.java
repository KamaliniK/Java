public class BoxClass {
	int length;
	int breadth;
	int height;
	
	//Method For claculatinng volume
	static int Boxvolume(int length,int breadth,int height) {
		int vol;
		vol=length*breadth*height;
		return vol;// Vol Value is returned and it is stored in a variable called  int volume in main 
	}
	
	public static void main(String[] args) {
		BoxClass black = new BoxClass();  //Object Creation
        int volume = Boxvolume(1,2,3);
        System.out.println("Volume of black box :" +  volume);
	}

}
