package com.example.splabdamianandrei.command;

import org.springframework.stereotype.Component;

@Component
public class SynchronousCommandExecutor implements CommandExecutor{
    @Override
    public <T> T executeCommand(Command<T> command) {
        return command.execute();
    }
}