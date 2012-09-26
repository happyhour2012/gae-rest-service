package ch.axa.hh.service;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class Resources {

	/**
	 * Da hat die Doku gefehlt.
	 * 
	 * @param injectionPoint
	 * @return
	 */
	@Produces
	public Logger produceLog(InjectionPoint injectionPoint) {
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass()
				.getName());
	}

}
