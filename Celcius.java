class Celcius 
{
public static void main(String args[])
{
int f = Integer.parseInt(args[0]);
double c = (f-32.0)*(5.0/9.0);

System.out.println("In celcius:"+c);
}
}