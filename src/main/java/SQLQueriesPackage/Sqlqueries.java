package SQLQueriesPackage;

public class Sqlqueries {

	public static final String GET_ALL_DEPARTMENT="select * from departman_db";
	public static final String get_all_filter="select * from filtre_db"; 
	public static final String get_one_department="select * from departman_db where d_id=?";
	public static final String get_save_department="INSERT INTO departman_db ( `departman`, `companent`)   VALUES (?,?)";
	public static final String get_update_department="UPDATE departman_db SET departman=?,companent=? WHERE d_id=?";
	public static final String get_delete_department="DELETE FROM departman_db where d_id=?";
	public static final String get_login_user = "select * from kullanici_db kb WHERE kb.kullanici_adi=? AND kb.parola=? and '00:02:00'< timediff(now(),blok_tarih)";
	public static final String get_login_hata_user="Select hatali_giris from kullanici_db where kullanici_adi=?";
	public static final String get_update_hata="UPDATE kullanici_db SET hatali_giris=? WHERE kullanici_adi=?";
	public static final String get_uptade_blokTarih_user="UPDATE kullanici_db SET blok_tarih=CURRENT_TIMESTAMP WHERE kullanici_adi=?";
	public static final String get_assigne_user="select * from kullanici_db where dk_id=?";
	
	
}
