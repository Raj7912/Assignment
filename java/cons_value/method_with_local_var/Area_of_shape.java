class Area_of_shape
{
	static double pi=3.142,r=12.0,w=20.0,angle=30,a=12.0,b=20.0,h=12.0,radian=30*(pi/180),area;
static void triangle()
{

area=0.5*b*h;
	System.out.println("Area of a triangle with base "+b+" and hight "+h+" is = "+area);
	




}
static void sqr()
{


area=b*b;
	System.out.println("Area of a square with base "+b+" = "+area);
	


}
static void rect()
{

area=w*h;
	System.out.println("Area of a Rectangle with Width "+w+" and hight "+h+" is = "+area);
	





}
static void tra()
{

area=0.5*(a+b)*h;
	System.out.println("Area of a trapezoid with parallel sides "+a+" "+b+" and hight "+h+" is = "+area);
	




}
static void elli()
{

area=pi*a*b;
	System.out.println("Area of a ecllips with mazor axis "+b+" and half of minor axis "+a+" is = "+area);
	




}
static void cir()
{

	area=pi*r*r;
	System.out.println("Area of a circle with radius "+r+" is = "+area);
	




}
static void para()
{

	area=b*h;
	System.out.println("Area of a Parallelogram with base "+b+" and hight "+h+" is = "+area);
	




}
static void sector()
{



area=0.5*radian*r*r;
	System.out.println("Area of a sector with radius "+r+" and angle "+angle+" which is in radian = "+radian+" is "+area);
	


}
public static void main(String[] args)
{
sqr();
rect();
tra();
elli();
cir();
triangle();
para();
sector();





}
}