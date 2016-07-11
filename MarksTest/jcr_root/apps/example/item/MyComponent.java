package apps.example.item;

import java.util.Date;

//simple use of java and sightly (into marks.html)
//java class stored with the script 
//package name should be the same as the jcr path 
public class MyComponent {
    public String getDate() {
        return new Date().toString();
    }
}