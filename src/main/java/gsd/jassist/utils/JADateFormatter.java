package gsd.jassist.utils;

import java.util.Date;

/**
 * @author BigTallahasee
 */
public class JADateFormatter {
    private String date;
    private String time;
    private String formattedDate = "";

    private Date dateObject = new Date();

    /**
     *
     */
    public JADateFormatter() {
        this.splitDate();
    }

    /**
     *
     * @return returns the Date from the Date Class (Ex. May 29, 2024) **without the comma
     */
    public String getDate() {
        return this.date;
    }

    /**
     *
     * @return returns the hours minutes and seconds (Ex. 12:00:00)
     */
    public String getTime() {
        return this.time;
    }

    private void splitDate() {
        String[] splitDate = this.dateObject.toString().split(" ");

        this.date = splitDate[1] + " " + splitDate[2] + " " + splitDate[5];
        this.time = splitDate[3];
    }

    /**
     *
     * @return Returns a formatted date for the JALogger (Ex. 5-29-2024)
     */
    public String fileFormatDate() {
        String[] fileFormatDate = this.date.split(" ");

        switch(fileFormatDate[0]) {
            case "January":
                this.formattedDate = "01-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "February":
                this.formattedDate = "02-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "March":
                this.formattedDate = "03-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "April":
                this.formattedDate = "04-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "May":
                this.formattedDate = "05-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "June":
                this.formattedDate = "06-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "July":
                this.formattedDate = "07-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "August":
                this.formattedDate = "08-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "September":
                this.formattedDate = "09-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "October":
                this.formattedDate = "10-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "November":
                this.formattedDate = "11-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
            case "December":
                this.formattedDate = "12-" + fileFormatDate[1] + "-" + fileFormatDate[2];
                break;
        }

        return this.formattedDate;
    }
}
