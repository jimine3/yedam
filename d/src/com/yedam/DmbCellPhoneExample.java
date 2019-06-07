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
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoice(String message) {
		System.out.println("자신" + message);

	}

	void receiveVoic(String message) {
		System.out.println("상대방:" + message);
	}

	void handUp() {
		System.out.println("전하ㅗ를 끊습니다.");
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
		System.out.println("채널: " + channel);

	}

	void changeChannelDmb(int Channel) {
		this.channel = channel;
		System.out.println("채널을" + channel + "번으로 바꿉니다.");

	}

	void turnOffdmb() {
		System.out.println("끔");
	}

	@Override
	void handUp() {
		System.out.println("끊스니다.");
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
