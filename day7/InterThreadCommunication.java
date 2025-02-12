package com.celcom.day7;

class Data {
	private String resource;

	public String getMsg() {
		return resource;
	}

	public void setMsg(String resource) {
		this.resource = resource;
	}
}

class Writer implements Runnable {
	private final Data data;

	public Writer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		synchronized (data) {
			System.out.println("Writer is writing data...");
			data.setMsg("Hello from Writer");
			data.notify();
		}
	}
}

class Reader implements Runnable {
	private final Data data;

	public Reader(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		synchronized (data) {
			try {
				System.out.println("Reader is waiting to read data...");
				data.wait(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Reader read: " + data.getMsg());
		}
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		Data data = new Data();

		Reader reader = new Reader(data);
		Writer writer = new Writer(data);

		Thread readerThread = new Thread(reader);
		Thread writerThread = new Thread(writer);

		readerThread.start();
		writerThread.start();
	}
}
