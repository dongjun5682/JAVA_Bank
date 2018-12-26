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
			switch (JOptionPane.showInputDialog("[�޴�]\n"
					+ "0.����\n"
					+ "1.ȸ������\n"
					+ "2.ȸ�����\n"
					+ "3.���̵�ΰ˻�\n"
					+ "4.�̸����ΰ˻�\n"
					+ "5.�α���\n"
					+ "6.��й�ȣ ����\n"
					+ "7.ȸ��Ż��\n"
					)) {
					case "0":
						JOptionPane.showMessageDialog(null,"����Ǿ����ϴ�.");
						return;
						
					case "1":
						memberService.creatMember(
								JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
								JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."),
								JOptionPane.showInputDialog("�̸��� �Է��ϼ���."),
								JOptionPane.showInputDialog("�ֹι�ȣ�� �Է��ϼ���.")
								);
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
						boolean login = memberService.existMember(
								JOptionPane.showInputDialog("���̵� �Է��ϼ���."),
								JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���."));
						JOptionPane.showMessageDialog(null, login ? "�α��εǾ����ϴ�." : "���̵� ��й�ȣ Ʋ�Ƚ��ϴ�." );
						break;

					case "6":

						break;

			}
		}
	}
}
	