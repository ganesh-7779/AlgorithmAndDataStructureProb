/*
 * Purpose :"Implementation of logic behind prime, And Palindrome Numbers"
 * @author Ganesh Gavhad
 * @version 1.0
  */
package bridgelabz;

public class PrimeNumber {

    public static void findPrime(){

    for (int i=1; i<=1000; i++) {
        int temp = 0;
        for (int j=2;j<=i-1;)
        {
            if (i%j==0)
            {
                temp=temp+1;
            }
            if(temp==0) {
                System.out.println(i);
            }
            else {
                temp=0;
            }
            break;
        }

    }
}
    /**
     * @param num Number That we have to it is Palindrome Number or Not
     * @return 1 if it is match while loop condition for palindrome number
     */
    public static int PalindromeNumber(int num)
    {
        int rev =0;
        int rem;
        int n1=num;

        while( num != 0){

            rem=num%10;  //remainder of number for reverse the number
            rev=rev*10+rem;  //reversing Numbers
            num=num/10;
        }
        if (n1==rev) {		// reverse numbers is equal to Number then return 1

            return 1;
        }
        else{

            return 0;

        }
    }
    /**
     * "This method is for selection range of numbers
     * and invoke PalindromeNumber method for checking number is palindrome or not"
     * @return Nothing
     */
    public static int palidromeRange() {
        int i;
        for(i=1;i<=1000;i++) {
            if (PalindromeNumber(i)==1)
                System.out.printf("%d\n", i);
        }
        return 0;
    }
    public static void main(String[] args) {
        findPrime();
        palidromeRange();
    }
}
