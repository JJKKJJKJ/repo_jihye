package com.qwer.fapp.anniversary;

public class AnniversaryDto {
	
	private String seq;
	private String listOfAnniversaries;
	private String date;
	private Integer solarLuna;
	private Integer mainp;
	private Integer contactMain_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getListOfAnniversaries() {
		return listOfAnniversaries;
	}
	public void setListOfAnniversaries(String listOfAnniversaries) {
		this.listOfAnniversaries = listOfAnniversaries;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getSolarLuna() {
		return solarLuna;
	}
	public void setSolarLuna(Integer solarLuna) {
		this.solarLuna = solarLuna;
	}
	public Integer getMainp() {
		return mainp;
	}
	public void setMainp(Integer mainp) {
		this.mainp = mainp;
	}
	public Integer getContactMain_seq() {
		return contactMain_seq;
	}
	public void setContactMain_seq(Integer contactMain_seq) {
		this.contactMain_seq = contactMain_seq;
	}
	
	
}
