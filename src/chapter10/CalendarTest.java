package chapter10;

import java.util.Calendar;

/** Calendar 객체 사용법
 * 
 * 필드에 상태가 저장됩니다 : Calendar 객체에는 여러 개의 필드가 있고, 이 필드들에 궁극적인 상태(날짜와 시간)가 저장됩니다. 
 * 
 * 날짜와 시간을 증감시킬 수 있습니다 : Calendar 클래스에는 다양한 필드의 값을 증가 또는 감소시킬 수 있게 해주는 메소드가 들어있습니다. 
 * 한 달을 더하거나 세 달 빼는 것 같은 작업을 할 수 있습니다.
 * 
 * 날짜와 시각을 밀리초 단위로 표현할 수 있습니다 : Calendar 클래스를 써서 날짜/시각을 밀리초 단위의 시각(좀더 정확하게 말하자면
 * 1970년 1월 1일로부터 경과한 시간을 밀리초 단위로 표현한 값)으로 변환할 수 있습니다. 
 */
public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 21, 18, 02);
	
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		
		c.setTimeInMillis(day1);;
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		
		c.add(c.DATE, 35);
		System.out.println("add 35 days " + c.getTime());
		
		c.roll(c.DATE, 35);
		System.out.println("roll 35 days " + c.getTime());
		
		c.set(c.DATE, 1);
		System.out.println("set to 1 " + c.getTime());
		
	}
}
