package com.kazungudev.blogmanagementrestfulapi_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kazungudev.blogmanagementrestfulapi_spring_boot.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}