package SQLQueriesPackage;

public class Sqlqueries {

	public static final String GET_ALL_DEPARTMENT="select * from departman_db";
	public static final String get_all_filter="select * from filtre_db"; 
	public static final String get_one_department="select * from departman_db where d_id=?";
	public static final String get_save_department="INSERT INTO departman_db ( `departman`, `companent`)   VALUES (?,?)";
	public static final String get_update_department="UPDATE departman_db SET departman=?,companent=? WHERE d_id=?";
	public static final String get_delete_department="DELETE FROM departman_db where d_id=?";
	public static final String get_login_user = "Select * from kullanici_db where kullanici_adi=? and parola=?";
}
