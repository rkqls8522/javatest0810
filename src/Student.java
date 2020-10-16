import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	static String mathScore;
	static String engScore;
	static String sciScore;
	static String socScore;
	static String morScore;
	
	//���� ����. main������ �� �� �޼ҵ� ���.
	public static void scoreCheck() {
		Scanner sc = new Scanner(System.in);
		final String numPattern = "[0-9]*$";
		Matcher matNum;
		while (true) {
			System.out.println("���������� �Է��ϼ���.");
			mathScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(mathScore);
			if (matNum.matches() == false)
				System.out.println("�ٽ� �Է��ϼ���. ���ڸ� �Է��ϼ���.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("���������� �Է��ϼ���.");
			engScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(engScore);
			if (matNum.matches() == false)
				System.out.println("�ٽ� �Է��ϼ���. ���ڸ� �Է��ϼ���.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("���������� �Է��ϼ���.");
			sciScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(sciScore);
			if (matNum.matches() == false)
				System.out.println("�ٽ� �Է��ϼ���. ���ڸ� �Է��ϼ���.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("��ȸ������ �Է��ϼ���.");
			socScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(socScore);
			if (matNum.matches() == false)
				System.out.println("�ٽ� �Է��ϼ���. ���ڸ� �Է��ϼ���.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("���������� �Է��ϼ���.");
			morScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(morScore);
			if (matNum.matches() == false)
				System.out.println("�ٽ� �Է��ϼ���. ���ڸ� �Է��ϼ���.");
			else {
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StudentDB students[] = new StudentDB[5];
		students[0] = new StudentDB();
		students[1] = new StudentDB();
		students[2] = new StudentDB();
		students[3] = new StudentDB();
		students[4] = new StudentDB();
		
		System.out.println("ù ��° �л�");
		scoreCheck();
		students[0].setMathScore(Integer.valueOf(mathScore));
		students[0].setEngScore(Integer.valueOf(engScore));
		students[0].setSciScore(Integer.valueOf(sciScore));
		students[0].setSocScore(Integer.valueOf(socScore));
		students[0].setMorScore(Integer.valueOf(morScore));
		
		//�л��� �߰��Ǿ �� �л��� ������ ���� ����ȴٴ� ���� ��Ÿ���� ���� �߰��Է�
		System.out.println("\n�� ��° �л�");
		scoreCheck();
		students[1].setMathScore(Integer.valueOf(mathScore));
		students[1].setEngScore(Integer.valueOf(engScore));
		students[1].setSciScore(Integer.valueOf(sciScore));
		students[1].setSocScore(Integer.valueOf(socScore));
		students[1].setMorScore(Integer.valueOf(morScore));
		
		//�Է��� �л� �� ���� ���� ���� ����ϱ�
		System.out.println();
		System.out.println("ù ��° �л��� ���� ���� : " + students[0].getSumScore());
		System.out.println("�� ��° �л��� ���� ���� : " + students[1].getSumScore());
		
		//�Է��� �л� �� ���� ���� ��� ����ϱ�
		System.out.println("ù ��° �л��� ���� ��� : " + students[0].getAvgScore());
		System.out.println("�� ��° �л��� ���� ��� : " + students[1].getAvgScore());
		
		//������ ���ϱ� ���ؼ� �߰� �л� ���� ���Ƿ� �ֱ�
		students[2].setSumScore(156);
		students[3].setSumScore(489);
		students[4].setSumScore(496);

		//���� ���� ��, ��յ��� ������ �迭 ����
		double students_Score[] = new double[5];
		for(int i = 0; i < students.length; i++)
			students_Score[i] = students[i].getAvgScore();
		
		//���� ��, ������ Ȯ���ϱ�
		System.out.println("\n���� �� ������");
		for(double i : students_Score)
			System.out.println(i);
		
		//�л��� ������ ���ϱ� ���� �������� �����ϱ�.
		double temp;
		for(int j = students_Score.length-1; j >0; j--) {	//j�� ���� ���� 1���� �迭�� 0��° ������ �ִٸ� ���� �ڷ� ���� �ϹǷ� j�� �迭ũ��� ����, �����۾��� �迭ũ�⸸ŭ �ݺ��ϰ� �ϴ� ����
			for(int i = 0; i < students_Score.length-1; i++) {
				if(students_Score[i] < students_Score[i+1]) {
					temp = students_Score[i];
					students_Score[i] = students_Score[i+1];
					students_Score[i+1] = temp;
				}
			}
		}

		//���� ��, ������ ����ϱ�.
		System.out.println("\n���� �� ������");
		for(double i : students_Score)
			System.out.println(i);
		
		//ù ��° �л��� ������������
		System.out.println("\ntoString����");
		System.out.println(students[0]);
		
		//students[0]�� �� ������ ����ϱ�
		for(int i = 0; i < students_Score.length; i++)
			if(students_Score[i] == students[0].getAvgScore()) {
				System.out.println("\n" + (i+1)+"���Դϴ�.");
				break;
			}
	}
}
















































