package by.htp.hometask.saiko.linearprogramm;

public class Tasks {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
	}

	
		public static void task01() {
			
			// Даны два целочисленных числа x и y.
			// Вычислить их сумму, разность, произведение и частное.
			
			int x;
			int y;
			int z;	// Сумма.
			int a;	// Разность.
			int b;	// Произведение.
			int d;	// Частное.
			
			x = 10;
			y = 5;
			
			z = x + y;
			System.out.println("z = " + z);
			
			a = x - y;
			System.out.println("a = " + a);
			
			b = x * y;
			System.out.println("b = " + b);
			
			d = x / y;
			System.out.println("d = " + d);
		}

		
		public static void task02() {
			
			// Найдите значение функции: c = 3 + a.
			
			int c;
			int a;
			
			a = 8;
			
			c = 3 + a;
			
			System.out.println("c = " + c);
		}
		
		public static void task03() {
			
			// Найдите значение функции: z = 2 * x + (y - 2) * 5.
			
			int z;
			int x;
			int y;
			
			x = 3;
			y = 4;
			
			z = 2 * x + (y - 2) * 5;
					
			System.out.println("z = " + z);
		}
		
		public static void task04() {
			
			// Найдите значение функции: z = ( ( a - 3) * b / 2) + c.
			
			double z;
			int a;
			double b;
			int c;
			
			a = 6;
			b = 5;
			c = 7;
			
			z = ( ( a - 3) * b / 2) + c;
			
			System.out.println("z = " + z);
		}
		
		public static void task05() {
			
			// Создать алгоритм нахождения среднего арифметического двух чисел.
			
			double a;
			double b;
			double ar;	// Среднее арифметическое.
			
			a = 3;
			b = 20;
			
			ar = ( a + b) / 2;
			
			System.out.println("ar = " + ar);
		}
		
		public static void task06() {
			
			// Написать код для решения задачи. В n малых бидонах 80 л молока. 
			// Сколько молока в m больших бидонах, если в каждом большом бидоне на 12 л больше, чем в малом?
			
			int n;
			int m;
			
			n = 80;
			m = n + 12;
			
			System.out.println("m = " + m);
		}
		
		public static void task07() {
			
			// Дан прямоугольник, ширина которого в два раза меньше длины.
			// Найти площадь прямоугольника.
			
			int s;	// Площадь.
			int a;	// Длина.
			int b;	// Ширина.
			
			a = 46;
			b = a / 2;
			s = a * b;
			
			System.out.println("s = " + s);
		}
		
		public static void task08() {
			
			// Вычислить значение выражения по формуле (все переменные принимают действительные значения).
			
			double result;
			double a;
			double b;
			double c;
			
			a = 1;
			b = 2;
			c = 3;
			
			result = (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			
			System.out.println("result = " + result);
		}
		
		public static void task09() {
			
			// Вычислить значение выражения по формуле ( все переменные принимают действительные значения).
			
			double a;
			double b;
			double c;
			double d;
			double result;
			
			a = 2;
			b = 5;
			c = 4; 
			d = 7;
			
			result = (a / c) * (b / d) - (a * b - c) / (c * d);
			
			System.out.println("result = " + result);
		}
		
		public static void task10() {
			
			// Вычислить значение выражения по формуле (все переменные принимают действительные значения).
			
			double x;
			double y;
			double result;
			
			x = 30;
			y = 45;
			
			double xr = x * Math.PI / 180;
			double yr = y * Math.PI / 180;
			
			result = (Math.sin(xr) + Math.cos(yr)) / (Math.cos(xr) - Math.sin(yr)) * Math.tan(xr * yr);
			
			System.out.println("result = " + result);
		}
		
		public static void task11() {
			
			// Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов.
			
			double a;
			double b;
			double c;	// Гипотенуза.
			double p;	// Периметр.
			double s;	// Площадь.
			
			a = 5;
			b = 10;
			
			c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			
			System.out.println("c = " + c);
			
			p = a + b + c;

			System.out.println("p = " + p);
			
			s = 0.5 * a * b;

			System.out.println("s = " + s);
		}
		
		public static void task12() {
			
			// Вычислить расстояние между двумя точками с данными координатами (х1, у1) и (x2, у2).
			
			double x1;
			double x2;
			double y1;
			double y2;
			double a;
			
			x1 = 12;
			x2 = 10;
			y1 = 24;
			y2 = 9;
			
			a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			System.out.println("a = " + a);
		}
		
		public static void task13() {
			
			// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
			
			double x1;
			double x2;
			double x3;
			double y1;
			double y2;
			double y3;
			double p;	// Периметр.
			double s;	// Площадь.
			
			x1 = 12;
			x2 = 10;
			x3 = 5;
			y1 = 24;
			y2 = 9;
			y3 = 11;
			
			double ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			double ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
			double bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));		// Стороны.
			p = ab + ac + bc;
			double pp = 0.5 * p;	// Полупериметр.
			s = Math.sqrt(pp * (pp - ab) * (pp - ac) * (pp - bc));
			
			System.out.println("Периметр = " + p + " Площадь = " + s);
		}
		
		public static void task14() {
			
			// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
			
			double r;	// Радиус.
			double s;	// Площадь.
					
			r = 18;
			s = 2 * Math.PI * r;
			
			System.out.println("s = " + s);
		}
		
		public static void task15() {
			
			// Написать программу, которая выводит на экран первые четыре степени числа П.
			
			double n1;
			double n2;
			double n3;
			double n4;
			
			n1 = Math.pow(Math.PI, 1);
			n2 = Math.pow(Math.PI, 2); 
			n3 = Math.pow(Math.PI, 3);
			n4 = Math.pow(Math.PI, 4);
			
			System.out.println("n1 = " + n1);
			System.out.println("n2 = " + n2);
			System.out.println("n3 = " + n3);
			System.out.println("n4 = " + n4);
		}
		
		public static void task16() {
			
			// Найти произведение цифр заданного четырехзначного числа.
			
			int a;
			int a1;
			int a2;
			int a3;
			int a4;
			
			a = 2457;

			a1 = a % 10000 / 1000;
			a2 = a % 1000 / 100;
			a3 = a % 100 / 10;
			a4 = a % 10;
			a = a1 * a2 * a3 * a4;
			
			System.out.println(a);
			}
		
		public static void task17() {
			
			// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
			
			double a;
			double b;
			double ar; // Среднее арифметическое.
			double ge; // Среднее геометрическое.
			
			a = -3;
			b = 5;
			
			ar = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
			
			System.out.println("ar = " + ar);
			
			ge = Math.sqrt(Math.abs(a) * Math.abs(b));
			
			System.out.println("ge = " + ge);
		}
		
		public static void task18() {
			
			// Дана длина куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
			
			double a;	// Длина ребра.
			double sb;	// Площадь грани.
			double s;	// Площадь полной поверхности.
			double v;	// Объем куба.
			
			a = 10;
			
			sb = a * a;
			
			s = sb * 6;	// 6 - число граней.
			
			v = Math.pow(a, 3);
			
			System.out.println("sb = " + sb);
			
			System.out.println("s = " + s);
			
			System.out.println("v = " + v);
		}
		
		public static void task19() {
			
			// Дана длина равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
			
			double a;	// Сторона.
			double s;	// Площадь.
			double h;	// Высота.
			double rv;	// Радиус вписанной окружности.
			double ro;	// Радиус описанной окружности.
			
			a = 12;
			
			h = (Math.sqrt(3) / 2) * a;
			
			s = 0.5 * a * h;
			
			rv = a / (2 * Math.sqrt(3));
			
			ro = (2 * h) / 3;
			
			System.out.println("h = " + h);
			
			System.out.println("s = " + s);

			System.out.println("rv = " + rv);
			
			System.out.println("ro = " + ro);
		}
		
		public static void task20() {
			
			// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
			
			double p;	// Длина.	
			double s;	// Площадь.
					
			p = 43;
					
			s = (p * p) / 4 * Math.PI;
					
			System.out.println("s = " + s);
		}
		
		public static void task21() {
			
			// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
			// Поменять местами дробную и целую части числа и вывести полученное значение числа.
			
			double r;
			double x;
			
			r = 345.789;
			
			x = (r * 1000) % 1000 + (int) r / 1000.0;
			
			System.out.println("x = " + x);
		}
		
		public static void task22() {
			
			// Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. 
			// Вывести данное значение длительности в часах, минутах и секундах в следующей форме : HHч MMмин SSс.
			
			int t;
			int h;
			int m;
			int s;
			
			t = 4560;
			
			h = t / 3600;
			m = t % 3600;
			m = m / 60;
			s = m % 1;
			
			
			System.out.println(h + "ч " + m + "мин " + s + "с ");
		}
		
		public static void task23() {
			
			// Найти площадь кольца, внутренний радиус которого равен r, а внешний - R (R > r).
			
			double r;	// Внутренний радиус.
			double rv;	// Внешний радиус.
			double s;
			
			r = 10;
			rv = 20;
					
			s = Math.PI * (rv * rv - r * r);
			
			if ( rv > r) {
			
				System.out.println("s = " + s);
				
			} else {
				
				System.out.println("Неверно условие");
			}
		}
		
		public static void task24() {
			
			// Найти плозадь равнобедренной трапеции с основаниями a и b и углом при большем основании a.
			
			double a;
			double b;
			double s;	// Площадь.
			double a_;	// Угол.
			double h;	// Высота.
			
			a = 21;
			b = 10;
			a_ = 45;
			
			h = (a - b) / 2 * Math.tan(a_);

			s = (a + b) / 2 * h;
			
			System.out.println("s = " + s);
		}
		
		public static void task25() {
			
			// Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
			
			double a;
			double b;
			double c;
			double dis;
			double x1;
			double x2;
			
			a = 8;
			b = 19;
			c = 9;
			
			dis = b * b - 4 * a * c;
			x1 = (-b + Math.sqrt(dis)) / (2 * a);
			x2 = (-b - Math.sqrt(dis)) / (2 * a);
			
			if (dis > 0 && a != 0) {
				
				System.out.println("X1 = " + x1 + " X2 = " + x2);
			}
			
			else {
			
				System.out.println("Условие неверно");
			}
		}
		
		public static void task26() {
			
			// Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
			
			double a;
			double b;
			double y;	// Угол.
			double s;	// Площадь.
			
			a = 23;
			b = 30;
			y = 32;
			
			double yr = y * Math.PI / 180;
			
			s = 0.5 * a * b * Math.sin(yr);
			
			System.out.println("Площадь = " + s);
		}
		
		public static void task27() {
			
			// Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение a8 за три орперации и a10 за четыре операции.
			
			int a;
			int a2;
			int a4;
			int a8;
			int a10;
				
			a = 2;
			
			a2 = a * a;
			a4 = a2 * a2;
			a8 = a4 * a4;
			a10 = a8 * a2;
			
			System.out.println("a8 = " + a8);
			System.out.println("a10 = " + a10);
		}
		
		public static void task28() {
			
			// Составить программу перевода радианной меры угла в градусы, минуты и секунды.
			
			double rad;
			double g;
			double m;
			double s;
			
			rad = 2.0;
			
			g = Math.toDegrees(rad);
			int grad = (int) g;
			m = (g - grad) * 60;
			int min = (int) m;
			s = (m - min) * 60;
			int sec = (int) s;
			
			System.out.println(grad + " градусов " + min + " минут " + sec + " секунд");
		}
		
		public static void task29() {
			
			// Найти (в радианах и в градусах) все углы треугольника со сторонами а, b, с.
			
			double a;
			double b;
			double c;
			double alf;
			double bet;
			double gam;		// Углы в радианах.
			double alfg;
			double betg;
			double gamg;	// Углы в градусах.

			a = 4;
			b = 7;
			c = 12;
			
			alf = Math.cos((a*a + c * c - b * b) / (2 * a * c));
			alfg = Math.toDegrees(alf);
			bet = Math.cos((a * a + b * b - c * c) / (2 * a * b));
			betg = Math.toDegrees(bet);
			gam = Math.cos((b * b + c * c - a * a) / (2 * c * b));
			gamg = Math.toDegrees(gam);
			
			System.out.println("Альфа = " + alf + " градусов;" + " Альфа = " + alfg + " радиан");
			System.out.println("Бета = " + bet + " градусов;" + " Бета = " + betg + " радиан");
			System.out.println("Гамма = " + gam + " градусов;" + " Гамма = " + gamg + " радиан");
		}
		
		public static void task30() {
			
			// Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения.
			
			double r1;
			double r2;
			double r3;
			double r;
			
			r1 = 12;
			r2 = 17;
			r3 = 23;
			
			r = 1 / r1 + 1 / r2 + 1 / r3;
			
			System.out.println("r = " + r + " Ом");
		}
		
		public static void task31() {
			
			// Составить программу для вычисления пути, пройденнго лодкой, если ее скорость в стояей воде v км/ч,
			// скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки - t2 ч.

			int s;	// Путь.
			int v;	// Скорость лодки в стоячей воде.
			int v1;	// Скорость течения реки.
			int v2;	// Скорость лодки против течения реки.
			int t;	// Общее время движения.
			int t1;	// Время движения по озеру.
			int t2;	// Время движения против течения реки.
			
			v = 5;
			v1 = 2;
			t1 = 1;
			t2 = 2;
			
			v2 = v - v1;
			t = t1 + t2;
			s = v2 * t;
			
			System.out.println("s = " + s + " км");	
		}
		
		public static void task32() {
			
		//  Текущее показание электронных часов: m ч (0 ≤ т ≤23) n мин (0 ≤ п ≤59) k с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?
			
			int m = 2;
			int n = 5;
			int k = 29;
			int p = 3;
			int q = 23;
			int r = 12;
			
			int t1;
			int t2;
			int t;
			
			p = 3;
			q = 23;
			r = 12;
			
			t1 = m * 3600 + n * 60 + k;
			t2 = p * 3600 + q * 60 + r;
			t = t1 + t2;
			
			int hour = t / 3600;
			int min = (t - (hour * 3600)) / 60;
			int sec = (t - (hour * 3600)) - (min * 60);
			
			System.out.println("m " + hour + " ч " + " n " + min + " мин " + " k " + sec + " сек ");
		}
		
		public static void task33() {
			
			// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 

			char ch = 's';
			int code;
			
			code = ch;
			
			System.out.println((char) code - 1);
			System.out.println(code);
			System.out.println((char) code + 1);
		}
		
		public static void task34() {
			
			// Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. 
			
			long bytes;
			double kbytes;
			double mbytes;
			double gbytes;
			double tbytes;
			
			bytes = 9900600012L;
			kbytes = bytes / 1024;
			mbytes = kbytes / 1024;
			gbytes = mbytes / 1024;
			tbytes = gbytes / 1024;
			
			System.out.println(bytes + " B ");
			System.out.println(kbytes + " KB ");
			System.out.println(mbytes + " MB ");
			System.out.println(gbytes + " GB ");
			System.out.println(tbytes + " TB ");
		}
		
		public static void task35() {
			
			// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. 

			double m;
			double n;
			
			m = 321.623;
			n = 549.125;
			
			int ms = (int) m;
			ms = ms % 10;	// Младшая цифра целой части
			m = m * 10 % 10;
			int mm = (int) m;	// Старшая цифра дробной части.
			
			int ns = (int) n;
			ns = ns % 10;	// Младшая цифра целой части
			n = n * 10 % 10;
			int nm = (int) n;	// Старшая цифра дробной части.
			
			System.out.println("Младшая цифра целой части = " + ms + " Старшая цифра дробной части = " + mm);
			System.out.println("Младшая цифра целой части = " + ns + " Старшая цифра дробной части = " + nm);
		}
		
		public static void task36() {
		
			// Найти частное произведений четных и нечетных цифр четырехзначного числа. 
			
			int x = 2345;
					
			int x1 = x / 1000 % 10;
			int x2 = x / 100 % 10;
			int x3 = x / 10 % 10;
			int x4 = x % 10;
			
			double chet = 1;
			double nechet = 1;
			
			if (x1 % 2 ==0) {
				chet = chet * x1; 
			} else {
				nechet = nechet * x1;
			}
			
			if (x2 % 2 ==0) {
				chet = chet * x2; 
			} else {
				nechet = nechet * x2;
			}
			
			if (x3 % 2 ==0) {
				chet = chet * x3; 
			} else {
				nechet = nechet * x3;
			}
			
			if (x4 % 2 ==0) {
				chet = chet * x4; 
			} else {
				nechet = nechet * x4;
			}
			
			double del = chet / nechet;
			
			System.out.println("Частное = " + del);
		}
		
		public static void task37() {
			
			// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: 
			 
			// 	Целое число N является четным двузначным числом. 
			// 	Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
			// 	Сумма цифр данного трехзначного числа N является четным числом. 
			// 	Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п). 
			// 	Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
			// 	Треугольник со сторонами а,b,с является равнобедренным. 
			// 	Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
			// 	Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). 
			// 	График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). 
			

			// Часть 1.
			
			int n1 = 313;
			
			if (n1 % 2 == 0 && n1 / 100 == 0) {
				System.out.println("True");
			} else {
				System.out.println("False");
				}
			
			// Часть 2.
			
			int n2 = 2323;
			
			int n2n1 = n2 / 1000 % 10;
			int n2n2 = n2 / 100 % 10;
			int n2n3 = n2 / 10 % 10;
			int n2n4 = n2 % 10;
			
			if (n2n1 + n2n2 == n2n3 + n2n4) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 3.
			
			int n3 = 478;
			
			int n3n1 = n3 / 100 % 10;
			int n3n2 = n3 / 10 % 10;
			int n3n3 = n3 % 10;
			int ntemp = n3n1 + n3n2 + n3n3;
			if (ntemp % 2 == 0) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 4.
			
			int x = 3;
			int y = 4;
			int m = 2;
			int n = 7;
			
			if (x >= m && x <= n) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 5.
			
			int n5 = 345;
			
			int n5k2 = n5 * n5;
			int n5n1 = n5 / 100 % 10;
			int n5n2 = n5 / 10 % 10;
			int n5n3 = n5 % 10;
			int n5sum = n5n1 + n5n2 + n5n3;
			int n5k3 = n5sum * n5sum * n5sum;
			
			if (n5k2 == n5k3) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 6.
			
			int a6 = 5;
			int b6 = 3;
			int c6 = 3;
			
			if (a6 == b6) {
				System.out.println("True");
			} else if (a6 == c6) {
				System.out.println("True");
			} else if ( b6 == c6) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 7.
			
			int n7 = 358;
			int n7n1 = n7 / 100 % 10;
			int n7n2 = n7 / 10 % 10;
			int n7n3 = n7 % 10;
			
			if (n7n1 + n7n2 == n7n3) {
				System.out.println("True");
			} else if (n7n1 + n7n3 == n7n3) {
				System.out.println("True");
			} else if (n7n2 + n7n3 == n7n3) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 8.
			
			int n8 = 345;
			int a8 = 4;
			
			if (Math.pow(a8, 0) == n8) { 
				System.out.println("True");
			} else if (Math.pow(a8, 1) == n8) { 
				System.out.println("True");
			} else if (Math.pow(a8, 2) == n8) { 
				System.out.println("True");
			} else if (Math.pow(a8, 4) == n8) { 
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 9.
			
			double a = 10;
			double b = 4;
			double c = 7;
			double x9;
			double y9;
			double m9 = 5;
			double n9 = 6;
			
			x9 = m9;
			y9 = n9;
			
			if (y9 == a * x9 * x9 + b + x9 + c) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}	
		}
		
		public static void task38() {
			
			// Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае/

			int x = -2;
			int y = 2;
			
			// 1 часть.
			
			if (y + Math.abs(x) <= 4 && y >=0) { 
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			// Часть 2.
			
			if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4)) {
				System.out.println("True");
			} else { 
				System.out.println("False");
			}
			
			// Часть 3.
			
			if ((x * x + y * y <= 16 && y >= 0 && x >= 0) || (x * x + y * y <= 25 && y <= 0 && x >= 0)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		
		public static void task39() {
			
			// Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций/
			// 2x4 - 3х3 + 4х2 - 5х + 6
			
			int x = 7;
			
			int temp = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;
			
			System.out.println(temp);
		}
		
		public static void task40() {
			
			// Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций. 

			int x = 4;
			int t1;
			int t2;
			
			t1 = ((-4 * x + 3) * x - 2) * x;
			t2 = ((4 * x + 3) * x + 2) * x + 1;
			
			System.out.println(t1);
			System.out.println(t2);
		}
}
