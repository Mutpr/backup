package src1_20200607;

public class Word {
	private String english, meaning;
	
	public void setWord(String english, String meaning) {
		this.english = english;
		this.meaning = meaning;
	}
	
	public String getEng() {
		return english;
	}
	
	public String getMeaning() {
		return meaning;
	}
	
	public String toString() {
		return " "+english+" :"+meaning;
	}
}
