/**
 * FibonacciService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.holtz.fibonacci;

public interface FibonacciService extends javax.xml.rpc.Service {
    public java.lang.String getFibonacciAddress();

    public org.holtz.fibonacci.Fibonacci getFibonacci() throws javax.xml.rpc.ServiceException;

    public org.holtz.fibonacci.Fibonacci getFibonacci(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
