package JOBSHEET_10.HeterogenousCollection;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public String getPrintableContent() {
        String temp = "URL: " + url;
        temp += "\nTitle: " + title;
        temp = content.replaceAll("<[^>]*>", "");
        return temp;
    }
}