package com.mars.datastore.repository;

import com.mars.datastore.model.PersonCompId;
import com.mars.datastore.model.PersonComposedId;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonComposedRepo extends DatastoreRepository<PersonComposedId, PersonCompId> {
}
