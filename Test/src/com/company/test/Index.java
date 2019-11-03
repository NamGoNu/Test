package com.company.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Index {
	static Scanner s = new Scanner(System.in);

	// 삽입
	public static ArrayList<Student> insertstudent(ArrayList<Student> list) {
		String name = null;
		int age = 0;
		String address = null;
		int no = 0;
		String major = null;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt();
		System.out.print("주소를 입력하세요 : ");
		address = s.next();
		System.out.print("학번을 입력하세요(1000보다 작아야합니다) : ");
		no = s.nextInt();
		System.out.print("전공을 입력하세요 : ");
		major = s.next();
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		s.setStudentNo(no);
		s.setMajor(major);
		list.add(s);
		System.out.println("저장완료");
		return list;
	}

	// 삽입
	public static ArrayList<Teacher> insertteacher(ArrayList<Teacher> list) {
		String name = null;
		int age = 0;
		String address = null;
		int no = 0;
		String subject = null;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt();
		System.out.print("주소를 입력하세요 : ");
		address = s.next();
		System.out.print("교번을 입력하세요(1000이상이어야 합니다) : ");
		no = s.nextInt();
		System.out.print("과목을 입력하세요 : ");
		subject = s.next();
		Teacher t = new Teacher();
		t.setName(name);
		t.setAge(age);
		t.setAddress(address);
		t.setTeacherNo(no);
		t.setSubject(subject);
		list.add(t);
		System.out.println("저장완료");
		return list;
	}

	// 사용자확인
	public static int isCheckStudent(ArrayList<Student> list, String name) {
		int index = -1;
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			if (s.getName().equals(name)) {
				index = list.indexOf(s);
				break;
			}
		}
		return index;
	}

	// 사용자확인
	public static int isCheckTeacher(ArrayList<Teacher> list, String name) {
		int index = -1;
		Iterator<Teacher> iter = list.iterator();
		while (iter.hasNext()) {
			Teacher t = iter.next();
			System.out.println(name);
			System.out.println(t.getName());
			if (t.getName().equals(name)) {
				index = list.indexOf(t);
				break;
			}
		}
		return index;
	}

	// 수정
	public static ArrayList<Student> updateStudent(ArrayList<Student> list) {
		String name = null;

		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckStudent(list, name);
		if (index >= 0) {
			int age = 0;
			String address = null;
			String cname = null;
			int no = 0;
			String major = null;
			System.out.print("변경하실 이름을 입력하세요 : ");
			cname = s.next();
			System.out.print("변경하실 나이를 입력하세요 : ");
			age = s.nextInt();
			System.out.print("변경하실 주소를 입력하세요 : ");
			address = s.next();
			System.out.print("변경하실 학번을 입력하세요 : ");
			no = s.nextInt();
			System.out.print("변경하실 전공을 입력하세요 : ");
			major = s.next();
			Student s = new Student();
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			s.setStudentNo(no);
			s.setMajor(major);
			list.set(index, s);
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패했습니다.");
		}
		return list;
	}

	// 수정
	public static ArrayList<Teacher> updateTeacher(ArrayList<Teacher> list) {
		String name = null;

		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckTeacher(list, name);
		if (index >= 0) {
			int age = 0;
			String address = null;
			String cname = null;
			int no = 0;
			String subject = null;
			System.out.print("변경하실 이름을 입력하세요 : ");
			cname = s.next();
			System.out.print("변경하실 나이를 입력하세요 : ");
			age = s.nextInt();
			System.out.print("변경하실 주소를 입력하세요 : ");
			address = s.next();
			System.out.print("변경하실 교번을 입력하세요 : ");
			no = s.nextInt();
			System.out.print("변경하실 과목을 입력하세요 : ");
			subject = s.next();
			Teacher t = new Teacher();
			t.setName(name);
			t.setAge(age);
			t.setAddress(address);
			t.setTeacherNo(no);
			t.setSubject(subject);
			list.set(index, t);
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패했습니다.");
		}
		return list;
	}

	// 삭제
	public static ArrayList<Student> deleteStudent(ArrayList<Student> list) {
		String name = null;

		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckStudent(list, name);
		if (index >= 0) {
			list.remove(index);
			System.out.println("삭제에 성공했습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
		return list;
	}

	// 삭제
	public static ArrayList<Teacher> deleteTeacher(ArrayList<Teacher> list) {
		String name = null;

		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckTeacher(list, name);
		if (index >= 0) {
			list.remove(index);
			System.out.println("삭제에 성공했습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
		return list;
	}

	// 조회
	public static void searchStudent(ArrayList<Student> list) {
		String name = null;

		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckStudent(list, name);
		if (index >= 0) {
			Student s = list.get(index);
			System.out.println("이름 : " + s.getName());
			System.out.println("나이 : " + s.getAge());
			System.out.println("주소 : " + s.getAddress());
			System.out.println("학번 : " + s.getStudentNo());
			System.out.println("전공 : " + s.getMajor());
			System.out.println("조회에 성공했습니다.");
		} else {
			System.out.println("조회에 실패했습니다.");
		}
	}

	// 조회
	public static void searchTeacher(ArrayList<Teacher> list) {
		String name = null;
		int index = -1;
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		index = isCheckTeacher(list, name);
		if (index >= 0) {
			Teacher t = list.get(index);
			System.out.println("이름 : " + t.getName());
			System.out.println("나이 : " + t.getAge());
			System.out.println("주소 : " + t.getAddress());
			System.out.println("교번 : " + t.getTeacherNo());
			System.out.println("과목 : " + t.getSubject());
			System.out.println("조회에 성공했습니다.");
		} else {
			System.out.println("조회에 실패했습니다.");
		}
	}

	public static void main(String[] args) {
		int c = 0;
		boolean loop = true;
		int ts = 0;
		ArrayList<Student> studentlist = new ArrayList<Student>();
		ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
		while (loop) {
			System.out.print("1: 저장 2: 수정 3: 삭제 4: 조회 5: 종료");
			c = s.nextInt();

			switch (c) {
			case 1:
				System.out.println("저장기능");
				System.out.print("1. 학생 2. 교사");
				ts = s.nextInt();
				if (ts == 1) {
					studentlist = insertstudent(studentlist);
				} else if (ts == 2) {
					teacherlist = insertteacher(teacherlist);
				} else {
					System.out.println("다시 선택하세요");
				}
				break;
			case 2:
				System.out.println("수정기능");
				System.out.print("1. 학생 2. 교사");
				ts = s.nextInt();
				if (ts == 1) {
					studentlist = updateStudent(studentlist);
				} else if (ts == 2) {
					teacherlist = updateTeacher(teacherlist);
				} else {
					System.out.println("다시 선택하세요");
				}
				break;
			case 3:
				System.out.println("삭제기능");
				System.out.print("1. 학생 2. 교사");
				ts = s.nextInt();
				if (ts == 1) {
					studentlist = deleteStudent(studentlist);
				} else if (ts == 2) {
					teacherlist = deleteTeacher(teacherlist);
				} else {
					System.out.println("다시 선택하세요");
				}
				break;
			case 4:
				System.out.println("조회기능");
				System.out.print("1. 학생 2. 교사");
				ts = s.nextInt();
				if (ts == 1) {
					searchStudent(studentlist);
				} else if (ts == 2) {
					searchTeacher(teacherlist);
				} else {
					System.out.println("다시 선택하세요");
				}
				break;
			default:
				loop = false;
				break;
			}
		}
		s.close();
	}

}
