import java.sql.SQLException;
import java.util.List;

import com.estreller.webprj.dao.MemberDao;
import com.estreller.webprj.dao.mybatis.MybatisMemberDao;
import com.estreller.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//JdbcMemberDao dao = new JdbcMemberDao();
		
	/*	SqlSessionFactory ssf = EstrellerSqlSessionFactoryBuilder.getSqlSessionFactory();
		SqlSession session = ssf.openSession();*/
		
		//MemberDao dao = session.getMapper(MemberDao.class);
		
		/*
		 * update
		MemberDao dao = new MybatisMemberDao();
		
		Member mem = new Member();
		mem.setName("가가가");
		mem.setPwd("1234");
		mem.setMid("onion");
		
		
		dao.update(mem);
		
		
		*/
		
		
		//insert
		/*MemberDao dao = new MybatisMemberDao();
		Member imem = new Member();
		imem.setName("가가가");
		imem.setPwd("1234");
		imem.setMid("kikiki");
		
		
		dao.insert(imem);
		
		*/
		
		
		//delete
		MemberDao dao = new MybatisMemberDao();
		Member dmem = new Member();
				
		
		dao.delet("kikiki");
	
		List<Member> list = dao.getMembers(1,"MID","kikiki");
		
		System.out.println("검색결과 : " +list.size());
				
		for(Member m :list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
			
		}
		
		//session.close();

	}

}
