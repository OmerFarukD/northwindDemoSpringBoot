package com.qubitfaruk.northwinddemo.core.utilities.results;

public class SuccessResult extends Result{
    public SuccessResult(Result result) {
        super(true);
    }
    public SuccessResult(String message){
        super(true, message);
    }
}
