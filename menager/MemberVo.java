package menager;

import java.util.Date;

public class MemberVo {
	private int num;
	private String memberId;
	private String memberPW;
	private String nickName;
	private Date regdate;

		
	public MemberVo() {}
	

	public MemberVo(int num, String memberId, String memberPW, String nickName, Date regdate) {
		super();
		this.num = num;
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.nickName = nickName;
		this.regdate = regdate;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPW() {
		return memberPW;
	}


	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "MemberVo [num=" + num + ", memberId=" + memberId + ", memberPW=" + memberPW + ", nickName=" + nickName
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	

}
