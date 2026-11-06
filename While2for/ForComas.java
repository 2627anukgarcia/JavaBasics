public class ForComas{
	public static void main (String[] args){
		
	for(int i=0;i <= 20; i+=2){
	
		if(i<10){
		System.out.printf("%2d,",i);
		}else if(i>=10&&i<20){
			System.out.printf("%3d,",i);
		}else if(i==20){
			System.out.printf("%3d %n",i);
		}
	}	
		
	
	}
}