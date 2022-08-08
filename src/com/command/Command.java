package com.command;

/**
 * @Author rc
 * @Date 2022/8/8 22:20
 * @Version 1.0
 */

public interface Command {
    public void execute();
    public void undo();
}
