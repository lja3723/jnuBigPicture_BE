package kr.ac.jnu.capstone.bigpicture.dongsim._common.api;

import kr.ac.jnu.capstone.bigpicture.dongsim._common.api.body.ApiResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {

    public static <T> ResponseEntity<ApiResponseBody<T>> ok(T data) {
        return ResponseEntity.ok(ApiResponseBody.<T>builder()
            .status("success")
            .data(data)
            .build());
    }

    public static <T> ResponseEntity<ApiResponseBody<T>> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(ApiResponseBody.<T>builder()
                .status("success")
                .data(data)
                .build());
    }

    public static ResponseEntity<ApiResponseBody<Void>> noContent() {
        return ResponseEntity.noContent().build();
    }

    public static <T> ResponseEntity<ApiResponseBody<T>> okWithHeaders(T data, HttpHeaders headers) {
        return ResponseEntity.status(HttpStatus.OK)
            .headers(headers)
            .body(ApiResponseBody.<T>builder()
                .status("success")
                .data(data)
                .build());
    }
}
