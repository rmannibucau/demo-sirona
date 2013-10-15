package org.superbiz.demo.sirona;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnEntity {
    @Id
    private long id;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }
}
