//ʱ��ĸ�ʽ��
package Number;

import java.util.*;

public class Eval {
	public static void main(String[] args){//�����������
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%td", date);
		String hour = String.format("%tH", date);
		String minute = String.format("%tM", date);
		String sec = String.format("%tS", date);
		String Time = "��ǰ��ʱ��Ϊ��"+year+"-"+month+"-"+day+"  "+hour+":"+minute+":"+sec;
		System.out.println("��ǰ��ʱ��Ϊ��"+year+"-"+month+"-"+day+"  "+hour+":"+minute+":"+sec);
		System.out.println(Time);
	}
}
