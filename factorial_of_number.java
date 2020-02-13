import java.util.Scanner;

class factorial{
    public static void main(String []args){
        long n;//user defined variable 
        int sum=1;//varaible for future 
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the integer: \n");
        n= scan.nextInt();//user input store at variable n
        //now create a loop of size n 
        //and multiply the sum(1) to i (1,2,3,4...n)=sum 
        //(new sum value to be execute).
        for (int i=1; i<=n;i++){
            sum= sum*i;

        }
        System.out.println("factorial of"+n+"is:"+sum);
        scan.close();//close the scanner call


    }
}
//#############################################################
code by raz!