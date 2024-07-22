class bb
{
public static void main(String args[])
{
int x =Integer.parseInt(args[0]);
int y =Integer.parseInt(args[1]);
int z =Integer.parseInt(args[2]);

double p,s,ar;
p=(double)(x+y+z);
s=(double)(p/2);
ar=(double)(Math.sqrt(s*(s-x)*(s-y)*(s-z)));

System.out.println("PERIMITER IS="+p);
System.out.println("AREA IS="+ar);

}
}



