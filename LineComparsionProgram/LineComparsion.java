
package com.JavaPractiveProgram;
import java.util.Random;
public class LineComparsion {
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


    public int Linear(int x1, int y1,int x2,int y2,int x3,int y3)
    {
    	Integer distance1,distance2;
    	distance1=(int)Math.floor(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    	distance2=(int)Math.floor(Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)));
    	
System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+distance1);
        
System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x3+","+y3+")="+distance2);
        
    	int  res=distance1.compareTo(distance2);
    	if(res==-1)
    	{
    		System.out.println("distance1 < distance2");
    	}
    	else if(res==1)
    	{
    		System.out.println("distance1  > distance 2");
    	}
    	else
    		System.out.println("distance1 == distance 2");
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

