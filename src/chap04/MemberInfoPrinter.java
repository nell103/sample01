package chap04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
	@Autowired(required=false) // main4.jsva
	private MemberDao memDao;
	
	private MemberPrinter printer;
	
	
	public void setMemberDao (MemberDao memberDao) {
		this.memDao = memberDao;
	}
	
	
	//@Autowired
	//@Qualifier("sysout")
	@Resource(name="printer1")
	public void setPrinter (MemberPrinter printer) {
		System.out.println("print  "+printer);
		this.printer = printer;
	}
	
	
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}
