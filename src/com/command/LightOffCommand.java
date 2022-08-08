package com.command;

/**
 * @Author rc
 * @Date 2022/8/8 22:27
 * @Version 1.0
 */

public class LightOffCommand implements Command {
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {

        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
