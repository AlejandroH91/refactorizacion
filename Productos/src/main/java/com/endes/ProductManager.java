package com.endes;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> Products= new ArrayList();
	
	//Utilizar excepciones específicas (por ejemplo, IllegalArgumentException o NoSuchElementException) en lugar de imprimir mensajes en consola. 
	/**
	 *  
	 * @param Producto Miramos si el producto es nulo o está vacio.
	 * @param price  Miramos que  su precio no sea negativo.
	 */
	public void addProduct(List<Product> Producto, double price) {
	        if (Producto == null || Producto.isEmpty()) {
	        	 throw new IllegalArgumentException("El nombre del producto no existe");
	            
	        }
	        if (price < 0) {
	            throw new IllegalArgumentException("Error el precio no puede ser negativo");
	            return;
	        }
	        try {
	            if (Producto.get(i)< productNames.length) {
	                productNames[productCount] = name;
	                productPrices[productCount] = price;
	                productCount++;
	                System.out.println("Producto agregado: " + name);
	            } else {
	                // Conversión improvisada de arrays a listas
	                System.out.println("Límite de array alcanzado. Convirtiendo a lista...");
	                java.util.List namesList = new java.util.ArrayList<>();
	                java.util.List pricesList = new java.util.ArrayList<>();
	                for (int i = 0; i < productCount; i++) {
	                    namesList.add(productNames[i]);
	                    pricesList.add(productPrices[i]);
	                }
	                namesList.add(name);
	                pricesList.add(price);
	                // Reconstruye los arrays a partir de la lista
	                productNames = new String[namesList.size()];
	                productPrices = new double[pricesList.size()];
	                for (int i = 0; i < namesList.size(); i++) {
	                    productNames[i] = namesList.get(i);
	                    productPrices[i] = pricesList.get(i);
	                }
	                productCount = namesList.size();
	                System.out.println("Producto agregado después de conversión: " + name);
	            }
	        } catch (Exception e) {
	            System.out.println("Error al agregar producto: " + e.getMessage());
	        }
	    }
}
