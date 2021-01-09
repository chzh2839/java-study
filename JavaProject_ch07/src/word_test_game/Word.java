package word_test_game;

public class Word {
	private String eng;
	private String kor;
	
	public Word() {}
	
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Word [eng=" + eng + ", kor=" + kor + "]";
	}
	
	

}
