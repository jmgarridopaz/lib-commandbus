package io.github.jmgarridopaz.lib.commandbus.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.github.jmgarridopaz.lib.commandbus.ByCommandNameHandlerLocator;
import io.github.jmgarridopaz.lib.commandbus.Command;
import io.github.jmgarridopaz.lib.commandbus.CommandBus;
import io.github.jmgarridopaz.lib.commandbus.CommandHandler;
import io.github.jmgarridopaz.lib.commandbus.CommandHandlerLocator;
import io.github.jmgarridopaz.lib.commandbus.SimpleCommandBus;


public class TestMain {
	
	@Test
	public void simpleBusWithByCommandNameHandlerLocator() {
		
		// Init command handlers
		Map<String,CommandHandler<?>> handlersByName = new HashMap<String,CommandHandler<?>>();
		handlersByName.put ( "PrintString", new PrintStringHandler() );
		handlersByName.put ( "AddTwoIntegers", new AddTwoIntegersHandler() );
		
		// Instantiate command bus
		CommandHandlerLocator byCommandNameHandlerLocator = new ByCommandNameHandlerLocator ( handlersByName );
		CommandBus commandBus = new SimpleCommandBus ( byCommandNameHandlerLocator );
		
		// Create commands
		Command printHello = new PrintString ( "Hello" );
		Command addTwoAndSix = new AddTwoIntegers ( 2, 6 );
		
		// Execute commands
		commandBus.execute ( printHello );
		commandBus.execute ( addTwoAndSix );
	}

}
