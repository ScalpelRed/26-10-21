public class Main
{
	public static void main(String[] args) {
		Point p = new Point(2, 2);
		Point p2 = new Point(-1, -1);
		
		p.SetX(4);
		Print("GetX: " + p.GetX());
		
		p2.Translate(6, 10);
		p.TranslateTo(-4, -3);
		Print("Middle:" + p.Middle(p2));
		
		Print("DistX: " + p.DistanceX(p2));
		Print("DistY: " + p2.DistanceY(p));
		Print("Dist: " + p2.Distance(p));
		
		Print("");
		Print(p);
		Print(p2);
	}
	
	public static void Print(Object msg){
	    System.out.println(msg);
	}
}
