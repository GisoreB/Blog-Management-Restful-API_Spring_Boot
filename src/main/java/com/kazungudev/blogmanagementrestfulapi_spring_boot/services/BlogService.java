package com.kazungudev.blogmanagementrestfulapi_spring_boot.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kazungudev.blogmanagementrestfulapi_spring_boot.dto.BlogDTO;

public interface BlogService {
    BlogDTO createBlog(BlogDTO blogDTO);
    Page<BlogDTO> getAllBlogs(Pageable pageable);
    BlogDTO getBlogById(Long id);
    BlogDTO updateBlog(Long id, BlogDTO blogUpdate);
    void deleteBlog(Long id);
}