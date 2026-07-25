package com.inheritance;

public class MainA{
	
	public static void main(String[] args) {
		
	B b = new B();
	System.out.println("value of X :"+ b.x);
	System.out.println("value of Y :"+ b.y);
    
	   }
}
-----------------------------------------------------------------------------------------------------------------------------------------------
package com.inheritance;

public class MainA {

	public static void main(String[] args) {	
  
  C c = new C();
		c.showA();
		c.showB();
		c.showC();
  }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------
package com.inheritance;

public class MainA {

	public static void main(String[] args) {
    
         B b = new B();
         b.display();
  }
}

  
