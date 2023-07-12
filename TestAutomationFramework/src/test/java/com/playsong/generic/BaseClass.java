package com.playsong.generic;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	@Test
	public void playSong() {
		WebDriverManager.chromedriver().setup();
	}

}
