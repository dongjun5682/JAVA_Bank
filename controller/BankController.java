package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();
		AccountBean account = null;
		AccountService accountSerivce = new AccountServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("[메뉴]\n" + "0.종료\n" + "1.회원가입\n" + "2.계좌개설")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료되었습니다.");
				return;

			case "1":
				switch (JOptionPane.showInputDialog("0.뒤로가기\n" + "1.회원가입\n" + "2.회원목록\n" + "3.아이디로검색\n" + "4.이름으로검색\n"
						+ "5.로그인\n" + "6.비밀번호 변경\n" + "7.회원탈퇴\n")) {
				case "0":
					break;
				case "1":
					memberService.creatMember(JOptionPane.showInputDialog("아이디를 입력하세요."),
							JOptionPane.showInputDialog("비밀번호를 입력하세여."), JOptionPane.showInputDialog("이름을 입력하세요."),
							JOptionPane.showInputDialog("주민번호를 입력하세요."));
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
					boolean login = memberService.existMember(JOptionPane.showInputDialog("아이디를 입력하세요."),
							JOptionPane.showInputDialog("비밀번호를 입력하세요."));
					JOptionPane.showMessageDialog(null, login ? "로그인되었습니다." : "아이디 비밀번호 틀렸습니다.");
					break;

				case "6":
					memberService.updatePass(JOptionPane.showInputDialog("아이디를 입력하세요."),
							JOptionPane.showInputDialog("비밀번호를 입력하세요."),
							JOptionPane.showInputDialog("변경하실 비밀번호를 입력하세요."));
					break;
				case "7":
					memberService.deleteMember(JOptionPane.showInputDialog("아이디를 입력하세요."),
							JOptionPane.showInputDialog("비밀번호를 입력하세요."));
					break;

				}
				break;

			case "2":
				switch (JOptionPane.showInputDialog("0.뒤로가기\n" + "1.계좌개설\n" + "2.계좌목록\n" + "3.계좌번호로검색\n" + "4.계좌 로그인\n"
						+ "5.입금\n" + "6.출금\n" + "7.계좌삭제\n")) {
				case "0":
					break;
				case "1":
					String msg = accountSerivce.createAccount(0);
					JOptionPane.showMessageDialog(null, msg);
					break;
				case "2":
					JOptionPane.showMessageDialog(null, accountSerivce.findAll());
					break;
				case "3":
					account = accountSerivce.findByAccountNum(JOptionPane.showInputDialog("계좌번호를 입력하세요."));
					JOptionPane.showMessageDialog(null, account);
					break;
				case "4":
					boolean exist = accountSerivce.existAccountNum(JOptionPane.showInputDialog("계좌번호를 입력하세요."));
					JOptionPane.showMessageDialog(null, exist ? "연결되었습니다." : "잘못된 계좌번호 입니다.");
					break;
				case "5":
					msg = accountSerivce.depositMoney(JOptionPane.showInputDialog("계좌번호를 입력하세요."),
							JOptionPane.showInputDialog("입금 금액을 입력하세요."));
					JOptionPane.showMessageDialog(null, msg);
					break;
				case "6":
					msg = accountSerivce.withdrawalMoney(JOptionPane.showInputDialog("계좌번호를 입력하세요."),
							JOptionPane.showInputDialog("출금 금액을 입력하세요."));
					JOptionPane.showMessageDialog(null, msg);
					break;
				case "7":
					account = accountSerivce.deleteAccountNum(JOptionPane.showInputDialog("계좌번호를 입력하세요."));
					JOptionPane.showMessageDialog(null, account);
					break;
				}
				break;
			}
		}
	}
}
