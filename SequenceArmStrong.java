
public class SequenceArmStrong {
	public static void main(String args[])
	{
		 int index;
	for(index=100;index<=999;index++)
	{
		int temp;
		int sum1=0;
		temp=index;
		int arm=0;
		while(temp>0)
		{
			  arm=temp%10;
			 sum1=sum1+arm*arm*arm;
			 temp=temp/10;
		}//while
		if(index==sum1){
			System.out.println(sum1);
		}//if
	}//for
}	

}
