Oneful Pairs

a+b+(a⋅b)=111

input = 1 55 & 1 56

1+55+(1⋅55)=56+55=111.
1+56+(1⋅56)=57+56=113(Wrong !)

Given two positive integers a and b, output Yes if they are a Oneful Pair. And No otherwise.

Soluction:-

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a+b+(a*b));
		if(c==111){
		    System.out.println("YES");
		}
	    else{
	        System.out.println("NO");
	    }	
	}
}
