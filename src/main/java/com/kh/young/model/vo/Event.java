package com.kh.young.model.vo;

import java.sql.Date;

import lombok.Data;

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
public class Event {
	private int event_num;
	private String event_name;
	private Date event_startDate;
	private Date event_endDate;
	private String event_status;
}