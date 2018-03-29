import static org.junit.Assert.*;

import org.junit.Test;

public class OversTest {
	@Test
	public void testOvers() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetBall() {
		//fail("Not yet implemented");
		int[] scr= new int[6];
		int sum=0;
		scr[0]=1;
		scr[1]=2;
		scr[2]=1;
		scr[3]=1;
		scr[4]=1;
		scr[5]=1;
		Overs over=new Overs(scr);
		sum=over.getBall();
		assertEquals(7,sum);
		System.out.println("The Total Score is " +sum);
	}

	@Test
	public void testGetscore() {
		//fail("Not yet implemented");
		int sum;
		int[] scr=new int[6];
		scr[0]=1;
		scr[1]=2;
		scr[2]=1;
		scr[3]=1;
		scr[4]=0;
		scr[5]=0;
		Overs over=new Overs(scr);
		sum=over.getBall();
		assertEquals(5,sum);
		
	}

}
