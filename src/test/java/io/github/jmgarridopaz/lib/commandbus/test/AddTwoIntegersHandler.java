package io.github.jmgarridopaz.lib.commandbus.test;

import io.github.jmgarridopaz.lib.commandbus.CommandHandler;


public class AddTwoIntegersHandler implements CommandHandler<AddTwoIntegers> {

	@Override
	public void handle ( AddTwoIntegers command ) {
		int firstInteger = command.integer1();
		int secondInteger = command.integer2();
		int sum = firstInteger + secondInteger;
		System.out.println ( firstInteger + " + " + secondInteger + " = " + sum );
	}

}
