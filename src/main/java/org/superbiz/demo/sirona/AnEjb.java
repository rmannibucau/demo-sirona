package org.superbiz.demo.sirona;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
@Lock(LockType.READ)
public class AnEjb {
    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    // just to trigger some work regularly and create commit activity
    @Schedule(hour = "*", minute = "*", second = "*")
    public void scheduledMethod() {
        // no-op
    }

    public void findOne() {
        em.find(AnEntity.class, 1); // just to use jdbc
    }
}
