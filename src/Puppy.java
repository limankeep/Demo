
public class Puppy {
	int PuppyAge;
	public void setAge(int age){
		PuppyAge = age;
	}
	public void getAge(){
		System.out.println("dog age is ��"+PuppyAge);
		return;
	}
	public Puppy (String name){
		//�������������һ��������name
		System.out.println("С���������ǣ�"+name);
	}
	public static void main(String[] args){
		//��������
		Puppy myPuppy = new Puppy("tommy");
		//ͨ���������趨age
		myPuppy.setAge(2);
		//������һ����������ȡage
		myPuppy.getAge();
		//��Ҳ�����������������ʳ�Ա����
		System.out.println("����ֵ��"+myPuppy.PuppyAge);
	}
}
