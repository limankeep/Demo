//startsWith()��endsWith()���÷�
package Number;

public class StartOrEnd {
	public static void main(String[] args){//�����������
		String num1 = "22045612";//�����ַ���num1
		String num2 = "21304578";//�����ַ���num2
		boolean b = num1.startsWith("22");//�ж��ַ���num1�Ƿ���22��ͷ
		boolean b2 = num1.endsWith("78");//�ж��ַ���num1�Ƿ���78��β
		boolean b3 = num2.startsWith("22");//�ж��ַ���num2�Ƿ���22��ͷ
		boolean b4 = num2.endsWith("78");//�ж��ַ���num2�Ƿ���78��β
		System.out.println(b);//�����Ϣ�жϳ����Ľ��
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
