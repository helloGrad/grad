package com.grad.net.repository;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grad.net.vo.CodeVo;


@Repository
public class CodeDao {	
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CodeVo> getCodeList(){
		
		List<CodeVo> codeVo = sqlSession.selectList("code.selectCodeList");
		System.out.println("codeVo : "+codeVo);
		
		return codeVo;		

	}	

}
