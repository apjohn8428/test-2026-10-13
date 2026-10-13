package stringTest;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String age = "17"; //외부로부터 입력받은 나이
		
		//int agePlus = age + 3; -> age가 문자열이므로 계산 불가 
		//(int) age 불가 -> String - int 형변환이 불가
		
		int ageNum = Integer.parseInt(age); //문자열이 정수로 변환되어 저장 -> 문자열 숫자를 정수형 숫자로 변환
		int agePlus = ageNum + 3;
		
		String height = "175.8";
		double heightNum = Double.parseDouble(height); //문자열 숫자를 실수형 숫자로 변환
		
		int num1 = 915;
		String str1 = String.valueOf(num1); //숫자를 문자열로 저장
		String str2 = Integer.toString(num1); //숫자를 문자열로 변환
	}

}
