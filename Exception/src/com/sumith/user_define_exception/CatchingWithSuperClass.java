package com.sumith.user_define_exception;

import java.io.IOException;

public class CatchingWithSuperClass {

	public static void main(String[] args) {
		
try
{
	throw new IOException();
}
catch(Exception e)
{
	e.printStackTrace();
}

	}

}
