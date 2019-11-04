package DavidLe.ThinkInJava;
import java.awt.Rectangle;
import java.awt.Point;

public class Diem {
	public static void printPoint(Point p) { 
	    System.out.println("(" + p.x + ", " + p.y + ")"); 
	  }
	
	public static Point findCenter(Rectangle box) { 
	    int x = box.x + box.width/2; 
	    int y = box.y + box.height/2; 
	    return new Point(x, y); 
	}
	
	public static void moveRect(Rectangle box, int dx, int dy) { 
	    box.x = box.x + dx; 
	    box.y = box.y + dy; 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point blank; 
//	    blank = new Point(3, 4);
//	    int x=blank.x;
//	    System.out.println(x);
//	    printPoint(blank);
//	    System.out.println(blank);
 Rectangle box = new Rectangle(0, 0, 100, 200);
//	    System.out.println(box);
//	    System.out.println(findCenter(box));
		moveRect(box, 50, 100);
	    

	}

}
