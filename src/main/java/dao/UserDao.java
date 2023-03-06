package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;

import dto.UserInfo;
@WebServlet
public class UserDao {

	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	public void save(UserInfo userinfo) {
		transaction.begin();
		manager.persist(userinfo);
		transaction.commit();
	}
//	public UserInfo fetch(String email)
//	{
//		manager.createQuery("select x from UserInfo x*/ where email=?1").setParameter(1, email);
//	}
	public UserInfo fetch(long mobile)
	{
		List<UserInfo> list=manager.createQuery("select x from UserInfo x where mobile=?1").setParameter(1, mobile).getResultList();
				if(list.isEmpty())
				{
					return null;
				}
				else {
					return list.get(0);
				}
		
			
	}
	public UserInfo fetch(String email)
	{
		List<UserInfo> list=manager.createQuery("select x from UserInfo x where email=?1").setParameter(1, email).getResultList();
				if(list.isEmpty())
				{
					return null;
				}
				else {
					return list.get(0);
				}
	}
	public List<UserInfo> fetchAll(){
		return manager.createQuery("select x from UserInfo x").getResultList();
	}
	public void delete(UserInfo userInfo)
	{
		transaction.begin();
		manager.remove(userInfo);
		transaction.commit();
	}
	public UserInfo fetch(int id)
	{
		return manager.find(UserInfo.class, id);
	}
	public void update(UserInfo userInfo)
	{
		transaction.begin();
		manager.merge(userInfo);
		transaction.commit();
	}
}
