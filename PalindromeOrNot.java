import java.util.Scanner;

public class PalindromeOrNot{
    static void checkPalindrome(String str){
        //Assuming the result to be true
        boolean result = true;
        int length = str.length();
        //dividing the length of the string by 2 and comparing it.
        for(int i=0; i<=length/2;i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                result = false;
                break;
               

            }


        }
        System.out.print(str+" is palindrome = "+result);
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in); //madam is input
        System.out.print("Enter your statement: ");
        String output = input.nextLine();
        //function call
        checkPalindrome(output);
        
    }
   
}

