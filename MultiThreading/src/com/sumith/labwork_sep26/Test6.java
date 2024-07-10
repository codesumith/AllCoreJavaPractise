package com.sumith.labwork_sep26;
public class Test6 extends Thread {
private static int x;

public synchronized void doThings() {
int current = x;
current++;
x = current;
}

public void run() {
doThings();
}
}