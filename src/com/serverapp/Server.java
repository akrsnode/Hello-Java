package com.serverapp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private Socket connectionSocket;

    public void start() {
        try(ServerSocket serverSocket = new ServerSocket(9991)) {
            System.out.println("Server is running...");
            connectionSocket = serverSocket.accept();
            InputStream inputToServer = connectionSocket.getInputStream();
            OutputStream outputFromServer = connectionSocket.getOutputStream();
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"), true);
            serverPrintOut.println("Client is connected to server");
            Scanner readInput = new Scanner(inputToServer);
            while (connectionSocket.isConnected()) {
                if (readInput.nextLine().equals("stop")) {

                }
            }

        } catch (IOException e) {
            System.out.println("Server: creating error");
        }
        System.out.println("Server stops...");
    }

    public void stop() {
        try {
            connectionSocket.close();
        } catch (IOException e) {
            System.out.println("Server: stop not working");
        }
    }
}
