//Welcome to LineComparsion Program
import java.util.Random;
public class LineComparsion {

    public int Linear(int x1, int y1,int x2,int y2)
    {
    	int distance;
    	distance=(int)Math.floor(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    	return distance;
    }
    public static void main(String[] args) {
    	Random rand = new Random();
    	LineComparsion dist1= new LineComparsion();
    	int x1=rand.nextInt(1000);
    	int y1=rand.nextInt(1000);
    	int x2=rand.nextInt(1000);
    	int y2=rand.nextInt(1000);
    	System.out.println("(x1,y1)("+x1+","+y1+")");
    	System.out.println("(x2,y2)("+x2+","+y2+")");
    	System.out.println("Distance of line="+dist1.Linear(x1,y1,x2,y2));	
	}

}


