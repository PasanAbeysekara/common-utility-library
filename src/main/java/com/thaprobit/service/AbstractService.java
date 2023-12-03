package com.thaprobit.service;

import com.thaprobit.global.SystemOperation;
import com.thaprobit.util.Error;
import com.thaprobit.util.ErrorUtility;
import com.thaprobit.util.ResponseWrapper;
import com.thaprobit.util.SystemMessages;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Tharinda Wickramaarachchi
 */
public abstract class AbstractService<DAO> //TODO change name
{
    protected HttpHeaders addCommonHeaders(HttpHeaders responseHeaders) {
        //responseHeaders.add( "Access-Control-Allow-Origin", "*" );

        return responseHeaders;
    }

    protected ResponseEntity<DAO> buildNotFoundResponse() {
        return ResponseEntity.notFound().headers(new HttpHeaders()).build();
    }

    protected ResponseEntity<ResponseWrapper<DAO>> buildNotFoundResponseWrapped() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .headers(new HttpHeaders())
                .body(new ResponseWrapper<>(SystemOperation.READ.withError(), SystemMessages.NOT_FOUND, ""));
    }

    protected ResponseEntity<ResponseWrapper<DAO>> buildExceptionErrorResponse(SystemOperation operation, SystemMessages message, Exception e) {
        Error error = ErrorUtility.exceptionErrorMapper(message, e, false);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .headers(new HttpHeaders())
                .body(new ResponseWrapper<>(operation.withError(), message, error));
    }

}
