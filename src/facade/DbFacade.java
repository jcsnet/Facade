package facade;

import db.Database1;
import db.Database1.Db1DataPart;
import db.Database2;
import db.Database2.Db2DataPart;
import db.Database3;
import db.Database3.Db3DataPart;
import db.Database4;
import db.Database4.Db4DataPart;
import db.Database5;
import db.Database5.Db5DataPart;
import domain.User;

public class DbFacade {
	
	private Database1 db1 = new Database1();
	private Database2 db2 = new Database2();
	private Database3 db3 = new Database3();
	private Database4 db4 = new Database4();
	private Database5 db5 = new Database5();
	
	public User getUserById(int index){
		
		User user = new User();
		
		user.setId(db1.getDataById(index).getId());
		user.setName(db1.getDataById(index).getName());
		user.setSurname(db1.getDataById(index).getSurname());
		
		user.setBirthYear(db2.getDataById(index).getBirthYear());
		user.setPesel(db2.getDataById(index).getPesel());
		
		user.setCountry(db3.getDataById(index).getCountry());
		user.setRegion(db3.getDataById(index).getRegion());
		
		user.setCity(db4.getDataById(index).getCity());
		user.setStreet(db4.getDataById(index).getStreet());
		
		user.setActive(db5.getDataById(index).isActive());
		user.setAdmin(db5.getDataById(index).isAdmin());
		
		return user;
	}
	
	public void persistUser(User user){
		
		db1.persist(new Db1DataPart(user.getId(), user.getName(), user.getSurname()));
		db2.persist(new Db2DataPart(user.getPesel(), user.getBirthYear()));
		db3.persist(new Db3DataPart(user.getCountry(), user.getRegion()));
		db4.persist(new Db4DataPart(user.getCity(), user.getStreet()));
		db5.persist(new Db5DataPart(user.isActive(), user.isAdmin()));
	}

}
