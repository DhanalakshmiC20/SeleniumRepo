package week1day3;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if (a1[i]==a2[j]) {
					System.out.println(a1[i]);
					
				}
			}
		}

	}

}
