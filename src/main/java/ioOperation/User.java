package ioOperation;

public class User {
	private String keywords=null;
	private String countryName=null;
	@Override
	public String toString() {
		return "User [keywords=" + keywords + ", countryName=" + countryName + ", cityName=" + cityName + "]";
	}
	private String cityName=null;
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
