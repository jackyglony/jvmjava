/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lxyscls.jvmjava;

/**
 *
 * @author sk-xinyilong
 */
public class Main {
    public static void main(String[] args) {
        Cmd cmd = Cmd.parseCmd(args);
        if (cmd.versionFlag) {
            System.out.println("version 0.0.1");
        } else if (cmd.helpFlag || cmd.runClass == null) {
            Cmd.printUsage();
        } else {
            startJVM(cmd);
        }
    }
    
    static void startJVM(Cmd cmd) {
        System.out.printf("classpath:%s class:%s ", cmd.cpOption, cmd.runClass);
        System.out.printf("args:");
        for (String arg : cmd.runClassArgs) {
            System.out.printf(" %s ", arg);
        }
        System.out.printf("\n");
    }
}