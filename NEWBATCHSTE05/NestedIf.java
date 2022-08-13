class NestedIf
{

public static void main(String[] args)
{

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enmter the number");

int a=scn.nextInt();

if(a%2==0)
    {
    if(a%5==0)
          {
            System.out.println("Number is divisible by 2 and 5");
           }
          else {
                 System.out.println("Number is divisible by 2 only"); 
               }
     }else{
            System.out.println("Number is  not divisible by 2 and 5");
}



}



}