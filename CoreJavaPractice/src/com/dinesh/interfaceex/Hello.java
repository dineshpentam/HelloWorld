package com.dinesh.interfaceex;

import com.dinesh.interfaceex1.Iphonex;
import com.dinesh.interfaceex1.OnePlus5;
import com.dinesh.interfaceex1.Phone;

public class Hello 
{
public static void main(String[] args) {
	Phone phone = new OnePlus5();
	System.out.println(phone.Processor());
	Phone phon = new Iphonex();
	System.out.println(phon.SpaceInGB());
}
}
