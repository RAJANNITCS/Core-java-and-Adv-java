// WAP to demostrating write a perfectly immutable class using the old java.util.Date.

import java.util.Date;

// Rule 1: Make the class final so it cannot be inherited
public final class MyImmutableReport {

    // Rule 2: Make fields private and final
    private final String reportName;
    private final Date publishDate;

    public MyImmutableReport(String reportName, Date publishDate) {
        this.reportName = reportName;
        
        // Rule 3: Defensive Copy in Constructor
        // Instead of this.publishDate = publishDate, we create a NEW object
        if (publishDate != null) {
            this.publishDate = new Date(publishDate.getTime());
        } else {
            this.publishDate = null;
        }
    }

    public String getReportName() {
        return reportName;
    }

    // Rule 4: Defensive Copy in Getter
    public Date getPublishDate() {
        // DO NOT return this.publishDate;
        // Return a brand new object with the same value
        if (this.publishDate != null) {
            return new Date(this.publishDate.getTime());
        }
        return null;
    }

    // Rule 5: No setters!
}