package com.qubitfaruk.northwinddemo.core.utilities.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResult<T> extends Result {
    private T data;

    public DataResult(T data,boolean success) {
        super(success);
        this.data=data;
    }

    public DataResult(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }
}
