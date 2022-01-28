package lab4;

import java.util.*;

public class Main {

	static Map<Double,List<Point>> map = new TreeMap<>();
	
	private static Point point = new Point(Math.random()*10, Math.random()*10);
    private static Point point1 = new Point(Math.random()*10, Math.random()*10);
    private static Point point2 = new Point(Math.random()*10, Math.random()*10);
    private static Point point3 = new Point(Math.random()*10, Math.random()*10);
    private static Point point4 = new Point(Math.random()*10, Math.random()*10);;
    private static Point point5 = new Point(Math.random()*10, Math.random()*10);
    private static Point point6 = new Point(Math.random()*10, Math.random()*10);
    private static Point point7 = new Point(Math.random()*10, Math.random()*10);
    private static Point point8 = new Point(Math.random()*10, Math.random()*10);
    private static Point point9 = new Point(Math.random()*10, Math.random()*10);
    private static Point point10 = new Point(Math.random()*10, Math.random()*10);
    private static Point point11 = new Point(Math.random()*10, Math.random()*10);
	public static void main(String[] args) {
		System.out.println(makeWork(point, point1, point2, point3));
		
        System.out.println(makeWork(point4, point5, point6, point7));
        
        System.out.println(makeWork(point8, point9, point10, point11));
        
        System.out.println(map);
	}

	static boolean makeWork(Point p1, Point p2, Point p3, Point p4) 
	{
		List<Point> points = new ArrayList<>();

		if(p2.x < p1.x) {
			Point temp = p1;
			p1 = p2; 
			p2 = temp;
		}
		if(p4.x < p3.x) {
			Point temp = p3;
			p3 = p4;
			p4 = temp;
		}
		if(p2.x < p3.x)
			return false;
		if((p1.x - p2.x == 0) && (p3.x - p4.x == 0))
		{
			if(p1.x == p3.x) {
				if (!((Math.max(p1.y, p2.y) < Math.min(p3.y, p4.y)) ||
	                    (Math.min(p1.y, p2.y) > Math.max(p3.y, p4.y)))) {
	                return true;
	            }
			}
			return false;
		}
		if (p1.x - p2.x == 0) {
            //find Xa, Ya - точки пересечения двух линий
            double Xa = p1.x;
            double A2 = (p3.y - p4.y) / (p3.x - p4.x);
            double b2 = p3.y - A2 * p3.x;
            double Ya = A2 * Xa + b2;
            if (p3.x <= Xa && p4.x >= Xa && Math.min(p1.y, p2.y) <= Ya &&
                    Math.max(p1.y, p2.y) >= Ya) {
            	points.add(p1);
            	points.add(p2);
            	points.add(p3);
            	points.add(p4);
                map.put(Xa, points);
                return true;
            }
            return false;
        }

        //для второго сегмента
        if (p3.x - p4.x == 0) {
            // Xa, Ya - точки переченния двух линий
            double Xa = p3.x;
            System.out.println(Xa);
            double A1 = (p1.y - p2.y) / (p1.x - p2.x);
            double b1 = p1.y - A1 * p1.x;
            double Ya = A1 * Xa + b1;
            if (p1.x <= Xa && p2.x >= Xa && Math.min(p3.y, p4.y) <= Ya &&
                    Math.max(p3.y, p4.y) >= Ya) {
            	points.add(p1);
            	points.add(p2);
            	points.add(p3);
            	points.add(p4);
                map.put(Xa, points);
                return true;
            }
            return false;
        }

        //оба сегмента не вертикальны
        double A1 = (p1.y - p2.y) / (p1.x - p2.x);
        double A2 = (p3.y - p4.y) / (p3.x - p4.x);
        double b1 = p1.y - A1 * p1.x;
        double b2 = p3.y - A2 * p3.x;
        if (A1 == A2) {
            return false; //если параллельны
        }

        //Xa  абсциса точки пересечения двух прямых
        double Xa = (b2 - b1) / (A1 - A2);

        if ((Xa < Math.max(p1.x, p3.x)) || (Xa > Math.min(p2.x, p4.x))) 
        {
            return false; //Xa находится вне пересечения проекций отрезков на оси X
        } else {
        	points.add(p1);
        	points.add(p2);
        	points.add(p3);
        	points.add(p4);
            map.put(Xa, points);
            return true;
        }
		
	}
	
}
