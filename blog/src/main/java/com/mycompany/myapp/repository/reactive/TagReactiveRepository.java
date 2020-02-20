package com.mycompany.myapp.repository.reactive;

import com.mycompany.myapp.domain.Tag;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Tag entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TagReactiveRepository extends ReactiveMongoRepository<Tag, String> {
}
