Candy Store

Chef has started working at the candy store. The store has 100 chocolates in total.

Chef’s daily goal is to sell X chocolates. For each chocolate sold, he will get 1 rupee. However, if Chef exceeds his daily goal, 
he gets 2 rupees per chocolate for each extra chocolate.

If Chef sells Y chocolates in a day, find the total amount he made.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers X andY — the daily goal of Chef, and the number of chocolates he actually sells.

Output Format
For each test case, output on a new line the total amount Chef made in a day.

Soluction :- 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(y>x)
            {
                System.out.println(x+2*(y-x));
            }
            else
            {
                System.out.println(y);
            }
        }
    }
}

Input :-

4
3 1
5 5
4 7
2 3

Output :-

1
5
10
4
