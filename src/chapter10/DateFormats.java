package chapter10;

import java.util.Date;

/**
 * 숫자와 날짜 포매팅의 가장 큰 차이점은 날짜 포맷은 t로 시작하는 두 글자 유형을 사용한다는 점입니다.
 * 숫자의 경우에는 f나 d같은 한 글자로 유형을 표시하죠.
 * 
 * 날짜와 간을 전부 표시할 때 : %tc
 * 시간만 표시할 때 : %tr
 * 요일, 월, 일을 표시할 때 : %tA %tB %td 
 * 위와 똑같지만 인자를 한 번만 전달할 때 : %tA %tB %td
 *
 */
public class DateFormats {
	public static void main(String[] args) {
		// 날짜와 시간을 전부 표시할 때 : %tc
		String tc = String.format("%tc", new Date());
		System.out.println(tc);
		
		// 시간만 표시할 때 : %tr
		String tr = String.format("%tr", new Date());
		System.out.println(tr);
		
		// 요일, 월, 일을 표시할 때 : %tA %tB %td
		Date today = new Date();
		System.out.println(String.format("%tA, %tB %td", today, today, today));
		
		// 위와 똑같지만 인자를 한 번만 전달할 때 : %tA %tB %td
		System.out.println(String.format("%tA, %<tB %<td", today)); // 왼쪽 꺽쇠 '<'는 포매터한테 이전 인자를 다시 써주세요 라고 말하는 플래그입니다. 
	}
}
