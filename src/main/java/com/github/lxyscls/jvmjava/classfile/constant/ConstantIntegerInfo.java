/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lxyscls.jvmjava.classfile.constant;

import com.github.lxyscls.jvmjava.classfile.ClassReader;

/**
 *
 * @author sk-xinyilong
 */
public class ConstantIntegerInfo extends ConstantInfo {
    private final int val;
    
    ConstantIntegerInfo(ClassReader reader) {
        val = (int)reader.readUint32();        
    }
    
    public Integer getValue() {
        return val;
    }
}
