package po;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import utils.CustomJsonDateDeserializer;

public class Comment {
	
    private Integer commentId;

    private Integer userId;

    private Integer eyooId;

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date commentTime;

    private String commentContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer geteyooId() {
        return eyooId;
    }

    public void seteyooId(Integer eyooId) {
        this.eyooId = eyooId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}