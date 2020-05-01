
public class Video extends LibraryItem {
	private String studio;
	private String artist;
	
	
	
	public Video(int CallNumber, String Title, boolean available, String studio, String artist) {
		super(CallNumber, Title, available);
		this.setStudio(studio);
		this.setArtist(artist);
	}



	@Override
	public String toString() {
		return "Video [studio=" + studio + ", artist=" + artist + "]";
	}



	public String getStudio() {
		return studio;
	}



	public void setStudio(String studio) {
		this.studio = studio;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//get and set
	//print and toString
}
