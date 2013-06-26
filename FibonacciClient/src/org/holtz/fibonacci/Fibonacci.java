/**
 * Fibonacci.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.holtz.fibonacci;

public interface Fibonacci extends java.rmi.Remote {
    public java.lang.String getSequence(int count) throws java.rmi.RemoteException;
    public java.lang.String bigFib(long n1) throws java.rmi.RemoteException;
    public java.lang.String fib(int n) throws java.rmi.RemoteException;
    public java.lang.String getBigSequence(long count) throws java.rmi.RemoteException;
}
