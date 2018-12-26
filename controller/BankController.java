package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start(){
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n"
					+ "0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원목록\n"
					+ "3.아이디로검색\n"
					+ "4.이름으로검색\n"
					+ "5.로그인\n"
					+ "6.비밀번호 변경\n"
					+ "7.회원탈퇴\n"
					)) {
					case "0":
						JOptionPane.showMessageDialog(null,"종료되었습니다.");
						return;
						
					case "1":
						memberService.creatMember(
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세여."),
								JOptionPane.showInputDialog("이름을 입력하세요."),
								JOptionPane.showInputDialog("주민번호를 입력하세요.")
								);
						break;
						
					case "2":
						JOptionPane.showMessageDialog(null, memberService.findAll());
						break;
						
					case "3":
						member = memberService.findById(JOptionPane.showInputDialog("아이디를 입력하세요."));
						JOptionPane.showMessageDialog(null, member);
						break;
						
					case "4":
						member = memberService.findById(JOptionPane.showInputDialog("이름를 입력하세요."));
						JOptionPane.showMessageDialog(null, member);
						break;
						
					case "5":
						boolean login = memberService.existMember(
								JOptionPane.showInputDialog("아이디를 입력하세요."),
								JOptionPane.showInputDialog("비밀번호를 입력하세요."));
						JOptionPane.showMessageDialog(null, login ? "로그인되었습니다." : "아이디 비밀번호 틀렸습니다." );
						break;

					case "6":

						break;

			}
		}
	}
}
	