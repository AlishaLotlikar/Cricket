import static org.junit.Assert.*;

public class Test {
	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	public void getBall(){
		int[] scr= new int[3];
		int score=0;
		scr[0]=1;
		scr[1]=1;
		scr[2]=1;
		Overs over=new Overs(scr);
		score=over.getBall();
		assertEquals(3,score);
		
	}
	void displayDeails(){
		System.out.print("=================Cricket Score Board===============");
		System.out.println("The Total Score");
	}

}
