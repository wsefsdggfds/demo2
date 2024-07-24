package com.example.demo.model;

public enum ApiResultCode {


    SUCCESS(200, null),
    ERROR(600, null),
    AUTHENTICATION_MISSING(401, "authentication header missing"),
    AUTHENTICATION_ERROR(400, "authentication failed"),
    AUTHENTICATION_FAILED(403, "microservice authentication failed"),
    AUTHORIZATION_FAILED(600, "permission deny"),
    VISIBLE_AUTHORIZATION_FAILED(601, "visible permission deny"),
    SERVER_ERROR(500, "server busy now, please try later"),
    NO_SUFFICIENT_AMOUNT(600, "No Sufficient Amount"),
    PARAMETER_ERROR(1001, "parameter invalid"),
    ACCESS_LIMIT_ERROR(50001, "access limit"),
    DATABASE_VALIDATION_ERROR(1002, "parameter integrity violation"),
    RECORD_EXISTED_ERROR(1003, "The same record already existed"),
    PICK_LIST_PARAMETER_ERROR(1004, "pickList parameter invalid"),
    USER_OKTA_PARAMETER_ERROR(1006, "We're unable to proceed with your request, it appears that you're currently logged in as another user"),
    FOLDER_UPLOAD_ERROR(1005, "folder upload faild"),
    EMAIL_NOT_FOUND_ERROR(1007, "No email found for either lead, contact, account"),
    SEND_EMAIL_ERROR(1008, "Send email failed"),
    CHECK_NUMBER_LESS_THEN_0(1009, "The number of Days should be greater than 0."),


    //Follow the definition of standard HTTP response status
    BAD_REQUEST(400, "Bad request"),
    UNAUTHORIZED(401, "Please log in first"),
    FORBIDDEN(403, "Sorry, you have no authority to access this"),
    NOT_FOUND(404, "No such resource"),
    INTERNAL_SERVER_ERROR(500, "Server error, please contact the administrator"),
    NOT_IMPLEMENTED(501, "Method not implemented"),
    AUTHENTICATION_TOKEN_ERROR(502, "token  cannot  find contact"),;


    private final Integer code;
    private final String errorMessage;

    ApiResultCode(Integer code, String message) {
        this.code = code;
        this.errorMessage = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
