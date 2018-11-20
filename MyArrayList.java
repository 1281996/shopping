package com.mallika.interface1;




public class MyArrayList {
	   public static int arr[];
	   int ele;
	MyArrayList(int array[])
	{
	this.arr=array;
	
	}
	void getAll(){
		 System.out.println("length=>"+arr.length);
		 for(int index=0;index<arr.length;index++){
			 System.out.println(arr[index]);
		 }//for
	}//getAll
	void get(int ele){
		for(int index=0;index<arr.length;index++){
			if(ele==arr[index]){
				System.out.println("ele is found at"+index);
			}//for
		}//get
		
	}
	void add(int pos,int ele){
		
		
        
        
	}
	
	void remove(int del){
		
		int count=0;
		
		for(int i=0; i<arr.length; i++)
	       {
	           if(arr[i] == del)
	           {
	               for(int j=i; j<(arr.length-1); j++)
	               {
	                   arr[j] = arr[j+1];
	               }
	               count++;
	               break;
	           }
	       }
	       if(count==0)
	       {
	           System.out.print("Element Not Found..!!");
	       }
	       else
	       {
	           System.out.print("Element Deleted Successfully..!!");
	           System.out.print("\nNow the New Array is :\n");
	           for(int i=0; i<(arr.length-1); i++)
	           {
	               System.out.print(arr[i]+ " ");
	           }
	       }
		
	}
   public static void main(String args[]){
	   MyArrayList myarraylist=new MyArrayList(new int[]{10,20,30,40,50});
	   //System.out.println(arr.length);
	    myarraylist.getAll();
	    myarraylist.get(30);
	    myarraylist.remove(40);
	    //myarraylist.add(2,3);
   }
   
}