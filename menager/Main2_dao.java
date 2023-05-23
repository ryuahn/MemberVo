package menager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2_dao {

	public static void main(String[] args) {
		
//		public MemberVo(int num, String memberId, String memberPW, String nickName, Date regdate) {
		
		MemberDao memberDao = new MemberDao();
		
		Map<Integer, MemberVo> db = new HashMap<>();
		
		MemberVo vo1 = new MemberVo(1,"test1","1234","nick1", new Date() );
		MemberVo vo2 = new MemberVo(2,"test2","1234","nick2", new Date() );
		MemberVo vo3 = new MemberVo(3,"test3","1234","nick3", new Date());
		
		//C 
		memberDao.insertMember(vo1);
		memberDao.insertMember(vo2);
		memberDao.insertMember(vo3);
		System.out.println("저장완료!");
		
		memberDao.selectMemberAll();
		
		//R
		List<MemberVo> ls = memberDao.selectMemberAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전제조회 완료!");
		
		//하나의 데이터만 조회
		MemberVo vo = null;
		vo = memberDao.selectMember(1);
		System.out.println(vo);
		System.out.println("조회 완료!");
		
		
		//U(Update)
		vo = memberDao.selectMember(1);
		System.out.println(vo);
		
		if(vo != null) {
			vo.setMemberPW("4321");
			vo.setNickName("1nick");
			memberDao.updateMember(vo);
		}
		
		vo = memberDao.selectMember(1);
		System.out.println(vo);
		System.out.println("수정완료!");
		
		//D(delecte)
		
		memberDao.deleteMember(2);
		
		ls = memberDao.selectMemberAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전제조회 완료!");
		
		//전체삭제
		memberDao.deletecleanAll();
		
		ls = memberDao.selectMemberAll();
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전제조회 완료!");
		
		
		
		
		
		
		
		
		
		
	}

}
