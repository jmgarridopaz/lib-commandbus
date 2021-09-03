package io.github.jmgarridopaz.lib.commandbus;


public class SimpleCommandBus implements CommandBus {
			
	private final CommandHandlerLocator commandHandlerLocator;

		
	public SimpleCommandBus	( CommandHandlerLocator aCommandHandlerLocator ) {
		this.commandHandlerLocator = aCommandHandlerLocator;
	}


	@Override
	public <C extends Command> void execute(C command) {
		CommandHandler<C> commandHandler = this.commandHandlerLocator.handlerForCommand(command);
		commandHandler.handle(command);
	}

}
