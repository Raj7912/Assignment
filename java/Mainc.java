class Mainc
{
    
    static double h,b;

public static void main(String[] args)
{
b=36;
h=56;
Tri t1=new Tri();
double q=t1.triangle(b,h);
System.out.println(q);
Eve_odd e1=new Eve_odd();
e1.evod(q);
}


}
class Tri
{

double triangle(double b,double h)
{
double area=0.5*b*h;
return area;

}

}
class Eve_odd
{
void evod(double q)
{
if(q%2==0)
{
System.out.println(q+" is even");
if(q>100)
{
System.out.println(q+" is greter than 100");

}
else{

System.out.println(q+" is less than 100");

}
}
}
}
