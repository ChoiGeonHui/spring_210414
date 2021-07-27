package com.example.quiz05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.quiz05.model.Member;

@Controller
public class FnController {
	
	@RequestMapping("/lesson05/quizMember")
	public String members(Model model) {
		
		List<Member> members = new ArrayList<>();

		Member member = new Member();
		member.setName("����");
		member.setPhoneNumber("010-1234-5678");
		member.setEmail("youbee@gmail.com");
		member.setNationality("�ﱹ�ô� ����");
		member.setIntroduce("���� ���� ���� �����Դϴ�. �ﱹ������ ���� ������ ���ϰڽ��ϴ�.");
		members.add(member);

		member = new Member();
		member.setName("����");
		member.setPhoneNumber("010-1234-5678");
		member.setEmail("woo@naver.com");
		member.setNationality("�ﱹ�ô� ����");
		member.setIntroduce("���쿡��. ���� �������� ���� ���̴� ������ �ϴ� �ƿ��Դϴ�.");
		members.add(member);

		member = new Member();
		member.setName("���");
		member.setPhoneNumber("02-111-3333");
		member.setNationality("�ﱹ�ô� ����");
		member.setEmail("tools@gmail.com");
		member.setIntroduce("�����");
		members.add(member);

		member = new Member();
		member.setName("����");
		member.setPhoneNumber("010-0987-4321");
		member.setNationality("�ﱹ�ô� ��");
		member.setEmail("jojo@gmail.com");
		member.setIntroduce("�̸��� ���� �ڴ� �ʹ��̶� �Ͽ�");
		members.add(member);

		member = new Member();
		member.setName("����");
		member.setPhoneNumber("010-0000-1111");
		member.setNationality("�ﱹ�ô� ��");
		member.setEmail("jooyou@kakao.com");
		member.setIntroduce("������ �����ҿ��� ����");
		members.add(member);

		member = new Member();
		member.setName("Ȳ��");
		member.setPhoneNumber("031-432-0000");
		member.setNationality("�ﱹ�ô� ����");
		member.setEmail("yellowbug@naver.com");
		member.setIntroduce("�� ���� �� ���ִ� ��");
		members.add(member);
		
		model.addAttribute("members", members);
		
		return"lesson05/quizmember";
	}

}