package TypeCasting;

public class TypeCasting {
		
		public static void charToAll() {
		//1.char to char					//type      DataType - byte
		char a = 'x';
		char b = a;						//Implicit: char - 2, char - 2
		System.out.println(b);
		
		//2.char to byte 					
		byte c = (byte)a;				//Explicit: byte - 1, char- 2
		System.out.println(c);
		
		//3.char to short 
		short d = (short)a;				//Explicit: short - 2, char- 2
		System.out.println(d);
		
		//4.char to int
		int e = a;						//Implicit: int - 4, char- 2
		System.out.println(e);
		
		//5.char to long
		long f = a;						//Implicit: long - 8, char- 2
		System.out.println(f);
		
		//6.char to float
		float g = a;					//Implicit: float - 4, char- 2
		System.out.println(g);
		
		//7.char to double
		double h = a;					//Implicit: double - 8, char- 2
		System.out.println(h);
		
		/* error
		//8.char to boolean
		boolean i = a;					//Error: boolean - 1(OS dependent), char- 2
		System.out.println(i);
		*/
	}
		
		public static void byteToAll() {
			//1.byte to char					//type      DataType - bytes
			byte a = 10;
			char b = (char)a;					//Explicit: char - 2,  byte - 1
			System.out.println(b);
			
			//2.byte to byte 					
			byte c = a;							//Implicit: byte - 1,  byte - 1
			System.out.println(c);
			
			//3.byte to short 
			short d = a;						//Implicit: short - 2, byte - 1
			System.out.println(d);
			
			//4.byte to int
			int e = a;							//Implicit: int - 4,   byte - 1
			System.out.println(e);
			
			//5.byte to long
			long f = a;							//Implicit: long - 8, byte - 1
			System.out.println(f);
			
			//6.byte to float
			float g = a;						//Implicit: float - 4, byte - 1
			System.out.println(g);
			
			//7.byte to double
			double h = a;						//Implicit: double - 8, byte - 1
			System.out.println(h);
			
			/* error
			//8.byte to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), byte - 1
			System.out.println(i);
			*/
		}
		
		public static void shortToAll() {
			//1.short to char					//type      DataType - bytes
			short a = 10;
			char b = (char)a;					//Explicit: char - 2,  short - 2
			System.out.println(b);
			
			//2.short to byte 					
			byte c = (byte)a;					//Explicit: byte - 1,  short - 2
			System.out.println(c);
			
			//3.short to short 
			short d = a;						//Implicit: short - 2, short - 2
			System.out.println(d);
			
			//4.short to int
			int e = a;							//Implicit: int - 4,   short - 2
			System.out.println(e);
			
			//5.short to long
			long f = a;							//Implicit: long - 8,  short - 2
			System.out.println(f);
			
			//6.short to float
			float g = a;						//Implicit: float - 4, short - 2
			System.out.println(g);
			
			//7.short to double
			double h = a;						//Implicit: double - 8, short - 2
			System.out.println(h);
			
			/* error
			//8.short to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), short - 2
			System.out.println(i);
			*/
		}
		
		public static void intToAll() {
			
			//1.int to char						//type      DataType - bytes
			int a = 10;
			char b = (char)a;					//Explicit: char - 2,  int - 4
			System.out.println(b);
			
			//2.int to byte 					
			byte c = (byte)a;					//Explicit: byte - 1,  int - 4
			System.out.println(c);
			
			//3.int to short 
			short d = (short)a;					//Explicit: short - 2, int - 4
			System.out.println(d);
			
			//4.int to int
			int e = a;							//Implicit: int - 4,   int - 4
			System.out.println(e);
			
			//5.int to long
			long f = a;							//Implicit: long - 8,  int - 4
			System.out.println(f);
			
			//6.int to float
			float g = a;						//Implicit: float - 4, int - 4
			System.out.println(g);
			
			//7.int to double
			double h = a;						//Implicit: double - 8, int - 4
			System.out.println(h);
			
			/* error
			//8.int to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), int - 4
			System.out.println(i);
			*/
		}
		
		public static void longToAll() {
			//1.long to char					//type      DataType - bytes
			long a = 10l;
			char b = (char)a;					//Explicit: char - 2,  long - 8
			System.out.println(b);
			
			//2.long to byte 					
			byte c = (byte)a;					//Explicit: byte - 1,  long - 8
			System.out.println(c);
			
			//3.long to short 
			short d = (short)a;					//Explicit: short - 2, long - 8
			System.out.println(d);
			
			//4.long to int
			int e = (int)a;						//Explicit: int - 4,   long - 8
			System.out.println(e);
			
			//5.long to long
			long f = a;							//Implicit: long - 8,  long - 8
			System.out.println(f);
			
			//6.long to float
			float g = a;						//Implicit: float - 4, long - 8
			System.out.println(g);
			
			//7.long to double
			double h = a;						//Implicit: double - 8, long - 8
			System.out.println(h);
			
			/* error
			//8.long to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), long - 8
			System.out.println(i);
			*/
		}
		
		public static void floatToAll() {
			//1.float to char					//type      DataType - bytes
			float a = 10f;
			char b = (char)a;					//Explicit: char - 2,  float - 4
			System.out.println(b);
			
			//2.float to byte 					
			byte c = (byte)a;					//Explicit: byte - 1,  float - 4
			System.out.println(c);
			
			//3.float to short 
			short d = (short)a;					//Explicit: short - 2, float - 4
			System.out.println(d);
			
			//4.float to int
			int e = (int)a;						//Explicit: int - 4,   float - 4
			System.out.println(e);
			
			//5.float to long
			long f =(long)a;					//Explicit: long - 8,  float - 4
			System.out.println(f);
			
			//6.float to float
			float g = a;						//Implicit: float - 4, float - 4
			System.out.println(g);
			
			//7.float to double
			double h = a;						//Implicit: double - 8, float - 4
			System.out.println(h);
			
			/* error
			//8.float to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), float - 4
			System.out.println(i);
			*/
		}
		
		public static void doubleToAll() {
			//1.double to char					//type      DataType - bytes
			double a = 10.00;
			char b = (char)a;					//Explicit: char - 2,  double - 8
			System.out.println(b);
			
			//2.double to byte 					
			byte c = (byte)a;					//Explicit: byte - 1,  double - 8
			System.out.println(c);
			
			//3.double to short 
			short d = (short)a;					//Explicit: short - 2, double - 8
			System.out.println(d);
			
			//4.double to int
			int e = (int)a;						//Explicit: int - 4,   double - 8
			System.out.println(e);
			
			//5.double to long
			long f = (long)a;							//Explicit: long - 8,  double - 8
			System.out.println(f);
			
			//6.double to float
			float g = (float)a;						//Explicit: float - 4, double - 8
			System.out.println(g);
			
			//7.double to double
			double h = a;						//Implicit: double - 8, double - 8
			System.out.println(h);
			
			/* error
			//8.double to boolean
			boolean i = a;						//Error: boolean - 1(OS dependent), double - 8
			System.out.println(i);
			*/
		}
		
		public static void booleanToAll() {
			
												//type      DataType - byte
			boolean a = true;
			/*
			//1.boolean to char	
			char b = a;							//Error:	char - 2,  boolean - 1
			System.out.println(b);
			
			//2.boolean to byte 					
			byte c = (byte)a;					//Error:	 byte - 1,  boolean - 1
			System.out.println(c);
			
			//3.boolean to short 
			short d = a;						//Error: short - 2, boolean - 1
			System.out.println(d);
			
			//4.boolean to int
			int e = a;							//Error: int - 4,   boolean - 1
			System.out.println(e);
			
			//5.boolean to long
			long f = a;							//Error: long - 8,  boolean - 1
			System.out.println(f);
			
			//6.boolean to float
			float g = a;						//Error: float - 4, boolean - 1
			System.out.println(g);
			
			//7.boolean to double
			double h = a;						//Error: double - 8, boolean - 1
			System.out.println(h);
			
			*/
			
			//8.boolean to boolean
			boolean i = a;						//Implicit: boolean - 1(OS dependent), boolean - 1
			System.out.println(i);
		
		}
		
		public static void main(String[] args) {
			charToAll();
			byteToAll();
			shortToAll();
			intToAll();
			longToAll();
			floatToAll();
			doubleToAll();
			booleanToAll();
		}
}
