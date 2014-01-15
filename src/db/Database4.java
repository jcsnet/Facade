package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database4 {

	public static class Db4DataPart{
		
		private String city;
		private String street;
		
		public Db4DataPart(String city, String street) {
			this.city = city;
			this.street = street;
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
	}
	
	private List<Db4DataPart> dbData4List = new ArrayList<Db4DataPart>();
	
	public Database4() {
		dbData4List.addAll(Arrays.asList(
				new Db4DataPart("Krakow", "Floriañska"), 
				new Db4DataPart("Paris", "Champs-Elysees"), 
				new Db4DataPart("Vienna", "Wolfganggasse")));
	}
	
	public List<Db4DataPart> getAllDataList() {
		System.out.println("Fetching data from Database 4");
		return dbData4List;
	}

	public Db4DataPart getDataById(int index) {
		return dbData4List.get(index);
	}

	public void persist(Db4DataPart db4DataPart) {
		System.out.println("Persist data in Database 4");
		dbData4List.add(db4DataPart);
	}
}
