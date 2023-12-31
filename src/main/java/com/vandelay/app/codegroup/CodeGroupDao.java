package com.vandelay.app.codegroup;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CodeGroupDao {

	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.vandelay.app.codegroup.CodeGroupMapper";
	
	public List<CodeGroup> selectList(){return sqlSession.selectList(namespace +".selectList" ,"" );}
	

	
}
