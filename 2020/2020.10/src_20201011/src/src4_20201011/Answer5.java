package src4_20201011;

public class Answer5 {
	public static void dbwork(DataAccessObject db) {
		db.select();
		db.insert();
		db.update();
		db.delete();
	}
	
	public static void main(String [] args) {
		dbwork(new OracleDB());
		dbwork(new MySqlDB());
	}

}
