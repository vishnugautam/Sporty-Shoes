package com.sportyshoes.basepackage.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sportyshoes.basepackage.model.ShoeData;

@Repository(value = "shoeRepository")
public class ShoeRepositoryImpl implements ShoeRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	class ShoeRowMapper implements RowMapper<ShoeData>{

		@Override
		public ShoeData mapRow(ResultSet rs, int rowNum) throws SQLException {
			ShoeData shoeData = new ShoeData();
			shoeData.setId(rs.getInt("id"));
			shoeData.setShoeName(rs.getString("shoeName"));
			shoeData.setDescription(rs.getString("description"));
			shoeData.setPrice(rs.getInt("price"));
			shoeData.setSize(rs.getString("size"));
			shoeData.setColor(rs.getString("color"));
			shoeData.setUserGroup(rs.getString("usergroup"));
			
			return shoeData;
		}
		
	}

	@Override
	public List<ShoeData> findAll() {
		String sql = "select * from todos";
		List<ShoeData> shoeList = jdbcTemplate.query(sql, new ShoeRowMapper());
		return shoeList;
	}
	

	@Override
	public ShoeData findById(int theId) {
		String sql = "select * from todos where id = ?";
		ShoeData shoeData = (ShoeData) jdbcTemplate.query(sql,  new ShoeRowMapper(), theId);
		return shoeData;
		
	}

	@Override
	public ShoeData findByShoeName(String shoeName) {
		String sql = "select * from todos where shoename = ?";
		ShoeData shoeData = (ShoeData) jdbcTemplate.query(sql, new ShoeRowMapper(), shoeName);
		return shoeData;
	}

	@Override
	public List<ShoeData> insertData() {
		String sql = "insert into todos (shoename,description,price,size,usergroup,color) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql);
		return null;
	}

	@Override
	public ShoeData deleteById(int theId) {
		ShoeData shoeData = findById(theId);
		String sql = "delete from todos where id = ?";
		jdbcTemplate.update(sql, theId);
		return shoeData;
	}



}
