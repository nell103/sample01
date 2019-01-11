package chap05;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	
	private MemberDao memDao;
	
	private MemberPrinter printer;
	
	
	@Autowired
	public void setMemberDao (MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	
	@Autowired
	public void setPrinter (MemberPrinter printer) {
		this.printer = printer;
	}
	
	
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("������ ����\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}
