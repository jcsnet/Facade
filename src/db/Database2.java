package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database2 {

	public static class Db2DataPart {

		private String pesel;
		private String birthYear;

		public Db2DataPart(String pesel, String birthYear) {
			this.pesel = pesel;
			this.birthYear = birthYear;
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
	}

	private List<Db2DataPart> dbData2List = new ArrayList<Db2DataPart>();

	public Database2() {
		dbData2List.addAll(Arrays.asList(
				new Db2DataPart("90070325869", "1990"), 
				new Db2DataPart("88080325869", "1988"), 
				new Db2DataPart("79070325869", "1979")));
	}

	public List<Db2DataPart> getAllDataList() {
		System.out.println("Fetching data from Database 2");
		return dbData2List;
	}

	public Db2DataPart getDataById(int index) {
		return dbData2List.get(index);
	}

	public void persist(Db2DataPart db2DataPart) {
		System.out.println("Persist data in Database 2");
		dbData2List.add(db2DataPart);
	}
}
