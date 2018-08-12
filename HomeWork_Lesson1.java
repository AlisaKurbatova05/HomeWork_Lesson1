/**
	Java Level 1 Lesson 1 Homework

	@author Alisa Kurbatova
	@version Aug 12, 2018
	*/
class HomeWork_Lesson1 {
		public void variable() {
		 int a = 15000;
		 short b = 2524;
		 long c = 14555L;
		 float d = 14.0f;
		 double e = 13.5674;
		 boolean f = true;
		 char g = 'Q';
		}
	}

static int calculator(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}
	
	static boolean numbers(int a, int b) {
		if ((a + b) >= 10 && (a + b) <= 20)
			return true;
		else
			return false;
	}
	
	static void choosethenumber(int a) {
		if (a >= 0)
			System.out.println("Положительное!");
		else
			System.out.println("Отрицательное!");
	}
	
	static boolean return_number(int a) {
		if (a < 0)
			return true;
		return false;
	}
	
	static void saymyname(String n) {
		System.out.println("Hello, " + n + "!");
	}
	
	static void differentyears(int y) {
		if ((y % 400) == 0)
			System.out.println("Високосный");
		else if ((y % 100) == 0)
			System.out.println("Невисокосный");
		else if ((y % 4) == 0)
			System.out.println("Високосный");
		else
			System.out.println("Невисокосный");
	}
	
