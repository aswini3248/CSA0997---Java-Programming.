import java.util.*;
class revnum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        int i,r,rev=0;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.print("Reversed number is: "+rev);
    }
}
