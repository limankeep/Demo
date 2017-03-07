package NumberSix;

public class Quadrangle {
//实例化保存四边形对象的数组对象
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex = 0;
	
	public void draw (Quadrangle q){//定义draw方法，参数为四边形对象
		if (nextIndex < qtest.length){
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args){//主方法的入口
		//实例化两个四边形对象，用于调用draw方法
		Quadrangle q = new Quadrangle();
		q.draw(new Square());//以正方形对象为参数调用draw方法
		//以平行四边形对象为参数调用draw方法
		q.draw(new Parallelogram());
	}
}
class Square extends Quadrangle{
	//定义正方形类，继承四边形类
	public Square(){
		System.out.println("正方形");
	}
}
//定义一个平行四边形类，继承四边形类
class Parallelogram extends  Quadrangle{
	public Parallelogram(){
		System.out.println("平行四边形");
	}
}