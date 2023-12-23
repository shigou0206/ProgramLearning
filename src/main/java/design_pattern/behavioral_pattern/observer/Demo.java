package design_pattern.behavioral_pattern.observer;

import design_pattern.behavioral_pattern.observer.editor.Editor;
import design_pattern.behavioral_pattern.observer.listeners.EmailNotificationListener;
import design_pattern.behavioral_pattern.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
