
public class Overs {
	int[] ball={0,0,0,0,0,0,0};
	int sum=0;

	public Overs(int[] s) {
		for(int i=0;i<6;i++)
			ball[i]=(s[i]);
	}
	
	public int getscore(int i){
		int sum=ball[i-1];
		return sum;
	}

	public int getBall() {
		for(int i=0;i<6;i++)
			 sum=sum+ball[i];
		return sum;
	}
	
	
}
