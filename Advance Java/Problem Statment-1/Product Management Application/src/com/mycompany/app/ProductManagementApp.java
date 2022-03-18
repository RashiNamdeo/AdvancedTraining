package com.mycompany.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.mycompany.dao.ProductManagementDAO;
import com.mycompany.domain.Product;

public class ProductManagementApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("----------------------------------------");
			System.out.println("A. View Products");
			System.out.println("B. Add Product");
			System.out.println("C. Update Product");
			System.out.println("D. Delete Product");
			System.out.println("E. Search Product");
			System.out.println("F. Exit");
			System.out.println("=========================");
			System.out.println("Enter an option");
			System.out.println("=========================");

			String ch = sc.next();
			switch (ch) {
			case "A":
				Product pb = new Product();
				int rows = ProductManagementDAO.viewall(pb);
				break;
			case "B":
				System.out.println("-----------------------------");
				System.out.println("Enter the Product ID");
				System.out.println("-----------------------------");

				Product pb1 = new Product();
				pb1.setProductID(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter the Product Name");
				System.out.println("-----------------------------");

				pb1.setProductName(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter the Product Price");
				System.out.println("-----------------------------");

				pb1.setProduct_price(sc.nextFloat());
				ProductManagementDAO scrud1 = new ProductManagementDAO();
				int rows1 = ProductManagementDAO.insert(pb1);
				if (rows1 > 0) {
					System.out.println("-----------------------------");

					System.out.println("Product added successfully");
					System.out.println("-----------------------------");

				} else {
					System.out.println("-----------------------------");

					System.out.println("Faild!!!");
					System.out.println("-----------------------------");

				}

				break;

			case "C":

				Product pb2 = new Product();
				System.out.println("-----------------------------");

				System.out.println("Enter Product Id:");
				System.out.println("-----------------------------");

				pb2.setProductID(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter New Product Name");
				System.out.println("-----------------------------");

				pb2.setProductName(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter New Product Price");
				System.out.println("-----------------------------");

				pb2.setProduct_price(sc.nextFloat());
				ProductManagementDAO scrud2 = new ProductManagementDAO();
				int rows2 = ProductManagementDAO.update(pb2);
				if (rows2 > 0) {
					System.out.println("-----------------------------");

					System.out.println("Product update successfully ");
					System.out.println("-----------------------------");

				} else {
					System.out.println("Faild!!!");

				}
				break;

			case "D":
				System.out.println("Enter the Product ID to be Deleted");
				Product pb3 = new Product();
				pb3.setProductID(sc.next());
				ProductManagementDAO scrud3 = new ProductManagementDAO();
				int rows3 = ProductManagementDAO.delete(pb3);
				if (rows3 > 0) {
					System.out.println("Product deleted successfully ");
				} else {
					System.out.println("-----------------------------");

					System.out.println("Product Not found!!!");
					System.out.println("-----------------------------");

				}
				break;
			case "E":
				System.out.println("-----------------------------");

				System.out.println("Enter the Product ID to be Searched");
				System.out.println("-----------------------------");

				Product pb4 = new Product();
				pb4.setProductID(sc.next());
				ProductManagementDAO scrud4 = new ProductManagementDAO();
				int rows4s = ProductManagementDAO.search(pb4);
				System.out.println("Product found!!!");
				break;
			case "F":
				System.out.println("*******************Thank You!!********************");
				System.exit(0);
				break;
			default:
				System.out.println(" Please enter valid Choice !!!!!!!! ");
			}

		}

	}
}


