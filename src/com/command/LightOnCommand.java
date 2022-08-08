package com.command;

/**
 * @Author rc
 * @Date 2022/8/8 22:22
 * @Version 1.0
 */

public class LightOnCommand implements Command {
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    private LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
