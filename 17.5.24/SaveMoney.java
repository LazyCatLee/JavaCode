import java.util.Scanner;
import java.lang.Math;
class SaveMoney {
	public static void main(String[] args) {
		float rate = 0.35f;
		float rateForThreeMonth = 1.10f;
		float rateForAhalfYear = 1.30f;
		float rateForAYear = 1.50f;
		float rateForTwoYear = 2.10f;

		System.out.println("Hello");
		System.out.println("�����뱾��");
		Scanner sc = new Scanner(System.in);
		float  capital = sc.nextFloat();

		float currentAYear = capital*(1.0f+rate*0.01f);
		System.out.println("����һ�걾���ܼƣ�"+Math.round(currentAYear));

		float regularAYear = capital*(1.0f+rateForAYear*0.01f);
		System.out.println("����һ�걾���ܼƣ�"+Math.round(regularAYear));

		float currentTwoYear = capital*(1.0f+rate*0.01f)+capital*rate*0.01f;
		System.out.println("����2�걾���ܼƣ�"+Math.round(currentTwoYear));

		float regularTwoYear = capital*(1.0f+rateForTwoYear*0.01f)+capital*rateForTwoYear*0.01f;
		System.out.println("����2�걾���ܼƣ�"+Math.round(regularTwoYear));

	}
}
