package org.sameterayerdem.example;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface Service {
	public String convert(String value);
}