package com.rupesh.joblisting.repository;

import com.rupesh.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}