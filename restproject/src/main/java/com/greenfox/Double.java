package com.greenfox;

public class Double {

    int recived;
    int result;

    public Double(int recived) {
        this.recived = recived;
        this.result = recived * 2;
    }

    public Double() {
    }

    public int getRecived() {
        return recived;
    }

    public void setRecived(int recived) {
        this.recived = recived;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
