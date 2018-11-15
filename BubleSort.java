package com.mallika.ds;

public class BubleSort {
	public void bubbleSort(int a[]){
		{ 
			int n=a.length;
			int index1,index2,temp;
			for(index1=1;index1<=n-1;index1++){
				 for(index2=0;index2<=n-index1-1;index2++){
					  if(a[index2]>a[index2+1]){
						  temp=a[index2];
						  a[index2]=a[index2+1];
						  a[index2+1]=temp;
					  }//if
				 }//for
			}//for
			
			for( index1=0;index1<n;index1++){
				System.out.println(a[index1]);
			}
			}
				
		}//bubblesort
		
	}
	


