public class StudentDB {

	private int mathScore;
	private int engScore;
	private int sciScore;
	private int socScore;
	private int morScore;
	private int sumScore;
	private double avgScore;
	
	int getMathScore() {
		return mathScore;
	}
	void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	int getEngScore() {
		return engScore;
	}
	void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	int getSciScore() {
		return sciScore;
	}
	void setSciScore(int sciScore) {
		this.sciScore = sciScore;
	}
	int getSocScore() {
		return socScore;
	}
	void setSocScore(int socScore) {
		this.socScore = socScore;
	}
	int getMorScore() {
		return morScore;
	}
	void setMorScore(int morScore) {
		this.morScore = morScore;
	}
	int getSumScore() {
		sumScore = mathScore+engScore+sciScore+socScore+morScore;
		return sumScore;
	}
	void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	double getAvgScore() {
		avgScore = sumScore/5;
		return avgScore;
	}
	void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
	
	public String toString() {
		
		String str = "\n���� ���� : " + mathScore
				+ "\n���� ���� : " + engScore
				+ "\n���� ���� : " + sciScore
				+ "\n��ȸ ���� : " + socScore
				+ "\n���� ���� : " + morScore
				+ "\n���� ���� : " + sumScore
				+ "\n���� ��� : " + avgScore; 
		return str;
	}
}
