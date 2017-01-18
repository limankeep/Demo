
public class Getfelse {
	public static void main(String[] args){//主方法入口
		int math = 95;//声明int型局部变量，并赋给初值95
		int english = 56;//声明int型局部变量，并赋给初值56
		if (math >60){//使用if语句判断math是否大于60
			System.out.println("垃圾你的数学及格了");
		}else{
			System.out.println("垃圾你过年肯定不得好了");
		}
		if (english > 60){//判断英语成绩是否大于60
			System.out.println("你可以去外国了");
		}else{
			System.out.println("你只能去霓虹国了");
		}
	}
}
