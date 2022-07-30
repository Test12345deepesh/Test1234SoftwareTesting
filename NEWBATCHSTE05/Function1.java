class Function1 {

//Create a Method/function
//Syntax
static void methodname1(){//Method signature
//Method body
System.out.println("Methodname1 in Function1 class");
}



public static void main(String[] args)
{
System.out.println("Main starts");
methodname1();
methodname1();
methodname1();
method2();
System.out.println("Main Ends");

}

public static void method2(){
int a=345;
int b=398;
System.out.println("Sum="+(a+b));
}



}