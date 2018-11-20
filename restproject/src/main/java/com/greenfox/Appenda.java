package com.greenfox;

public class Appenda {
    String received;
    String appended;

    public Appenda(String received) {
        this.received = received;
        this.appended = received + "a";
    }

    public Appenda() {
    }


    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
