//IndexOf �� lastIndexOf ���÷�
package NumberTwo;

public class Test {
	public static void main(String[] args){//�����������
		String str = "We are student";
		//�����ַ�����str�е�����λ�ø�ֵ������size
		int size = str.lastIndexOf("a");
		int bize = str.indexOf("a");
		//������size���
		System.out.println("���ַ������ַ���str������λ���ǣ�"+size);
		//���ַ���str�ĳ������
		System.out.println("�ַ���str�ĳ����ǣ�"+str.length());
		System.out.println("���ַ������ַ���str������λ���ǣ�"+bize);
		
	}
}
