package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database5 {

	public static class Db5DataPart {

		private Boolean active;
		private Boolean admin;
		
		public Db5DataPart(Boolean active, Boolean admin) {
			this.active = active;
			this.admin = admin;
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
	}
	
	private List<Db5DataPart> dbData5List = new ArrayList<Db5DataPart>();
	
	public Database5() {
		dbData5List.addAll(Arrays.asList(
				new Db5DataPart(true, true), 
				new Db5DataPart(true, false), 
				new Db5DataPart(true, true)));
	}
	
	public List<Db5DataPart> getAllDataList() {
		System.out.println("Fetching data from Database 5");
		return dbData5List;
	}

	public Db5DataPart getDataById(int index) {
		return dbData5List.get(index);
	}

	public void persist(Db5DataPart db5DataPart) {
		System.out.println("Persist data in Database 5");
		dbData5List.add(db5DataPart);
	}
}
