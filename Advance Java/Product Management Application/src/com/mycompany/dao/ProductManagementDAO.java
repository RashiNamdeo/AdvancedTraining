package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mycompany.dbutil.DBUtil;
import com.mycompany.domain.Product;

public class ProductManagementDAO {
	
	

	public static int viewall(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " Select * from Product";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {

			// pw.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println("\n Product Id: "+rs.getString(1) + "\n Product Name: " + rs.getString(2) + "\n Product Price: " + rs.getDouble(3));			count++;
		}
		return count;
	}

	public static int insert(Product pb) throws ClassNotFoundException, SQLException {
		String sql = "insert into Product values(?,?,?)";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pb.getProductID());
		ps.setString(2, pb.getProductName());
		ps.setFloat(3, pb.getProduct_price());
		return ps.executeUpdate();

	}

	public static int update(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " Update Product set  ProductName =? , Product_Price = ?  where ProductID = ?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pb.getProductName());
		ps.setFloat(2, pb.getProduct_price());
		ps.setString(3, pb.getProductID());
		return ps.executeUpdate();
	}

	public static int delete(Product pb) throws SQLException, ClassNotFoundException {
		String sql = "delete from Product where ProductID =?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pb.getProductID());
		return ps.executeUpdate();

	}

	public static int search(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " select * from Product where ProductID =?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pb.getProductID());
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			System.out.println("\n Product Id: "+rs.getString(1) + "\n Product Name: " + rs.getString(2) + "\n Product Price: " + rs.getDouble(3));
			count++;
		}
		return count;

	}
}

	