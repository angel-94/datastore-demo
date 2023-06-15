package com.mars.datastore.repository;

import com.mars.datastore.model.PersonSimpleId;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonSimpleRepo extends DatastoreRepository<PersonSimpleId, String> {
}
