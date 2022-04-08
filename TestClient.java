package mypack;

import org.hibernat.cfg.Configuration
import org.hibernate.Transaction;  
import com.mysql.cj.Session;
//import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.SessionFactory;   

public class TestClient {
	
	public static void main(String[] args)
	{
		Configuration cfg= new Configuration();
		cfg.Configure();
		SessionFactory sf=cfg.configure();
		Session s=sf.openSession();
		Employee employee =new Employee();
		employee.setEmpName("saquib ansari");
		employee.setEmpNo(110);
		employee.setEpmSal(45679.76F);
		s.persist(employee);
		Transaction t=s.beginTransaction();
		t.commit();
		s.Close();
		sf.close();
	}
	
}
