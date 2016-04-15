package co.refiere.models;
// Generated Apr 15, 2016 11:32:27 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class RefiereUserCompany.
 * @see co.refiere.models.RefiereUserCompany
 * @author Hibernate Tools
 */
public class RefiereUserCompanyHome {

	private static final Log log = LogFactory.getLog(RefiereUserCompanyHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RefiereUserCompany transientInstance) {
		log.debug("persisting RefiereUserCompany instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RefiereUserCompany instance) {
		log.debug("attaching dirty RefiereUserCompany instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RefiereUserCompany instance) {
		log.debug("attaching clean RefiereUserCompany instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RefiereUserCompany persistentInstance) {
		log.debug("deleting RefiereUserCompany instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RefiereUserCompany merge(RefiereUserCompany detachedInstance) {
		log.debug("merging RefiereUserCompany instance");
		try {
			RefiereUserCompany result = (RefiereUserCompany) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefiereUserCompany findById(java.lang.String id) {
		log.debug("getting RefiereUserCompany instance with id: " + id);
		try {
			RefiereUserCompany instance = (RefiereUserCompany) sessionFactory.getCurrentSession()
					.get("co.refiere.models.RefiereUserCompany", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RefiereUserCompany instance) {
		log.debug("finding RefiereUserCompany instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.refiere.models.RefiereUserCompany")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
