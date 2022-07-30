class Methodoverload{
//Method Overloading
public static void add(int a, int b){
System.out.println(a+b);
}
public static void add(double d1,double d2)
{
System.out.println(d1+d2);
}
public static void add(int a,int b,int c)
{
System.out.println(a+b+c);
}

public static void main(String[] args)
{
    add(34.32,54.32);
     add(34,21);
     add(43,23,43);
}

}