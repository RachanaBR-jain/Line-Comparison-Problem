//Welcome to LineComparsion Program
import java.util.Random;
public class LineComparsion {

    public boolean Linear(int x1, int y1,int x2,int y2,int x3,int y3)
    {
    	Integer distance1,distance2;
    	distance1=(int)Math.floor(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    	distance2=(int)Math.floor(Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)));
    	
	System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+distance1);
	System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x3+","+y3+")="+distance2);
        System.out.println("Distance b/w two line is equal (true/flase)");
        
    	boolean  res=distance1.equals(distance2); 
    	return res;
    }
    public static void main(String[] args) {
    	Random rand = new Random();
    	LineComparsion dist1= new LineComparsion();
    	int x1=rand.nextInt(10);
    	int y1=rand.nextInt(10);
    	int x2=rand.nextInt(10);
    	int y2=rand.nextInt(10);
    	int x3=rand.nextInt(10);
    	int y3=rand.nextInt(10);
    	System.out.println(dist1.Linear(x1,y1,x2,y2,x3,y3));
	}

}


