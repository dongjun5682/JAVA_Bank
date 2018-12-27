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
			switch (JOptionPane.showInputDialog("[�޴�]\n" + "0.����\n" + "1.ȸ������\n" + "2.���°���")) {
			case "0":
				JOptionPane.showMessageDialog(null, "����Ǿ����ϴ�.");
				return;

			case "1":
				switch (JOptionPane.showInputDialog("0.�ڷΰ���\n" + "1.ȸ������\n" + "2.ȸ�����\n" + "3.���̵�ΰ˻�\n" + "4.�̸����ΰ˻�\n"
						+ "5.�α���\n" + "6.��й�ȣ ����\n" + "7.ȸ��Ż��\n")) {
				case "0":
					break;
				case "1":
					memberService.creatMember(JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
							JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."), JOptionPane.showInputDialog("�̸��� �Է��ϼ���."),
							JOptionPane.showInputDialog("�ֹι�ȣ�� �Է��ϼ���."));
					break;

				case "2":
					JOptionPane.showMessageDialog(null, memberService.findAll());
					break;

				case "3":
					member = memberService.findById(JOptionPane.showInputDialog("���̵� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, member);
					break;

				case "4":
					member = memberService.findById(JOptionPane.showInputDialog("�̸��� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, member);
					break;

				case "5":
					boolean login = memberService.existMember(JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
							JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, login ? "�α��εǾ����ϴ�." : "���̵� ��й�ȣ Ʋ�Ƚ��ϴ�.");
					break;

				case "6":
					memberService.updatePass(JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
							JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."),
							JOptionPane.showInputDialog("�����Ͻ� ��й�ȣ�� �Է��ϼ���."));
					break;
				case "7":
					memberService.deleteMember(JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
							JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."));
					break;

				}
				break;

			case "2":
				switch (JOptionPane.showInputDialog("0.�ڷΰ���\n" + "1.���°���\n" + "2.���¸��\n" + "3.���¹�ȣ�ΰ˻�\n" + "4.���� �α���\n"
						+ "5.�Ա�\n" + "6.���\n" + "7.���»���\n")) {
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
					account = accountSerivce.findByAccountNum(JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, account);
					break;
				case "4":
					boolean exist = accountSerivce.existAccountNum(JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, exist ? "����Ǿ����ϴ�." : "�߸��� ���¹�ȣ �Դϴ�.");
					break;
				case "5":
					msg = accountSerivce.depositMoney(JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���."),
							JOptionPane.showInputDialog("�Ա� �ݾ��� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, msg);
					break;
				case "6":
					msg = accountSerivce.withdrawalMoney(JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���."),
							JOptionPane.showInputDialog("��� �ݾ��� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, msg);
					break;
				case "7":
					account = accountSerivce.deleteAccountNum(JOptionPane.showInputDialog("���¹�ȣ�� �Է��ϼ���."));
					JOptionPane.showMessageDialog(null, account);
					break;
				}
				break;
			}
		}
	}
}
