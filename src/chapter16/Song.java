package chapter16;

/**
 * 
 * String이 아닌 Song 객체를 정렬하기 
 *
 */
class Song implements Comparable<Song>{
	// 파일에 들어있는 네 가지 속성을 저장하기 위한 네개의 인스턴스 변수 
	String title;
	String artist;
	String rating;
	String bpm;
	
	// equals() 오버라이딩 
	public boolean equals(Object aSong) {
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}
	
	// hashCode() 오버라이딩 
	public int hashCode() {
		return title.hashCode();
	}
	
	// 변수는 모두 Song이 생성될 때 생성자에서 설정됩니다.
	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}
	
	// 네 가지 속성에 대한 게터 메소드
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	// System.out.println(aSongObject) 메소드를 호출했을 때 곡 제목이 출력될 수 있도록 하기 위해 toString()을 오버라이드하빈다. 
	
	// 이 객체가 주어진 객체보다 작으면 음의 정수, 둘이 같으면 0,이 객체가주어진 객체보다 크면 양의 정수를 리턴함 
	@Override
	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	@Override
	public String toString() {
		return title;
	}
}
