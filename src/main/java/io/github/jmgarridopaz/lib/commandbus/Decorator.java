package io.github.jmgarridopaz.lib.commandbus;


public abstract class Decorator implements CommandBus {
	
	private CommandBus decoratedBus;
	
	protected Decorator ( CommandBus aCommandBus ) {
		this.decoratedBus = aCommandBus;
	}

	
	@Override
	public <C extends Command> void execute(C command) {
		this.decoratedBus.execute(command);
	}

}
