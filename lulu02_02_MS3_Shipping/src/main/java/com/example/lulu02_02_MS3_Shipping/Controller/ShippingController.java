package com.example.lulu02_02_MS3_Shipping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lulu02_02_MS3_Shipping.Entity.ShippingEntity;
import com.example.lulu02_02_MS3_Shipping.Repository.ShippingRepository;



@RestController
public class ShippingController {


	@Autowired
	ShippingRepository sr;

	@GetMapping("sss/getShipping")
	public List<ShippingEntity> getJPQL() {
		return sr.findAll(); // select * from <TableName>;
	}
	@PostMapping("sss/addShipping")
	public ShippingEntity createuser(@RequestBody ShippingEntity prod) {
		return sr.save(prod);

	  }
	@DeleteMapping("sss/deleteCustomerCare/{id}")
	public void deletProduct(@PathVariable("id") Integer id  ) {

		sr.deleteById(id); // select * from <TableName>;


	}
}
