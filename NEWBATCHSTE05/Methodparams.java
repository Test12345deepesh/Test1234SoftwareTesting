class Methodparams
{

public static void  methodAdd(int a,int b){//parameters

System.out.println("Sum="+(a+b));
}

public static void main(String[] args)
{
System.out.println("Main starts");
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the 1st number");
int a=scn.nextInt();
System.out.println("Enter the 2nd number");
int b=scn.nextInt();
methodAdd(a,b);//Arguments

System.out.println("Main ends");


}



}