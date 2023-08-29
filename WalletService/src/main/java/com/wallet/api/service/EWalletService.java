package com.wallet.api.service;

import java.util.List;

import com.wallet.api.model.EWallet;
import com.wallet.api.model.Statement;
import com.wallet.api.model.OrderPaymentStatement;


public interface EWalletService {
	
	public List<EWallet> getWallets();
	
	public EWallet addWallet(EWallet ewallet,int userId);
	
	public EWallet addMoney(int walletId,Double amount);
	
	
	public EWallet getById(int walletId);
	
	
	public List<Statement> getStatements();
	
	public String deleteById(int walletId);
	
	public EWallet removeMoney(int walletId,Double amount);
	
	public  OrderPaymentStatement  payUsingWallet(Double amount,int walletId);
	public EWallet getWalletByUser(int userId);
	


}
