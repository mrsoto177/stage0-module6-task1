package com.epam.mjc.stage0;

public class Dog extends Animal {
	public Dog() {
        super("brown", 4, true);
    }
	
	@Override
    public String getDescription() {
        return super.getDescription() + "This animal is mostly brown. It has 4 paws and a fur.";
    }
}
