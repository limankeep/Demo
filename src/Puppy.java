
public class Puppy {
	int PuppyAge;
	public void setAge(int age){
		PuppyAge = age;
	}
	public void getAge(){
		System.out.println("dog age is ："+PuppyAge);
		return;
	}
	public Puppy (String name){
		//这个构造器仅有一个参数：name
		System.out.println("小狗的名字是："+name);
	}
	public static void main(String[] args){
		//创建对象
		Puppy myPuppy = new Puppy("tommy");
		//通过方法来设定age
		myPuppy.setAge(2);
		//调用另一个方法来获取age
		myPuppy.getAge();
		//你也可以像下面这样访问成员变量
		System.out.println("变量值："+myPuppy.PuppyAge);
	}
}
