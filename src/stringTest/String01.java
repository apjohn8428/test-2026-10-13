package stringTest;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "홍";
		String lastName = "길동";
		
		String fullName = firstName + lastName; //문자열 연결
		
		System.out.println(fullName);
		
		int age = 26;
		
		System.out.println("나이:" + age);
		
		String str = "나이:";
		String strs = str + age; //문자열 + 정수 타입 -> 자동 형변환 발생 -> str + (String) age
		
		System.out.println(strs);
		
		fullName.length(); //문자열의 길이 -> 문자열의 갯수
		
		System.out.println(fullName.length());
		System.out.println(strs.length());
		
		String str1 = "Hello";
		System.out.println(str1.charAt(0)); //인덱스를 사용하여 문자를 추출하는 메서드
		
		String str2 = "Hello Good Morning Java";
		str2.contains("Good"); //해당 문자열이 객체에 들어있는지 확인
		str2.startsWith("Hello"); //해당 문자열로 시작하는지 확인
		str2.endsWith("Java"); //해당 문자열로 끝나는지 확인
		
		String str3 = "abc.jpg";
		System.out.println(str3.substring(4)); //입력한 인덱스에 해당하는 문자부터 마지막 문자까지 추출
		System.out.println(str3.substring(2, 4)); //입력한 인덱스 사이의 문자 추출 -> 마지막 인덱스는 포함 안됨
		
		String str4 = "대한민국";
		System.out.println(str4.replace("민국", "국민")); //대한민국 -> 대한국민, 원본을 바꾸지는 않음
		
		String str5 = "우리는-자바-공부를-열심히-해야합니다.";
		String str6 = str5.replace("-", "_");
		System.out.println(str6);
		
		String str7 = str5.replaceAll("-", " "); //replace와 replaceAll의 차이는 정규식의 사용여부
		System.out.println(str7);
		
		//다음 문자열에서 숫자를 제거
		String str8 = "abc123def456";
		str8.replaceAll("[0-9]", ""); //[0-9]: 숫자를 찾아 제거하는 정규식
		str8.replaceAll("[^0-9]", ""); //[^0-9]: 숫자를 제외한 모든 것을 제거하는 정규식
		
		String str9 = "koREa";
		str9.toUpperCase(); //대문자로 변경
		str9.toLowerCase(); //소문자로 변경
		
		String str10 = " 안녕하세요 ~~ "; //검색 시 여러 불편함이 발생
		str10.trim(); //문자열 양쪽의 공백을 제거 -> 검색엔진에서 중요
		System.out.println(str10);
		System.out.println(str10.trim());
		
		String str11 = ""; //아무것도 저장 안됨 -> 외부에서 문자열을 받을 때 확인 필요 -> 내용 유무 확인
		str11.isEmpty(); //내용 여부를 확인 -> 공백은 true, 문자가 있으면 false -> 띄어쓰기 공백도 문자로 인식
		
		String str12 = " ";
		str12.isEmpty(); 
		str12.isBlank(); //공백 문자만 들어있을 때 true
		System.out.println(str12.isEmpty());
		System.out.println(str12.isBlank());
	}

}
