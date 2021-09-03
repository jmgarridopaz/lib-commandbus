package io.github.jmgarridopaz.lib.commandbus.test;

import io.github.jmgarridopaz.lib.commandbus.CommandHandler;


public class PrintStringHandler implements CommandHandler<PrintString> {

	@Override
	public void handle ( PrintString command ) {
		System.out.println ( command.aString() );
	}

}
