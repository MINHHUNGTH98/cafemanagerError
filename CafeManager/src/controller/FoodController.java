package controller;

import java.awt.List;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Models.Connect;
import Models.Food;
import Models.FoodCategory;

public class FoodController {
	public static ArrayList<Food> getListFoodByIdCategory(int idCategory) throws SQLException, IOException {
		ArrayList<Food> arrayList = new ArrayList<Food>();
		Statement statement = Connect.getConnection().createStatement();
		String sql = "select * from Food where idCategory = " + idCategory;
		System.out.println(sql);
		ResultSet resultSet = statement.executeQuery(sql);
		try {
			while (resultSet.next()) {
				int idFood = resultSet.getInt(1);
				String foodName = resultSet.getString(2);
				int price = resultSet.getInt(4);
				Food food = new Food(idFood, foodName, idCategory, price);
				arrayList.add(food);
			};
		} finally {
			Connect.close();
		}
		return arrayList;		
	}
}
