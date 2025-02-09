package dao;

import java.util.ArrayList;
import menu_member._MemberMain;

public class MemberDAO {
	
	ArrayList<_MemberMain> list=new ArrayList<_MemberMain>();

	public static MemberDAO getInstance() {
		return null;
	}
/*
 1000/admin/admin/관리자
1001/test1/1111/테스트1
1002/test2/2222/테스트1
1003/test3/3333/테스트2
1004/test4/4444/테스트3
1005/test5/5555/테스트4
1006/test6/6666/테스트5
1007/test7/7777/테스트6
1008/test8/8888/테스트7
1009/test9/9999/테스트8
 */

	public Object isValidMember(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertMember(String id, String pw, String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
