
public class Cycle {
	public static void main(String[] args){
		int a = 100;//�������������ͺͳ�ֵ
		while (a == 60)//ָ������ѭ���ĵ���
		{
			System.out.println("ok1");//while���ѭ����
			a--;
		}
		int b = 100;//����b�����ͺͳ�ֵ
		do{
			System.out.println("ok2");//do ..while ѭ����
			b--;
		} while (b == 60);//ָ��ѭ��������
	}
}
