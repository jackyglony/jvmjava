/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lxyscls.jvmjava.classpath;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipFile;

/**
 *
 * @author sk-xinyilong
 */
class ZipEntry extends Entry {
    private final String absPath;
    
    ZipEntry(String path) {
        absPath = new File(path).getAbsolutePath();
    }
    
    @Override
    public byte[] readClass(String className) throws IOException {
        byte[] ret = null;
        ZipFile zf = new ZipFile(absPath);
        for (Enumeration<? extends java.util.zip.ZipEntry> ez = zf.entries(); ez.hasMoreElements();) {
            java.util.zip.ZipEntry ze = ez.nextElement();
            if (className.equals(ze.toString())) {
                ret = new byte[(int)ze.getSize()];
                
                InputStream is = zf.getInputStream(ze);
                int len = ret.length;
                int offset = 0;
                while (offset < len) {
                    offset += is.read(ret, offset, len-offset);  
                }
                return ret;
            }
        }

        return ret;
    }
    
    @Override
    public String toString() {
        return absPath;
    }    
}
