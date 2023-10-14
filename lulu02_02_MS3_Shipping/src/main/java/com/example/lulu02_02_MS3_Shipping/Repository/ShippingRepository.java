package com.example.lulu02_02_MS3_Shipping.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.example.lulu02_02_MS3_Shipping.Entity.ShippingEntity;

public interface ShippingRepository extends JpaRepository<ShippingEntity, Integer>{

	   //JPQL
		//@Query("SELECT s FROM ShippingEntity s ")
		//List<ShippingEntity> findAllMyQuery();
}