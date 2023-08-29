package com.wallet.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class EWallet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int walletId;
	
	private Double currentBalance;
	
	@Column(unique = true)
	private int userId;
	
	private String username;
	
@OneToMany(cascade = CascadeType.PERSIST,orphanRemoval = true)
	private List<Statement> statements;
	


	



	public EWallet(int walletId, Double currentBalance, int userId, String username, List<Statement> statements) {
		super();
		this.walletId = walletId;
		this.currentBalance = currentBalance;
		this.userId = userId;
		this.username = username;
		this.statements = statements;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public List<Statement> getStatements() {
		return statements;
	}



	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}





	public EWallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}


	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}


	
	

}
