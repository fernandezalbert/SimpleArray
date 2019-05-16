package org.array.sample;

public class SampleArray {
public static void main(String[] args) {
	int a[]=new int[5];
	a[1]=10;
	a[0]=80;
	a[2]=60;
	a[4]=20;
	a[3]=90;
	//to find the length of the array
	int len=a.length;
	System.out.println(len);
	System.out.println(a[3]);
	//to print all the value in the array (one by One)
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
		}
	//enhanced for loop
		System.out.println("Enhanced For Loop");
	for(int j:a) {
		System.out.println(j);
	}
}
}
