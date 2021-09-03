package io.github.jmgarridopaz.lib.commandbus.test;

import io.github.jmgarridopaz.lib.commandbus.Command;


public class PrintString implements Command {

	private final String aString;
	
	public PrintString ( String otherString ) {
		this.aString = otherString;
	}
	
	public String aString() {
		return this.aString;
	}

}
