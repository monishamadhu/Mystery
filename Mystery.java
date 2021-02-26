package week3.mystry;

import acm.program.*; 
public class Mystery extends ConsoleProgram { 
	public void run() {
		 ghost(13); 
	} 
	private void ghost(int x) { 
		int y = 0;            
		for (int i = 1; i < x; i *= 2) {  
			y = witch(y, skeleton(x, i)); 
		} 
		println("ghost: x = " + x + ", y = " + y); 
	} 
	private int witch(int x, int y) { 
		x = 10 * x + y; 
		println("witch: x = " + x + ", y = " + y); 
		return x; 
	} 
	private int skeleton(int x, int y) { 
		return x / y % 2; 
	} 
} 
/*y=0; x=13;i=1;

y=witch(0,skeleton(13,1))
  =witch(0,(13/1%2))
  = witch(0,1)                      witch x:1 y:1
  =10*0+1=1                       
----------------------------------------
y=1; x=13;i=2;

y=witch(1,skeleton(13,2))
  =witch(1,(13/2%2))
  = witch(1,0)                             witch x:10 y: 0
  =10*1+0=10
------------------------------------------------------
y=10; x=13;i=4;

y=witch(10,skeleton(13,4))
  =witch(10,(13/4%2))
  = witch(10,1)                             witch x:101 y: 1
  =10*10+1=101
---------------------------------------------------------
y=101; x=13;i=8;

y=witch(101,skeleton(13,8))
  =witch(101,(13/8%2))
  = witch(101,1)                             witch x:1011 y: 1
  =10*101+1=1011
--------------------------------------------------------------
ghost x: 13 y:1011*/
