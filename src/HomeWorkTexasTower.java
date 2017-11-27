
public class HomeWorkTexasTower {
	public static final int SIZE = 3;

	/*Main Method where I divided four separated parts.
	 * bellTower
	 * bellMiddle
	 * bellBottom
	 * bellRoot
	 * Also te4sted with SIZE with different variables and it was good to go
	 * Only thing was since margin was hard coded the bottom of the tower for 4 looks bit un-balance
	 */
	public static void main(String args[]) {
		bellTower();
		bellMiddle();
		bellBottom();
		bellRoot();
	}
	/*bellTower covers the sharps and Straight Lines ( | ) of the top, 
	also used do while loop for repeating the straight line.*/
	
	public static void bellTower() {
		int i;
		int x = 0;
		int topRoof = (SIZE*2)-1;
		int topStem = (SIZE*2)-2;
		
		System.out.print("\t"+"\t"+"\t"); //Setting up Margins for the tower
		for ( i = 0; i < topRoof; i++) {
			System.out.print("#");
		}
			System.out.println("");
		do {
			System.out.print("\t"+"\t"+"\t"); //Setting up Margins for the tower
			for(i = 0; i < topRoof;i++ )
				System.out.print("|");
				System.out.println("");
				x++;
		}while(x < topStem);
		
		System.out.print("\t"+"\t"+"\t"); //Setting up Margins for the tower
		for ( i = 0; i < topRoof; i++) {
			System.out.print("#");
		}
	}
	/* bellMiddle handles all of the logics for -0 
	 * Also used do while loop for the length of the tower
	 * */
	public static void bellMiddle() {
		int i;
		int x;
		int z = 0;
		int midStem = (SIZE*3);
		int midStemThird = (SIZE*3)/3;
		int midStemMultThree = (SIZE*3)*3;
		
		System.out.print("\t"+"\t"+"      "); //Setting up Margins for the tower
		System.out.println("");
		
		do {
			System.out.print("\t"+"\t"+"      "); //Setting up Margins for the tower
			for(i = 0; i <  midStem; i++) {
				System.out.print("~");
			}
				System.out.println("");
				System.out.print("\t"+"\t"+"      "); //Setting up Margins for the tower
				System.out.print("|");
			
				for(x= 0; x< midStemThird; x++) {
					System.out.print("-");
					System.out.print("0");
				z++;
			}
			System.out.print("-" +"|");
			System.out.println("");
		}while (z < midStemMultThree);	
		
		System.out.print("\t"+"\t"+"      "); //Setting up Margins for the tower
		for(i = 0; i <  midStem; i++) {
			System.out.print("~");
		}
			System.out.println("");
	}
	/* bellBottom cover the two lines with /'"\
	 * Also used char 34 and char 92 to close the lines up since I had some problem
	 * closing it up
	 * */
	
	public static void bellBottom() {
		int i;
		int bottomStem = (SIZE*3);
		int bottomStemTwo = (SIZE*4);
		
		System.out.print("\t"+"\t");
		System.out.print("/");
		for(i = 0; i < bottomStem;i++ ) {
		System.out.print("\"'");
		}
		System.out.print((char)34);
		System.out.println((char)92);
		
		System.out.print("\t"+"     "); //Setting up Margins for the tower
		System.out.print("/");
		for(i = 0; i < bottomStemTwo;i++ ) {
		System.out.print("\"'");
		}
		System.out.print((char)34); //used char 34 for (")
		System.out.print((char)92); // used char 92 for (\)
	}
	/*bellRoot covers /"0"\ part of the GUI
	 * Also used Char 34 and Char92 to close off the line
	 * */
	public static void bellRoot() {
		int i;
		int x = 0;
		int rootStem = (SIZE*5);
		int rootStemMultOne = (SIZE*1);
		
		do {
			
		System.out.println("");
		System.out.print("\t"+"   "); //Setting up Margins for the tower
		System.out.print("/");
		for(i = 0; i < rootStem; i++)
			System.out.print("\"O");
			x++;
		System.out.print((char)34); ////used char 34 for (")
		System.out.print((char)92); // used char 92 for (\)
		
		}while(x < rootStemMultOne);
		
	}
}
