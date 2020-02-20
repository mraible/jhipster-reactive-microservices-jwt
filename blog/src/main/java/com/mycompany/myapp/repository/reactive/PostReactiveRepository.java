package com.mycompany.myapp.repository.reactive;

import com.mycompany.myapp.domain.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Post entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PostReactiveRepository extends ReactiveMongoRepository<Post, String> {
}
