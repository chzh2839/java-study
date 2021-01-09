package location;

public class Location {
	private String city;
	private int longitude; // �浵
	private int latitude; // ����
	
	public Location(String city, int longitude, int latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "city=" + city + ", longitude=" + longitude + ", latitude=" + latitude;
	}
	
	
	
	

}
