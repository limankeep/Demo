import java.io.*;

public class EmployeeTest {
	public static void main(String[] args){
		//ʹ�ù�����������������
		Employee empOne = new Employee("RUNOOB1");
		Employee empTwo = new Employee("RUNOOB2");
		
		//��������������ķ���
		empOne.empAge(26);
		empOne.empDesignation("�߼�����Ա");
		empOne.empSalary(10000);
		empOne.printEmployee();
		
		empTwo.empAge(20);
		empTwo.empDesignation("�������Ա");
		empTwo.empSalary(2222);
		empTwo.printEmployee();
	}
}
