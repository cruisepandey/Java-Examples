package com.practice.all;

public class OverloadingTest {
	
	public void overloadingTestcaseOne(int inttype){
		System.out.println("------Int-Type------");
	}
	
	public void overloadingTestcaseOne(float  floattype){
		System.out.println("------Float-Type------");
	}
	
	public void overloadingTestcasetwo(String str){
		System.out.println("------String-Type------");
	}
	
	public void overloadingTestcasetwo(Object obj){
		System.out.println("------Object-Version------");
	}
	
	public void overloadingTestcasethree(String str){
		System.out.println("-----String-Version------");
	}
	
	public void overloadingTestcasethree(StringBuffer strbfr){
		System.out.println("------StringBuffer-Version------");
	}
	
	public void overloadingTestcaseFour(int intt, float floatt){
		System.out.println("-----int-float-Version------");
	}
	
	public void overloadingTestcaseFour(float floatt, int intt){
		System.out.println("-----float-int-Version------");
	}
	
	public void overloadingTestcaseFive(int x){
		System.out.println("----- General int method ------");
	}
	
	public void overloadingTestcaseFive(int...x){
		System.out.println("-----Variable-arguments------");
	}
	
	public void overloadingTestcaseSix(Animal anml){
		System.out.println("-----Animal------");
	}
	
	public void overloadingTestcaseSix(Monkey mnky){
		System.out.println("-----Monkey------");
	}
	
	public static void main(String[] args) {
		
		OverloadingTest ot = new OverloadingTest();
		ot.overloadingTestcaseOne(5);
		ot.overloadingTestcaseOne(5f);
		ot.overloadingTestcaseOne(5l);
    //  ot.overloadingTestcaseOne(5.0);  // CE : 5.0 is type of dobule. Can't type promote.
		ot.overloadingTestcaseOne('a');  // a is char but can be type promoted to int
		
    //  ---------------------------------------
		
		ot.overloadingTestcasetwo(new Object());
		ot.overloadingTestcasetwo("cruise");
		ot.overloadingTestcasetwo(null);     // If there is comparison between Parent(Object class) and Child (String class ), then Child will be preferred.
		
    //  ---------------------------------------
		ot.overloadingTestcasethree("tom");
		ot.overloadingTestcasethree(new StringBuffer("string"));
    //  ot.overloadingTestcasethree(null);  // String class and StringBuffer are at same level (Siblings), Complier won't be able to differentiate (Ambiguous)  
		
    //  ---------------------------------------
		
		ot.overloadingTestcaseFour(5, 5f);
		ot.overloadingTestcaseFour(5f, 5);
    //	ot.overloadingTestcaseFour(5, 5);   // CE :  Ambiguity found (Not able to differentiate between overloadingTestcaseFour methods)
    //	ot.overloadingTestcaseFour(5f,5f);  // CE :  Ambiguity found (Not able to differentiate between overloadingTestcaseFour methods)

    //  ---------------------------------------
		
		ot.overloadingTestcaseFive();    
		ot.overloadingTestcaseFive(10);
		ot.overloadingTestcaseFive(10,10);
		
	//  ---------------------------------------	
		
		Animal anml = new Animal();
		Monkey mnky = new Monkey();
		Animal anml1 = new Monkey();
		ot.overloadingTestcaseSix(anml);
		ot.overloadingTestcaseSix(mnky);
		ot.overloadingTestcaseSix(anml1);
	}
}
