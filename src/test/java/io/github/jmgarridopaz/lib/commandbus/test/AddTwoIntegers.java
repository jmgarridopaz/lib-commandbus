package io.github.jmgarridopaz.lib.commandbus.test;

import io.github.jmgarridopaz.lib.commandbus.Command;


public class AddTwoIntegers implements Command {

	private final int integer1;
	private final int integer2;
	
	public AddTwoIntegers ( int anInteger, int otherInteger ) {
		this.integer1 = anInteger;
		this.integer2 = otherInteger;
	}
	
	public int integer1() {
		return this.integer1;
	}

	public int integer2() {
		return this.integer2;
	}

}
