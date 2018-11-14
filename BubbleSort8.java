package interviewquestions1;

public class BubbleSort8 {
	public static void main(String args[]) {
		
	
	 int a[]= {5,6,1,9,3,7};
	 int num=a.length;
	 for(int index=0;index<num-1;index++)
	 {
		 for(int index1=1;index1<num-index-1;index1++)
		 {
			 if(a[index1]>a[index1+1])
			 {
				int temp=a[index1];
				    a[index1]=a[index1+1];
				    a[index1+1]=temp;
			 }
		 }
	 }
	 
	 for(int index=0;index<num;index++) {
		 System.out.println(a[index]);
	 }
	} 

}
