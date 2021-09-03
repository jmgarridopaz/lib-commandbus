package io.github.jmgarridopaz.lib.commandbus;


public interface CommandBus {
	
	public < C extends Command > void execute ( C command );

}
