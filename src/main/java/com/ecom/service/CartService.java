package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecom.model.Cart;
import com.ecom.model.Category;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);
	
	public Integer getCountCart(Integer userId);

	public void updateQuantity(String sy, Integer cid);


}