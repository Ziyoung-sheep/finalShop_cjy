package menu_member;

import util.Util;

public class _MemberMain {
	
	public void init() {
		System.out.printf("======[ 회원 %s님 ]======\n");
		System.out.println("[1] 상품 구매");
		System.out.println("[2] 구매 내역");
		System.out.println("[3] 게시판");
		System.out.println("[4] 나의 정보");
		System.out.println("[5] 회원 탈퇴");
		System.out.println("[6] 로그아웃");
		System.out.println("[0] 종료");
		update();
	}
	
	private void update() {
		int sel=Util.getIntValue("메뉴입력", 0, 6);
	}

}
