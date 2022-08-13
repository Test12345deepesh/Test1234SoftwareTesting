class Multiplecondition
{

public static void main(String[] args)
{

java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enmter the number");

int a=scn.nextInt();

     if(a%2==0&&a%4==0)
         {
          System.out.println("Number is even number");
           }else{
             System.out.println("Number is odd number");
          }
}
}