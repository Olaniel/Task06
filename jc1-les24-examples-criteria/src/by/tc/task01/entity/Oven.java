package by.tc.task01.entity;

public class Oven extends Appliance{// Дима, увы, это не иерерхия. Более того, эту ошибку мы разбирали на занятии. Получается твое наследование вот в таком виде бесполезно, производные классы друг от друга не отличаются
	// схалявил, так нельзя(
	
	// а про equals, hashCode и toString я вообще молчу(

	public Oven() {
	
	}

	public Oven(String parameters) {
		super(parameters);
	
	}
	
}
