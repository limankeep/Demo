//字符串的分割  split 
package NumberTwo;

public class Division {
	public static void main(String[] args){//主方法的入口
		String str = new String("abc,def,ghi,gkl");
		//使用split方法对字符串进行拆分，返回字符串数组
		String[] newstr = str.split(",");
		for(int i = 0;i < newstr.length; i++){//使用for循环遍历字符数组
			System.out.println(newstr[i]);//输出信息
		}
		//对字符串进行拆分，并限定拆分次数，返回字符数组
		String[] newstr2 = str.split(",",2);
		for (int j = 0; j < newstr2.length; j++){//循环遍历字符数组
			System.out.println(newstr2[j]);//输出信息
		}
	}
}
