package com.sumith.labwork_sep25;

class Test20 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("Cat");
			}
		};
	//	r.run();
		Thread t = new Thread(r) {
			
			public void run() {
				System.out.print("Dog");
			}
		};
		t.start();

	}
}