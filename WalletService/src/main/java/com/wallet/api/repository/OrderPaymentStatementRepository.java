package com.wallet.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wallet.api.model.EWallet;
import com.wallet.api.model.OrderPaymentStatement;

public interface OrderPaymentStatementRepository extends JpaRepository<OrderPaymentStatement,Integer>{

	List<OrderPaymentStatement> findByWalletId(int walletId);

	

}
