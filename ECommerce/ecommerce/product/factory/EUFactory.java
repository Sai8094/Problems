package com.ecommerce.product.factory;

import com.ecommerce.product.Books;
import com.ecommerce.product.Clothing;
import com.ecommerce.product.Electronics;
import com.ecommerce.product.Product;

public class EUFactory implements Factory {

	@Override
	public Product createElectronics() {
		return new Electronics("Laptop", 90000);
	}

	@Override
	public Product createClothing() {
		return new Clothing("T-Shirt", 3000);
	}

	@Override
	public Product createBook() {
		return new Books("The Paradise", 230);
	}

}
