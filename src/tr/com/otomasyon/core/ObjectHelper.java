package tr.com.otomasyon.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import tr.com.otomasyon.interfaces.Corelnterfaces;
//bir sınıfın bir arayüzü uygulayacağını belirtmek için kullanılır. implements kullanılarak, bir sınıf arayüzde bildirilen tüm soyut yöntemler için somut uygulamalar sağlamayı kabul eder.
public class ObjectHelper extends CoreFields implements Corelnterfaces {

	static {
		
		try {
			Class.forName("com.postgresql.jdbc.Driver"); //properties , bir uygulamanın yapılandırılabilir parametrelerini depolamak için çoğunlukla Java ile ilgili teknolojilerde kullanılan dosyalar için bir dosya uzantısıdır . Ayrıca , Uluslararasılaştırma ve yerelleştirme için dizeleri depolamak için de kullanılabilirler; bunlara Özellik Kaynak Paketleri denir.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//try anahtar kelimesi kodları çalışma zamanında test etmek için kullanılırken, 
//catch anahtar kelimesi ise çalışma zamanında hata çıkması durumunda bu hataları yakalamak için kullanılır.	
	
	
	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return connection;
	}
	

}
