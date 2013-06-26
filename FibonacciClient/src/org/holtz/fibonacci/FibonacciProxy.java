package org.holtz.fibonacci;

public class FibonacciProxy implements org.holtz.fibonacci.Fibonacci {
  private String _endpoint = null;
  private org.holtz.fibonacci.Fibonacci fibonacci = null;
  
  public FibonacciProxy() {
    _initFibonacciProxy();
  }
  
  public FibonacciProxy(String endpoint) {
    _endpoint = endpoint;
    _initFibonacciProxy();
  }
  
  private void _initFibonacciProxy() {
    try {
      fibonacci = (new org.holtz.fibonacci.FibonacciServiceLocator()).getFibonacci();
      if (fibonacci != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fibonacci)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fibonacci)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fibonacci != null)
      ((javax.xml.rpc.Stub)fibonacci)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.holtz.fibonacci.Fibonacci getFibonacci() {
    if (fibonacci == null)
      _initFibonacciProxy();
    return fibonacci;
  }
  
  public java.lang.String getSequence(int count) throws java.rmi.RemoteException{
    if (fibonacci == null)
      _initFibonacciProxy();
    return fibonacci.getSequence(count);
  }
  
  public java.lang.String bigFib(long n1) throws java.rmi.RemoteException{
    if (fibonacci == null)
      _initFibonacciProxy();
    return fibonacci.bigFib(n1);
  }
  
  public java.lang.String fib(int n) throws java.rmi.RemoteException{
    if (fibonacci == null)
      _initFibonacciProxy();
    return fibonacci.fib(n);
  }
  
  public java.lang.String getBigSequence(long count) throws java.rmi.RemoteException{
    if (fibonacci == null)
      _initFibonacciProxy();
    return fibonacci.getBigSequence(count);
  }
  
  
}