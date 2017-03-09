package by.lunix.designpatterns.factorymetod;

import javax.management.RuntimeErrorException;

public class FactoryMethod {

	public FactoryMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusMaker maker = getMakerByName("Mercedes");
		
		Bus bus = maker.createBus();
		bus.go();
	}
	
	public static BusMaker getMakerByName(String maker){
		if(maker.equals("MAZ"))
			return new MAZ();
		else if(maker.equals("Mercedes"))
			return new Mersedes();
		throw new RuntimeException("Нет производителя "+maker);
	}

}

interface Bus {
	void go();
}

class MAZ103 implements Bus {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Go MAZ-103!");
	}

}

class Mercedes105 implements Bus {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Go Mercedes!");
	}

}

interface BusMaker {
	Bus createBus();
}

class MAZ implements BusMaker {

	@Override
	public Bus createBus() {
		// TODO Auto-generated method stub
		return new MAZ103();
	}

}

class Mersedes implements BusMaker {

	@Override
	public Bus createBus() {
		// TODO Auto-generated method stub
		return new Mercedes105();
	}

}