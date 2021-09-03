package io.github.jmgarridopaz.lib.commandbus;


public interface CommandHandlerLocator {

	public < C extends Command, CH extends CommandHandler<C> > CH handlerForCommand ( C command );

}
