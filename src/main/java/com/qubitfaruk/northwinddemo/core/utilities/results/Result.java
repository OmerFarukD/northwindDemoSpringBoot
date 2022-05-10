package com.qubitfaruk.northwinddemo.core.utilities.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    public Result(boolean success){
        this.success=success;
    }
    public Result(boolean success,String message) {
        this(success);
        this.message=message;
    }
    private String message;
    private boolean success;
}
