package com.kh.young.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Story {
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private Date boardCreateDate;
	private Date boardModifyDate;
	private int boardView;
	private String boardStatus;
	private int userNum;
	private int boardType;
	private Attachment attachment;
	private Member member;
	private String check;
	private Clip clip;
	private GeneralUser generaluser;
}
