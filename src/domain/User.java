package domain;

public class User {

	private Integer id;
	private String name;
	private String surname;
	private String pesel;
	private String birthYear;
	private String country;
	private String region;
	private String city;
	private String street;
	private Boolean active;
	private Boolean admin;

	public User() {
	}

	public User(Integer id, String name, String surname, String pesel,
			String birthYear, String country, String region, String city,
			String street, Boolean active, Boolean admin) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
		this.birthYear = birthYear;
		this.country = country;
		this.region = region;
		this.city = city;
		this.street = street;
		this.active = active;
		this.admin = admin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "\nId         : "+id + "\n" 
				+ "Name       : "+ name + " " + surname + "\n" 
				+ "Birth year : "+ birthYear + "\n"
				+ "Pesel      : "+ pesel + "\n"
				+ "Country    : "+ country + "\n"
				+ "Region     : "+ region + "\n"
				+ "City       : "+ city + "\n"
				+ "Street     : "+ street + "\n"
				+ "Active     : "+ active + "\n"
				+ "Admin      : "+ admin + "\n";
	}
}
