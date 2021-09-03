package io.github.jmgarridopaz.lib.commandbus;

import java.util.Map;
import io.github.jmgarridopaz.lib.commandbus.Command;
import io.github.jmgarridopaz.lib.commandbus.CommandHandler;
import io.github.jmgarridopaz.lib.commandbus.CommandHandlerLocator;


public class ByCommandNameHandlerLocator implements CommandHandlerLocator {
	
	private final Map<String,CommandHandler<?>> handlersByCommandName;
		
	public ByCommandNameHandlerLocator ( Map<String,CommandHandler<?>> aHandlersMap ) {
		this.handlersByCommandName = aHandlersMap;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public <C extends Command, CH extends CommandHandler<C>> CH handlerForCommand ( C command ) {
		String commandName = command.getClass().getSimpleName();
		return (CH) this.handlersByCommandName.get(commandName); 
	}

}
