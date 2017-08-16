package com.intersection;

import java.util.Date;

public class Period {

    private Date startDate;
    private Date finishDate;

    public Period() {
    }

    public Period(Date startDate, Date finishDate) {
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Period period = (Period) o;

        if (startDate != null ? !startDate.equals(period.startDate) : period.startDate != null) return false;
        return finishDate != null ? finishDate.equals(period.finishDate) : period.finishDate == null;

    }

    @Override
    public int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Period{" +
                "startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }
}
