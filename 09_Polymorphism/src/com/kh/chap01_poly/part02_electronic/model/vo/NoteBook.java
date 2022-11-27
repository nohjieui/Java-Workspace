package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic {

	private int usePort;

	public NoteBook() {
		super();
	}

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usePort = usbPort;
	}

	public int getUsePort() {
		return usePort;
	}

	public void setUsePort(int usePort) {
		this.usePort = usePort;
	}

	@Override
	public String toString() {
		return "NoteBook [usePort=" + usePort + ", toString()=" + super.toString() + "]";
	}

}
