package com.nt.ims.bo;

public class AddPaymentBo {

	private int pay_id;
	private int tr_id;
	private int agg_fee;
	private String pay_date;
	private int paid_amt;
	private String firstname;
	private int amount;

	public int getPay_id() {
		return pay_id;
	}

	public void setPay_id(int pay_id) {
		this.pay_id = pay_id;
	}

	public int getTr_id() {
		return tr_id;
	}

	public void setTr_id(int tr_id) {
		this.tr_id = tr_id;
	}

	public int getAgg_fee() {
		return agg_fee;
	}

	public int setAgg_fee(int agg_fee) {
		return this.agg_fee = agg_fee;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public int getPaid_amt() {
		return paid_amt;
	}

	public int setPaid_amt(int paid_amt) {
		return this.paid_amt = paid_amt;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}