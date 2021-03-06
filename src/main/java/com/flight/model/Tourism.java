package com.flight.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Tourism {
	
	@Id
	@NotNull(message = "Id can't be null.")
	private String id;
	
	@Field
	private String title;
	
	@Field
	private String poster;
	
	@Field
	private Long postDate;
	
	@Field
	private String posterAvatarUrl;
	
	@Field
	private String posterNickName;
	
	@Field
	private String departureDate;
	
	@Field
	private String departureLocation;
	
	@Field
	private String arrivalLocation;

	@Field
	private String duration;
	
	@Field
	private String content;
	
	@Field
	private Integer participantCnt;
	
	@Field
	private List<String> replyList;
	
	@Field
	private Integer replyCnt;
	
	@Field
	private Set<String> participants;
	
	@Field
	private Boolean isFull;
	
	@Field
	private Boolean isEnded;
	
	@Field
	private Boolean isDeleted;
	
	@Field
	private Long deletedDate;
	
	@Field
	private Set<Map<String, String>> signUpSet;
	
	@Field
	private String contact;
	
	@Field
	private Integer postWeekOfYear;
	
	@Field
	private Integer postYear;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Long getPostDate() {
		return postDate;
	}
	
	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public void setPostDate(Long postDate) {
		this.postDate = postDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getParticipantCnt() {
		return participantCnt;
	}

	public void setParticipantCnt(Integer participantCnt) {
		this.participantCnt = participantCnt;
	}

	public List<String> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<String> replyList) {
		this.replyList = replyList;
	}

	public Integer getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(Integer replyCnt) {
		this.replyCnt = replyCnt;
	}

	public Set<String> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<String> participants) {
		this.participants = participants;
	}

	public Boolean getIsFull() {
		return isFull;
	}

	public void setIsFull(Boolean isFull) {
		this.isFull = isFull;
	}

	public Boolean getIsEnded() {
		return isEnded;
	}

	public void setIsEnded(Boolean isEnded) {
		this.isEnded = isEnded;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Set<Map<String, String>> getSignUpSet() {
		return signUpSet;
	}

	public void setSignUpSet(Set<Map<String, String>> signUpSet) {
		this.signUpSet = signUpSet;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public Integer getPostWeekOfYear() {
		return postWeekOfYear;
	}

	public void setPostWeekOfYear(Integer postWeekOfYear) {
		this.postWeekOfYear = postWeekOfYear;
	}

	public Integer getPostYear() {
		return postYear;
	}

	public void setPostYear(Integer postYear) {
		this.postYear = postYear;
	}

	public String getPosterAvatarUrl() {
		return posterAvatarUrl;
	}

	public void setPosterAvatarUrl(String posterAvatarUrl) {
		this.posterAvatarUrl = posterAvatarUrl;
	}

	public String getPosterNickName() {
		return posterNickName;
	}

	public void setPosterNickName(String posterNickName) {
		this.posterNickName = posterNickName;
	}

	public Long getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Long deletedDate) {
		this.deletedDate = deletedDate;
	}

	@Override
	public String toString() {
		return "Tourism [id=" + id + ", title=" + title + ", poster=" + poster + ", postDate=" + postDate
				+ ", posterAvatarUrl=" + posterAvatarUrl + ", posterNickName=" + posterNickName + ", departureDate="
				+ departureDate + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation
				+ ", duration=" + duration + ", content=" + content + ", participantCnt=" + participantCnt
				+ ", replyList=" + replyList + ", replyCnt=" + replyCnt + ", participants=" + participants + ", isFull="
				+ isFull + ", isEnded=" + isEnded + ", isDeleted=" + isDeleted + ", deletedDate=" + deletedDate
				+ ", signUpSet=" + signUpSet + ", contact=" + contact + ", postWeekOfYear=" + postWeekOfYear
				+ ", postYear=" + postYear + "]";
	}
	
	
	
	

}
