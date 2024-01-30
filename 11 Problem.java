Age Limit
Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

Minimum age limit is X (i.e. Age should be greater than or equal to X).
Age should be strictly less than Y.
Chef's current Age is A. Find whether he is currently eligible to take the exam or not.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers ,X,Y, and A as mentioned in the statement.
  
Output Format
  
For each test case, output YES if Chef is eligible to give the exam, NO otherwise.
You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).


Soluction:-

import java.util.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,a,b,c,T;
        T = sc.nextInt();
        for(i=0;i<T;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a<=c && c<b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
