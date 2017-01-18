
public class Compoud {
	public static void main(String[] args){//主方法的入口
		int x = 20;
		{
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{
				b = y > z;
				System.out.println(b);//复合语句
			}
		}
		String word = "hello world";
		System.out.println(word);
	}
}
