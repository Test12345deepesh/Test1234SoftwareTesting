class Unary12{

public static void main(String[] args)
{


int a=1;
int b=1;
int c=1;

       //  2  + 1   + 2
      a=++a + b++ + ++c;
         //5   + 3   + 2
      b= a++ + ++b + c++;
        // 7   + 11  + 4
      c= ++a + ++b + ++c;
System.out.println("a="+a);//7
System.out.println("b="+b);//11
System.out.println("c="+c);//22


}
}