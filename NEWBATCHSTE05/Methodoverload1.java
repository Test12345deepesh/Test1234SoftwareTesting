class Methodoverload1{
//Method Overloading
public static int add(int a, int b){
return a+b;
}
public static double add(double d1,double d2){
return d1+d2;
}
public static double add(int a, int b){
return a+b;
}

public static void main(String[] args)
{
System.out.println(add(34,54));
System.out.println(add(43.21,56.66));

}
}