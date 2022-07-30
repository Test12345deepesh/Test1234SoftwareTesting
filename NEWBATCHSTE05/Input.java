class Input{

public static void main(String[] args)
{

 java.util.Scanner scn=new java.util.Scanner(System.in);
    System.out.println("Enter the value");
 
int a=scn.nextInt();
System.out.println("Enter the String value");
String name=scn.next();
System.out.println("Enter the double value");
double d=scn.nextDouble();
System.out.println("Enter the String value");
char c=scn.next().charAt(2);
System.out.println("Enter the double value");
System.out.println("Name="+name);
System.out.println("a="+a);
System.out.println("d="+d);
System.out.println("c="+c);
}
}
