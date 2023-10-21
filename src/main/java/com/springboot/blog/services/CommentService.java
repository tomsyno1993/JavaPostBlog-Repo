package com.springboot.blog.services;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(Long postId, CommentDto commentDto);

    List<Comment> getCommentsByPostId(Long postId);

    CommentDto detCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto);

    void deleteComment(Long postId, Long commentId);
}
