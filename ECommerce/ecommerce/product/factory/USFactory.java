package com.ecommerce.product.factory;

import com.ecommerce.product.Books;
import com.ecommerce.product.Clothing;
import com.ecommerce.product.Electronics;
import com.ecommerce.product.Product;

public class USFactory implements Factory {

	@Override
	public Product createElectronics() {
		return new Electronics("Apple 16", 100000);
	}

	@Override
	public Product createClothing() {
		return new Clothing("Jacket", 5000);
	}

	@Override
	public Product createBook() {
		return new Books("The Night", 200);
	}

}
