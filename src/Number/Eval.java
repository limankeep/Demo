//时间的格式化
package Number;

import java.util.*;

public class Eval {
	public static void main(String[] args){//主方法的入口
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%td", date);
		String hour = String.format("%tH", date);
		String minute = String.format("%tM", date);
		String sec = String.format("%tS", date);
		String Time = "当前的时间为："+year+"-"+month+"-"+day+"  "+hour+":"+minute+":"+sec;
		System.out.println("当前的时间为："+year+"-"+month+"-"+day+"  "+hour+":"+minute+":"+sec);
		System.out.println(Time);
	}
}
