class Methodreturn
{

public static int methodAdd(int a,int b){

int sum=a+b;
return sum;
}

public static String Mydetail(String name){

String Myname=name+"Raj";
return Myname;
}

public static boolean checkstatus(boolean b){

return b;

}
public static void main(String[] args){

System.out.println("Main starts");
System.out.println(methodAdd(83,48));
String s=Mydetail("Deepesh");
 System.out.println("Name:-"+s);
System.out.println("Status="+(checkstatus(false)));
System.out.println("Main ends");


}
}