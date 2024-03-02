package com.example.demo.pojo;

import lombok.Data;

@Data
public class searchProductpojo {
	
	private String serachText;

	public String getSerachText() {
		return serachText;
	}

	public void setSerachText(String serachText) {
		this.serachText = serachText;
	}

}
