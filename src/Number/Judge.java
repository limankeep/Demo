//����ƥ�������ʽ
package Number;

public class Judge {
	public static void main(String[] args){//���������
		String regex = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";//�趨����Ҫƥ����ַ�����ʽ
		String str1 = "aaaa0@";
		String str2 = "aaaaaa";
		String str3 = "111@dsssssad.dda.com";
		/*��ʼ���ݸ������ַ�����ƥ��*/
		if (str1.matches(regex)){
			System.out.println(str1+"��һ���Ϸ��ĵ��������ַ���ʽ");
		}
		if (str2.matches(regex)){
			System.out.println(str2+"��һ���Ϸ��ĵ��������ַ���ʽ");
		}
		if (str3.matches(regex)){
			System.out.println(str3+"��һ���Ϸ��ĵ��������ַ���ʽ");
		}
	}
}
