package junit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
	public static double a,b,c;
	public static void main(String arg[],double r) throws IOException{
	try{
	BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in)); //接收键值
	System.out.println("请输入:");
	a=Double.valueOf(stdin.readLine());
	b=Double.valueOf(stdin.readLine()); 
	c=Double.valueOf(stdin.readLine());
//	double r = Judge(a,b,c);
	}catch(IOException e){
	System.out.println("error");
	System.exit(0);
	}
	r = Judge(a,b,c);
	if(r == 0) 
		System.out.println("不是三角形");
	else if (r==1)
		System.out.println("普通三角形");
	else if(r==2)
		System.out.println("等腰三角形");
	else if(r==3)
	    System.out.println("等边三角形");
	 
}
	public static double Judge(double a, double b, double c) {
		if ((a + b > c && a + c > b && b + c > a)) // 判断三角形
		{
			if (a == b || b == c || a == c) // 等腰三角形
			{
				if (a == b && b == c) // 判断等边
					return 3;
				else
					return 2;
			} 
			else {
				return 1;
			}
		} 
		else{
			return 0;
		}
}}



