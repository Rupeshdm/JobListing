package com.rupesh.joblisting.repository;

import com.rupesh.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends MongoRepository<Post,String> {
}
