package org.phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Phone name is Iphone11");
	}

	public void phoneImeino() {
		System.out.println("Phone imei id is 123456789");
	}

	public void phoneCamera() {
		System.out.println("Phone camera is 18megapixel");
	}

	public void phoneStorage() {
		System.out.println("Phone storage is 128GB");
	}

	public void phoneOs() {
		System.out.println("Phone operating system is iOS");
	}

	public void phoneNo() {
		System.out.println("Phone no is ");
	}

	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneImeino();
		p.phoneCamera();
		p.phoneStorage();
		p.phoneOs();
		p.phoneNo();
	}
}
