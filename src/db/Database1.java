package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database1 {

	public static class Db1DataPart {

		private Integer id;
		private String name;
		private String surname;

		public Db1DataPart(Integer id, String name, String surname) {
			this.id = id;
			this.name = name;
			this.surname = surname;
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
	}

	private List<Db1DataPart> dbData1List = new ArrayList<Db1DataPart>();

	public Database1() {
		dbData1List.addAll(Arrays.asList(
				new Db1DataPart(1, "Adam", "Kowalski"), 
				new Db1DataPart(2,"Marek", "Nowak"), 
				new Db1DataPart(3, "Tomasz","Kowalski")));
	}

	public List<Db1DataPart> getAllDataList() {
		System.out.println("Fetching data from Database 1");
		return dbData1List;
	}
	
	public Db1DataPart getDataById(int index) {
		return dbData1List.get(index);
	}

	public void persist(Db1DataPart db1DataPart) {
		System.out.println("Persist data in Database 1");
		dbData1List.add(db1DataPart);
	}
}
