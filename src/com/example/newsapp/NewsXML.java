package com.example.newsapp;

public class NewsXML {
	private String titlel;
	private String description;
	private String image;
	private String type;
	private String comment;
	@Override
	public String toString() {
		return "NewsXML [titlel=" + titlel + ", description=" + description + ", image=" + image + ", type=" + type
				+ ", comment=" + comment + "]";
	}
	public String getTitlel() {
		return titlel;
	}
	public void setTitlel(String titlel) {
		this.titlel = titlel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
