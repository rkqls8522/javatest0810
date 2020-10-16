import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	static String mathScore;
	static String engScore;
	static String sciScore;
	static String socScore;
	static String morScore;
	
	//오류 방지. main실행한 후 이 메소드 사용.
	public static void scoreCheck() {
		Scanner sc = new Scanner(System.in);
		final String numPattern = "[0-9]*$";
		Matcher matNum;
		while (true) {
			System.out.println("수학점수를 입력하세요.");
			mathScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(mathScore);
			if (matNum.matches() == false)
				System.out.println("다시 입력하세요. 숫자만 입력하세요.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("영어점수를 입력하세요.");
			engScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(engScore);
			if (matNum.matches() == false)
				System.out.println("다시 입력하세요. 숫자만 입력하세요.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("과학점수를 입력하세요.");
			sciScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(sciScore);
			if (matNum.matches() == false)
				System.out.println("다시 입력하세요. 숫자만 입력하세요.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("사회점수를 입력하세요.");
			socScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(socScore);
			if (matNum.matches() == false)
				System.out.println("다시 입력하세요. 숫자만 입력하세요.");
			else {
				break;
			}
		}
		while (true) {
			System.out.println("도덕점수를 입력하세요.");
			morScore = sc.nextLine();
			matNum = Pattern.compile(numPattern).matcher(morScore);
			if (matNum.matches() == false)
				System.out.println("다시 입력하세요. 숫자만 입력하세요.");
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
		
		System.out.println("첫 번째 학생");
		scoreCheck();
		students[0].setMathScore(Integer.valueOf(mathScore));
		students[0].setEngScore(Integer.valueOf(engScore));
		students[0].setSciScore(Integer.valueOf(sciScore));
		students[0].setSocScore(Integer.valueOf(socScore));
		students[0].setMorScore(Integer.valueOf(morScore));
		
		//학생이 추가되어도 각 학생의 점수가 따로 저장된다는 것을 나타내기 위한 추가입력
		System.out.println("\n두 번째 학생");
		scoreCheck();
		students[1].setMathScore(Integer.valueOf(mathScore));
		students[1].setEngScore(Integer.valueOf(engScore));
		students[1].setSciScore(Integer.valueOf(sciScore));
		students[1].setSocScore(Integer.valueOf(socScore));
		students[1].setMorScore(Integer.valueOf(morScore));
		
		//입력한 학생 두 명의 점수 총합 출력하기
		System.out.println();
		System.out.println("첫 번째 학생의 점수 총합 : " + students[0].getSumScore());
		System.out.println("두 번째 학생의 점수 총합 : " + students[1].getSumScore());
		
		//입력한 학생 두 명의 점수 평균 출력하기
		System.out.println("첫 번째 학생의 점수 평균 : " + students[0].getAvgScore());
		System.out.println("두 번째 학생의 점수 평균 : " + students[1].getAvgScore());
		
		//석차를 구하기 위해서 추가 학생 성적 임의로 넣기
		students[2].setSumScore(156);
		students[3].setSumScore(489);
		students[4].setSumScore(496);

		//석차 정렬 전, 평균들을 가지고 배열 생성
		double students_Score[] = new double[5];
		for(int i = 0; i < students.length; i++)
			students_Score[i] = students[i].getAvgScore();
		
		//정렬 전, 점수들 확인하기
		System.out.println("\n정렬 전 점수들");
		for(double i : students_Score)
			System.out.println(i);
		
		//학생의 석차를 구하기 위한 내림차순 정렬하기.
		double temp;
		for(int j = students_Score.length-1; j >0; j--) {	//j는 만약 전교 1등이 배열의 0번째 순서에 있다면 가장 뒤로 가야 하므로 j를 배열크기로 선언, 정렬작업을 배열크기만큼 반복하게 하는 역할
			for(int i = 0; i < students_Score.length-1; i++) {
				if(students_Score[i] < students_Score[i+1]) {
					temp = students_Score[i];
					students_Score[i] = students_Score[i+1];
					students_Score[i+1] = temp;
				}
			}
		}

		//정렬 후, 점수들 출력하기.
		System.out.println("\n정렬 후 점수들");
		for(double i : students_Score)
			System.out.println(i);
		
		//첫 번째 학생의 점수정보보기
		System.out.println("\ntoString실행");
		System.out.println(students[0]);
		
		//students[0]이 몇 등인지 출력하기
		for(int i = 0; i < students_Score.length; i++)
			if(students_Score[i] == students[0].getAvgScore()) {
				System.out.println("\n" + (i+1)+"등입니다.");
				break;
			}
	}
}
















































