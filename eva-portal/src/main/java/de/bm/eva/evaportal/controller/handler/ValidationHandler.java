//package de.bm.eva.evaportal.controller.handler;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.hibernate.service.spi.ServiceException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.ServletRequestBindingException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
//
//@ControllerAdvice
//public class ValidationHandler {
//    private static final Logger logger = LoggerFactory.getLogger(ValidationHandler.class);
//    @ExceptionHandler(RuntimeException.class)
//    public @ResponseBody ResponseEntity<ServiceResponse> handleBadRequest(HttpServletRequest req, RuntimeException ex) {
//        logger.error("AbstractServiceException: ", ex);
//        HttpStatus status = HttpStatus.NOT_FOUND; // 404
//        // MAPPE HTTPStatus
//        if (ex instanceof VersicherungsDauerException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof AlterException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof BeitragsException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof ZielgruppenException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof ParameterException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof ServiceException) {
//            status = HttpStatus.BAD_REQUEST; // 400
//        } else if (ex instanceof NoTarifException) {
//            status = HttpStatus.BAD_REQUEST; // 204
//        } else if (ex instanceof MethodArgumentTypeMismatchException) {
//            return new ResponseEntity<>(new ServiceResponse("Parameter fehlerhaft."), HttpStatus.BAD_REQUEST);
//        }
//        return new ResponseEntity<>(new ServiceResponse(ex.getMessage()), status);
//    }
//    @ExceptionHandler(ServletRequestBindingException.class)
//    public @ResponseBody ResponseEntity<Void> handleBadSession(HttpServletRequest req,
//            ServletRequestBindingException ex) {
//        logger.error("ServletRequestBindingException: ", ex);
//        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
//    @ExceptionHandler(Exception.class)
//    public @ResponseBody ResponseEntity<Void> handleAllException(HttpServletRequest req, Exception ex) {
//        logger.error("Exception: ", ex);
//        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}