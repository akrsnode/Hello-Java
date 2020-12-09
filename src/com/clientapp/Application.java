package com.clientapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String ipAddress = "";
        int serverPort = 9991;
        Socket socket;
        try {
            ipAddress = Inet4Address.getLocalHost().getHostAddress();
            socket = new Socket(ipAddress, serverPort);
            System.out.println("Connected to server " + serverPort);

            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();

            Scanner serverOutput = new Scanner(input, "UTF-8");
            System.out.println(serverOutput.nextLine());

            Scanner userInput = new Scanner(System.in);
            String stringCommand = userInput.nextLine();
            output.write(stringCommand.getBytes());

            System.out.println(stringCommand);


        } catch (IOException e) {
            System.out.println("Connection error");;
        }




    }
}
