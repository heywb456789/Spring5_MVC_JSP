package com.minjae.web.service;

import java.sql.SQLException;
import java.util.List;

import com.minjae.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	// Scalar 
	int getCount() throws ClassNotFoundException, SQLException;

	int insert(Notice notice) throws SQLException, ClassNotFoundException;
	
	int update(Notice notice) throws SQLException, ClassNotFoundException;
	
	int delete(int id) throws ClassNotFoundException, SQLException ;

}
