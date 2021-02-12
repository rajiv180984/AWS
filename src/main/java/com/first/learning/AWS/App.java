package com.first.learning.AWS;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {
	public static void main(String[] args) {
   
		System.out.println("Hello World!");
		int arr[] = {24,29,70,43,12,27,29,24,41,12,41,43,24,70,24,100,41,43,43,100,29,70,100,43,41,27,70,70,59,41,24,24,29,43,24,27,70,24,27,70,24,70,27,24,43,27,100,41,12,70,43,70,62,12,59,29,62,41,100,43,43,59,59,70,12,27,43,43,27,27,27,24,43,43,62,43,70,29};
		System.out.println(" Result :"+equalizeArray(arr));
		String s = "126";
		 int x1 = -15;
		 int x = 10-15;
	//	 System.out.println(x);
		 int c=(int)'a';
		 BigInteger res = new BigInteger("1");
		 System.out.println(c);
		 
		 //System.out.println(x1%5); 
		int k = Integer.parseInt(s.substring(0, 1));
		// System.out.println(k); 1 2 3 4 5
			}

	static int findDigits(int n) {

		String str = String.valueOf(n);
		int m = str.length();
		int c = 0;
		for (int i = 0; i < m; i++) {
			int num = Character.getNumericValue(str.charAt(i));
			System.out.println("====" + num);
			if (n % num == 0) {
				c += 1;
			}
		}
		return c;
	}

	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int size = a.length;
		if (size == k) {

		} else {

			for (int i = 1; i <= k; i++) {

				int temp = a[size - 1];
				for (int j = size - 1; j - 1 >= 0; j--) {

					a[j] = a[j - 1];
				}
				a[0] = temp;

			}
		}

		int qsize = queries.length;
		int res[] = new int[qsize];

		for (int i = 0; i < qsize; i++) {
			if (i < size) {
				System.out.println("==" + i);
				res[i] = a[queries[i]];
			} else {

			}
		}
		return res;
	}

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		int s = arr.size();

		Integer[] a = new Integer[s];
		arr.toArray(a);

		if (s == d) {
			return arr;
		} else {

			for (int i = 1; i <= d; i++) {

				int temp = a[0];
				for (int j = 0; j+1 < s; j++) {

					a[j] = a[j + 1];
				}
				a[s - 1] = temp;

			}
		}

		return  Arrays.asList(a);
		// Write your code here

	}

	public static List<Integer> rotateLeft2(int d, List<Integer> arr) {
		int s = arr.size();

		List<Integer> first= new ArrayList<>();
        
		List<Integer> second= new ArrayList<>();
        
        List<Integer> res= new ArrayList<>(s);
        first = arr.subList(0, d);
        first.stream().forEach(x->System.out.print(x));
        System.out.println("===========================");
        second= arr.subList(d, s);
        second.stream().forEach(x->System.out.print(x));
        System.out.println("==========2=================");
        res.addAll(second);
        res.addAll(first);
        
        res.stream().forEach(x->System.out.print(x));
        System.out.println("==========3=================");
        
        int i=0;
        for(int x: second) {
        	res.add(i,x);
        	System.out.print(x);
        	i+=1;
        }
        for(int x: first) {
        	res.add(i,x);
        	System.out.print(x);
        	i+=1;
        }
        return res;
	}
	
	static String catAndMouse(int x, int y, int z) {
		 if(z>x && z>y){
             if((z-x)>(z-y)){
                 return "Cat B";
             }else{
                 return "Cat A";
             }
             
         }
         if(z<x || z<y ){
             if(Math.abs(z-x)==1 && Math.abs(z-y) ==1 ){
                 return "Mouse C";
             }else if(Math.abs(z-x)<Math.abs(z-y)){
                 return "Cat A";
             }else{
                 return "Cat B";
             }
             
                           }
         return null;


}

	
	static int equalizeArray(int[] arr) {
        int cn[] = new int[101];
        int l = arr.length;
        for(int i =0; i<l; i++)
        {
            cn[i] =0;
        }
        int m=-1;
        for(int i =0; i<l; i++)
        {
            cn[arr[i]]+=1;
            if(m<cn[arr[i]]){
                m = cn[arr[i]];
            }
        }
        
        
        return l-m;
}

	
}
