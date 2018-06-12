package de.bm.eva.evaportal.controller.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import de.bm.eva.evaportal.exceptions.LoginException;
import de.bm.eva.evaportal.model.ServiceResponse;

/**
 * @author Marcel Vieren
 */
/* Klasse zum Abfangen von Exceptions */
@ControllerAdvice
public class ValidationHandler {
	
	/* Intialisiert einen Logger zum Ausgeben von für die Entwicklung relevante Informationen */
	private static final Logger logger = LoggerFactory.getLogger(ValidationHandler.class);
	
	@ExceptionHandler(RuntimeException.class)
	public @ResponseBody ResponseEntity<ServiceResponse> handleBadRequest(HttpServletRequest req, RuntimeException ex) {
		logger.error("AbstractServiceException: ", ex);
		HttpStatus status = HttpStatus.NOT_FOUND; // 404
		if (ex instanceof LoginException) {
			status = HttpStatus.BAD_REQUEST; // 400

		} else if (ex instanceof MethodArgumentTypeMismatchException) {
			return new ResponseEntity<>(new ServiceResponse("Parameter fehlerhaft."), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ServiceResponse(ex.getMessage()), status);
	}

	@ExceptionHandler(Exception.class)
	public @ResponseBody ResponseEntity<Void> handleAllException(HttpServletRequest req, Exception ex) {
		logger.error("Exception: ", ex);
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}