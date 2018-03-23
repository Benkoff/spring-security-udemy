package io.github.benkoff.springsecurity.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;

/**
 * Created by Ben Novikov on 2018, February, 22
 */
@MappedSuperclass
public class AbstractDomainObject implements DomainObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Version
    private Integer version;
    private Date dateCreated;
    private Date lastUpdated;

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
