package com.spring.demo;

public class SpringTest {
	private String springVersion;
	private String releaseDate;

	public SpringTest(){
		System.out.println("constructor called to create object");
	}
	
	public String getSpringVersion() {
		return springVersion;
	}
	public void setSpringVersion(String springVersion) {
		this.springVersion = springVersion;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void printSpringInfo(){
		System.out.println("version :"+this.springVersion+", date of release :"+this.releaseDate);
	}
}
