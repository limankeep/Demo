//equals();��equalsIgoreCase()�����Ƚϵ�����
package Number;

public class Opinion {
	public static void main(String[] args){//�����������
		String s1 = new String("abc");//���������ַ�������s1,s2,s3
		String s2 = "ABC";
		boolean b1 = s1.equals(s2);//ʹ��equals();��equalsIgoreCase()�����ֱ�Ƚ�
		boolean b2 = s1.equalsIgnoreCase(s2);
		System.out.println(s1+"equals"+s2+":"+b1);
		System.out.println(s1+"equalsIgnoreCase"+s2+":"+b2);
	}
}
