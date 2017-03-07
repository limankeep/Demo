//二维数组的遍历
package NumberTwo;

public class Trap {
	public static void main(String[] args){//主方法的入口
		int b[][] = new int[][]{{1},{2,3},{4,5,6}};//定义二维数组
		for (int k = 0;k < b.length;k++){
			for (int c = 0;c < b[k].length;c++){
				System.out.println(b[k][c]);//将数组中的元素输出
			}
			System.out.println();
		}
	}
}
