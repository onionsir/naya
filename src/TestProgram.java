import java.sql.SQLException;
import java.util.List;

import com.estreller.webprj.dao.MemberDao;
import com.estreller.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMembers(2);
		
		for(Member m :list)
		{
			System.out.printf("mid : %s, name : %s\n", m.getMid(), m.getName());
			
		}

	}

}
