/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lxyscls.jvmjava.bytecode.base;

/**
 *
 * @author sk-xinyilong
 */
public abstract class BranchByteCode extends ByteCode {
    private int offset;
    
    @Override
    public void fetchOperands(ByteCodeReader reader) {
        offset = reader.readUint16();
    }
}
