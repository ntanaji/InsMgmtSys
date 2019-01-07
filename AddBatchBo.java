package com.nt.ims.bo;

public class AddBatchBo {

	private int batch_id;
	private String batch_name;
	private String sdate;
	private String edate;
	private String duration;
	private int tech_id;
	private String tech_name;
	private int agg_fee;
	private int paid_amt;

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public String setBatch_name(String batch_name) {
		return this.batch_name = batch_name;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTech_id() {
		return tech_id;
	}

	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}

	public String getTech_name() {
		return tech_name;
	}

	public void setTech_name(String tech_name) {
		this.tech_name = tech_name;
	}

	public int getAgg_fee() {
		return agg_fee;
	}

	public int setAgg_fee(int agg_fee) {
		return this.agg_fee = agg_fee;
	}

	public int getPaid_amt() {
		return paid_amt;
	}

	public void setPaid_amt(int paid_amt) {
		this.paid_amt = paid_amt;
	}

}