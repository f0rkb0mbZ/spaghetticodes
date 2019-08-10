import java.util.Scanner;

public class privateAccess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Object o;
        o =  new Inner().new Private();
        System.out.println(((privateAccess.Inner.Private)o).powerof2(num));

    }

    static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}
}