package com.yedam;

class CellPhone {
	String model;
	String color;

	CellPhone() {

	}

	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڽ�" + message);

	}

	void receiveVoic(String message) {
		System.out.println("����:" + message);
	}

	void handUp() {
		System.out.println("���ϤǸ� �����ϴ�.");
	}
}

class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone() {

	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;

	}

	void turnOnDmb() {
		System.out.println("ä��: " + channel);

	}

	void changeChannelDmb(int Channel) {
		this.channel = channel;
		System.out.println("ä����" + channel + "������ �ٲߴϴ�.");

	}

	void turnOffdmb() {
		System.out.println("��");
	}

	@Override
	void handUp() {
		System.out.println("�����ϴ�.");
	}
	
}

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("SMT-300","RED",10);
		dcp.bell();
		System.out.println(dcp.channel);
		dcp.changeChannelDmb(20);
		System.out.println(dcp.channel);
		dcp.turnOnDmb();
		dcp.bell();
		dcp.turnOffdmb();
		
       
	}
}
