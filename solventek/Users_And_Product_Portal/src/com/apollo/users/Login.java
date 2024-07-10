package com.apollo.users;

import java.util.List;

import com.apollo.prouducts.NoProductAvailableException;
import com.apollo.prouducts.Product;

public interface Login {
	
	void login();
	
	void logout();
	
	void browseProducts(List<Product> products) throws NoProductAvailableException;

}
