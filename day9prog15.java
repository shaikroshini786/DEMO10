//finalkey word in method
class Bike
{
final void  run()
{
System.out.println("running");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("running safely with 100kmph");
}
public static void main(String args[])
{
Honda h=new Honda();
h.run();
}
}
