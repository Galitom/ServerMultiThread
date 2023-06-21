package org.example;

public class App
{
    public static void main( String[] args ) {
        MultiEchoServer echoServer = new MultiEchoServer(1234);
        echoServer.startServer();
    }
}
