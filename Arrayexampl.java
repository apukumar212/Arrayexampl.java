package com.pack1;
import java.util.Arrays;
public class Arrayexampl 
{
void meth1()
{
	int arr1[];
	arr1=new int[5];
	int arr2[]=new int[4];
	int arr3[]={100,200,300};
	int arr4[]=new int[] {15,25,35,45,55,65};
	
	String s="java";
	System.out.println("length of string:"+s.length());
	System.out.println("-----------------------------");
	System.out.println("length of arr1:"+arr1.length);
	System.out.println("length of arr2:"+arr2.length);
	System.out.println("length of arr3:"+arr3.length);
	System.out.println("length of arr4:"+arr4.length);
	System.out.println("-----------------------------");
	System.out.println(arr1[0]);
	//System.out.println(arr1[arr1.length]));
	System.out.println(arr2[arr4.length-arr3.length]);
	System.out.println(arr3[s.length()-arr3.length]); //200
	System.out.println(arr4[-(Arrayexampl.meth2()-'B')+arr3.length]);
	System.out.println("-----------------------------");

arr1[1]=20;
arr1[3]=40;
    System.out.println("arr1:"+Arrays.toString(arr1));
    System.out.println("arr2:"+Arrays.toString(arr2));
    System.out.println("arr3:"+Arrays.toString(arr3));
    System.out.println("arr4:"+Arrays.toString(arr4));
    System.out.println("-----------------------------");
    
    System.out.println("Reteriving the data in forward direction by using for loop");
    for(int i=0;i<arr4.length;i++)
    {
    	System.out.print(arr4[i]+" ");
    }
    System.out.println();
    System.out.println("Reteriving the data in reverse direction by using for loop");
    for(int i=arr4.length-1;i>=0;i--)
    {
    	System.out.print(arr4[i]+" ");
    }
    System.out.println();
    System.out.println("Reteriving the data  by using for-each loop");
    for(int x:arr4)
    {
    	System.out.print(x+" ");
    }
}
static char meth2()
{
	System.out.println("meth2() called");
	return 'A';
}
public static void main(String[] args) 
{
	Arrayexampl aobj=new Arrayexampl ();
	aobj.meth1();
}
}








