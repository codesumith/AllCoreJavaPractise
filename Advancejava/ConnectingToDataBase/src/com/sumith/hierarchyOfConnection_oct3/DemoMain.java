package com.sumith.hierarchyOfConnection_oct3;

public class DemoMain {

	public static void main(String[] args) {
		
	ITest ob=Access.getRef();
	ob.m(123);
	ITest pq=Access.getRef();
	pq.m(456);
	

	}

}
