package junit;

public class Judge {
	public double Judge(double a, double b, double c) {
		if ((a + b > c && a + c > b && b + c > a)) // 判断三角形
		{
			if (a == b || b == c || a == c) // 等腰三角形
			{
				if (a == b && b == c) // 判断等边
					return 3;
				else
					return 2;
			} else {
				return 1;
			}
		} else{
			return 0;
		}
}}
