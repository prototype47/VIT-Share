package com.example.advit.submissions;

public class tasksData {

    private String pdfName, pdfTitle;

    public tasksData() {
    }

    public tasksData(String pdfName, String pdfTitle) {
        this.pdfName = pdfName;
        this.pdfTitle = pdfTitle;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public String getPdfTitle() {
        return pdfTitle;
    }

    public void setPdfTitle(String pdfTitle) {
        this.pdfTitle = pdfTitle;
    }
}
