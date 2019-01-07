package chapter08;

/**
 * super라는 키워드를 사용하면
 * 하위클래스에서 메소드를 오버라이드할 때
 * 상위클래스에 있는 버전의 메소드를 호출할 수 있습니다.
 *
 */
public class BuzzwordsReport extends Report {
		
	void runReport() {
		super.runReport(); // 상위클래스 버전을 호출한 다음 하위클래스에서 해야할 일을 처리합니다.
		buzzwordCompliance();
		printReport();
	}

	void buzzwordCompliance() {
		System.out.println("컴플라이언스 처리");
	}
}
