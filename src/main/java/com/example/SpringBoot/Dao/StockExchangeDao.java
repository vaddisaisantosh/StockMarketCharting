package com.example.SpringBoot.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.Model.Company;
import com.example.SpringBoot.Model.StockExchange;


public interface StockExchangeDao extends JpaRepository<StockExchange, Integer> {
	  
}
