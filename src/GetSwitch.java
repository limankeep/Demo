
public class GetSwitch {//创建类
	public static void main(String[] args){
		int week = 3;
		switch (week) { //指定switch语句的表达式为变量week
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("sorry,I don't Know");
		}
	}
}
