package controller;

import java.util.HashMap;
import java.util.Map;
import _mall.MenuCommand;
import dao.FileDAO;


public class MallController {
	private MallController() {}


	static private MallController instance = new MallController();

	static public MallController getInstance() {
		return instance;
	}
	

	private String loginId;
	private String next;
	private MenuCommand menuCom;
	public Map<String, MenuCommand> mapCont;

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void init() {
		FileDAO.getInstance().loadAllFiles();
		mapCont = new HashMap<>();
		//가장 첫 메뉴
		mapCont.put("MallMain", new _MallMain());
		//회원 가입
		mapCont.put("MallJoin", new MallJoin());
		//회원 로그인
		mapCont.put("MallLogin", new MallLogin());
		//관리자 메인메뉴
		mapCont.put("AdminMain", new _AdminMain());
		//관리자의 회원 관리
		mapCont.put("AdminMember", new AdminMember());
		//관리자 아이템 관리
		mapCont.put("AdminItem", new AdminItem());
		//관리자 게시판 관리
		mapCont.put("AdminBoard", new AdminBoard());
		//멤버 메인메뉴
		mapCont.put("MemberMain", new _MemberMain());
		//멤버 게시물 관리
		mapCont.put("MemberBoard", new MemberBoard());
		//멤버 카트 관리
		mapCont.put("MemberCart", new MemberCart());
		//멤버 정보 보기
		mapCont.put("MemberInfo", new MemberInfo());
		//멤버 쇼핑하기
		mapCont.put("MemberShopping", new MemberShopping());
		//회원 탈퇴
		mapCont.put("MemberQuit", new MemberQuit());

		menuCom = mapCont.get("MallMain");
		menuCom.init();
		update();

	}

	public void update() {
		while (true) {
			if (!menuCom.update()) {
				if (next != null) {
					menuCom = mapCont.get(next);
					menuCom.init();
				} else {
					return;
				}
			}
		}
	}

}
