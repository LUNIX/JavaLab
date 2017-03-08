package by.lunix.designpatterns.facade;

public class Facade {

	public Facade() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer();
		comp.copy();
	}

}

class Computer {
	Power power = new Power();
	DVDRW dvd = new DVDRW();
	HDD hdd = new HDD();

	void copy() {
		power.on();
		//dvd.load();
		hdd.copyFromDVD(dvd);
	}
}

class Power {
	void on() {
		System.out.println("Power on");
	}

	void off() {
		System.out.println("Power off");
	}
}

class DVDRW {
	private boolean data = false;

	public boolean hasData() {
		return data;
	}

	void load() {
		data = true;
	}

	void unload() {
		data = false;
	}
}

class HDD {
	void copyFromDVD(DVDRW dvd) {
		if (dvd.hasData()) {
			System.out.println("Copy data...");
		} else {
			System.out.println("Insert disk with data.");
		}
	}
}