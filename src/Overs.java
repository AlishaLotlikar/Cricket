
public class Overs {
	Balls[] ball=new Balls[6];

	public void setBall(int s[]) {
		for(int i=0;i<6;i++)
			ball[i].score=s[i];
		
	}

	public int getBall() {
		int sum=0;
		for(int i=0;i<6;i++)
			 sum=ball[i].score;
		return sum;
	}
	
	
}
