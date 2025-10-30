package com.example.splabdamianandrei.command;

public interface CommandExecutor {
    <T> T executeCommand(Command<T> command);
}
