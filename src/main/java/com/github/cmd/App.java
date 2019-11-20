package com.github.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.out.println( "Starting" );
        
        //linux command
        /*String cmd = "ls";
        Runtime run = Runtime.getRuntime();
        Process process = run.exec(cmd);
        process.waitFor();*/
        
        //cmd command
        String cmd = "dir";
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Program Files\" & " + cmd);
        Process process = builder.start();
       
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while((line = bufferedReader.readLine()) != null) {
        	System.out.println(line);
        }
        System.out.println( "Done" );
    }
}
