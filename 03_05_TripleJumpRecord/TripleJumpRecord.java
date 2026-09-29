
public class TripleJumpRecord {
	public static void main(String[] args) {
		
	double record = 18.29;
	
	double jump1 = 15.58;
	double jump2 = 18.35;
	double jump3 = 17.26;
	double jump4 = 18.31;
	
	double highest1and2 = Math.max(jump1,jump2);
	double highest3and4 = Math.max(jump3,jump4);
	double NewRecord = Math.max(highest1and2, highest3and4);
	
	int AboveRecord = (int)Math.ceil(NewRecord);
	int BelowRecord = (int)Math.floor(NewRecord);
	
	System.out.println("The current record is now "+NewRecord+" " + "meters");
	System.out.println("The current record is below "+AboveRecord+" "+"meters");
	System.out.println("The current record is above "+BelowRecord+" "+"meters");
	
		
	}	
	
}