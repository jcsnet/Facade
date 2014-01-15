package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database3 {

	public static class Db3DataPart{
		
		private String country;
		private String region;
		
		public Db3DataPart(String country, String region) {
			this.country = country;
			this.region = region;
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
	}

	private List<Db3DataPart> dbData3List = new ArrayList<Db3DataPart>();

	public Database3() {
		dbData3List.addAll(Arrays.asList(
				new Db3DataPart("Poland", "Malopolska"), 
				new Db3DataPart("France", "Île-de-France"), 
				new Db3DataPart("Austria", "Wien")));
	}

	public List<Db3DataPart> getAllDataList() {
		System.out.println("Fetching data from Database 3");
		return dbData3List;
	}

	public Db3DataPart getDataById(int index) {
		return dbData3List.get(index);
	}

	public void persist(Db3DataPart db3DataPart) {
		System.out.println("Persist data in Database 3");
		dbData3List.add(db3DataPart);
	}
}
