package by.lunix.designpatterns.delegate;

public class Delegate {

	public static void main(String[] argc) {
		BusDeport busDeport = new BusDeport();

		busDeport.setModel(new Maz103());
		busDeport.powerOn();
		busDeport.powerOff();

		busDeport.setModel(new Maz105());
		busDeport.powerOn();
		busDeport.powerOff();
	}

}

interface Bus {
	void powerOn();

	void powerOff();
}

class Maz103 implements Bus {
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Start engine Maz-103");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Stop engine Maz-103");
	}
}

class Maz105 implements Bus {
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Start engine Maz-105");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Stop engine Maz-105");
	}
}

class BusDeport {
	Bus bus;

	void setModel(Bus b) {
		bus = b;
	}

	void powerOn() {
		bus.powerOn();
	}

	void powerOff() {
		bus.powerOff();
	}
}