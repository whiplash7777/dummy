package pong.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import pong.payloads.ApiResponse;

@RestController
@RequestMapping("/pong")
public class GlobalException {
    @Autowired
    public ApiResponse apiResponse;

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ApiResponse> badRequestExceptionHandler(HttpClientErrorException.BadRequest exception){
        String message = exception.getMessage().toString();
        ApiResponse apiResponse= new ApiResponse(message,false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.BAD_REQUEST);
    }


}
