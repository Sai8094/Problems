package com.ecommerce.product.factory;

import com.ecommerce.product.Product;

public interface Factory {
	Product createElectronics();

	Product createClothing();

	Product createBook();
}
