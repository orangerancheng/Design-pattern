package com.command;

/**
 * @Author rc
 * @Date 2022/8/8 22:31
 * @Version 1.0
 */

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommands;

    public RemoteController() {
        onCommands = new Command[5];

        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            offCommands[i] = new NoCommand();
            onCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int on, Command onCommand, Command offCommand) {
        onCommands[on] = onCommand;
        offCommands[on] = offCommand;
    }

    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        undoCommands = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommands = offCommands[no];
    }

    public void ondoButtonWasPushed() {
        undoCommands.undo();
    }

}
