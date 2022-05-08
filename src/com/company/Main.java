package com.company;

import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OperatingSystemFactory factory = new OperatingSystemFactory();
        OS obj = factory.getInstance("C");
        obj.spec();
    }

}
