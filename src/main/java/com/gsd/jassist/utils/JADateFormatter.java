package com.gsd.jassist.utils;

import java.util.Date;

public class JADateFormatter {
    private String date;
    private String time;

    private Date dateObject = new Date();

    public JADateFormatter() {
        this.splitDate();
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    private void splitDate() {
        String[] splitDate = this.dateObject.toString().split(" ");

        this.date = splitDate[1] + " " + splitDate[2] + " " + splitDate[5];
        this.time = splitDate[3];
    }
}
