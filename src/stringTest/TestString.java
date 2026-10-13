package stringTest;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//abcabcabc에서 ab가 몇 번 나오는지 세는 프로그램 작성
		String str1 = "abcabcabc";
		System.out.println(str1.contains("ab"));
		
		//korea@korea.com에서 아이디와 도메인을 분리하여 출력하는 프로그램 작성
		String str2 = "korea@korea.com";
		int index = str2.indexOf("@"); //해당 문자열의 인덱스를 찾는 메서드
		System.out.println(str2.substring(0, index)); //아이디
		System.out.println(str2.substring(index+1)); //도메인
		
		//다음 문자열에서 알파벳의 갯수를 출력하는 프로그램 작성
		String str3 = "Hello123, Java456";
		int count = 0;
		
		for(int i=0; i<=str3.length(); i++) {
			char ch = str3.charAt(i);
			//65~90, 97~122 사이의 아스키코드 값에 속하면 알파벳
			if((ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z')) {
				count++;
			}
		}
		System.out.println("알파벳의 갯수:" + count);
		
	}

}
