class mainoverload{

public static void main(String[] args)
{
main("Deepesh");
main();

}

public static void main(String argument)
{
System.out.println("Main method with String args ="+argument);
}
public static void main()
{
System.out.println("Main method with no parmas");
}
}