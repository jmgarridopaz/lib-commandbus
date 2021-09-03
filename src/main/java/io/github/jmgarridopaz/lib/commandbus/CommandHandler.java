package io.github.jmgarridopaz.lib.commandbus;


public interface CommandHandler < C extends Command > {
	
	public void handle ( C command );

}
