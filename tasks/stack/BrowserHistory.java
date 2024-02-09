package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    public String currentUrl;
    Deque<String> backwardHistory = new ArrayDeque<>();
    Deque<String> forwardHistory = new ArrayDeque<>();

    BrowserHistory(String homepage) {
        this.currentUrl = homepage;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void visit(String url) {
        backwardHistory.push(currentUrl);
        this.currentUrl = url;
        forwardHistory.clear();
    }

    public String backward(int steps) {
        if (steps > backwardHistory.size()) {
            steps = 1;
        }

        int count = 0;
        while (count < steps) {
            if (!backwardHistory.isEmpty()) {
                forwardHistory.push(currentUrl);
                currentUrl = backwardHistory.pop();
                count++;
            }
        }
        return currentUrl;
    }

    public String forward(int steps) {
        if (steps > forwardHistory.size()) {
            return currentUrl;
        }

        int count = 0;
        while (count < steps) {
            if (!forwardHistory.isEmpty()) {
                backwardHistory.push(currentUrl);
                currentUrl = forwardHistory.pop();
                count++;
            }
        }
        return currentUrl;
    }


    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory("leetcode");

        browser.visit("google");
        browser.visit("facebook");
        browser.visit("youtube");

        System.out.println(browser.backward(1)); // facebook
        System.out.println(browser.backward(1)); // google
        System.out.println(browser.forward(1));  // facebook

        browser.visit("linkedin");

        System.out.println(browser.forward(2));  // linkedin

        System.out.println(browser.backward(2));  // google
        System.out.println(browser.backward(7));  // leetcode

        browser.visit("ticketing-app"); // clears forward stack
        System.out.println("Current url: " + browser.getCurrentUrl());

        System.out.println("Backward stack: " + browser.backwardHistory);
        System.out.println("Forward stack: " + browser.forwardHistory);


    }
}












