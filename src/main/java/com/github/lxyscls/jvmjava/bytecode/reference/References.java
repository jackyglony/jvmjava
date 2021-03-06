/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lxyscls.jvmjava.bytecode.reference;

import com.github.lxyscls.jvmjava.bytecode.base.ByteCode;

/**
 *
 * @author sk-xinyilong
 */
public class References {
    static ArrayLength ARRLEN = new ArrayLength();
    static Athrow ATHROW = new Athrow();
    static MonitorEnter MEN = new MonitorEnter();
    static MonitorExit MEX = new MonitorExit();
    
    public static ByteCode newReference(short opCode) {
        switch (opCode) {
            case 0xb2: return new GetStatic();
            case 0xb3: return new PutStatic();
            case 0xb4: return new GetField();
            case 0xb5: return new PutField();
            case 0xb6: return new InvokeVirtual();
            case 0xb7: return new InvokeSpecial();
            case 0xb8: return new InvokeStatic();
            case 0xb9: return new InvokeInterface();
            case 0xbb: return new New();
            case 0xbc: return new NewArray();
            case 0xbd: return new ANewArray();
            case 0xbe: return ARRLEN;
            case 0xbf: return ATHROW;
            case 0xc0: return new Checkcast();
            case 0xc1: return new Instanceof();
            case 0xc2: return MEN;
            case 0xc3: return MEX;
        }
        return null;
    }
}
