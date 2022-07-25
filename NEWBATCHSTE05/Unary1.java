class Unary1{

public static void main(String[] args)
{


int a=1;
int b=1;

      //   2  + 2
      a=++a + ++b;
     //  4   + 2
      b=a++ + b++;
System.out.println("a="+a);//5
System.out.println("b="+b);//6

}

}