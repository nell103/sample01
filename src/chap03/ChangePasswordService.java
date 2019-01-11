package chap03;

public class ChangePasswordService {
	
	private MemberDao memberDao;
	
	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	
	
	public ChangePasswordService() {}// default »ý¼ºÀÚ
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}   //appctx3.xml
	
	
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();
		
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}

}
