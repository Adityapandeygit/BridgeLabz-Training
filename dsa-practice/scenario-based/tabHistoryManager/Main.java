package dsa_practice.scenario_based.tabHistoryManager;

public class Main {
	public static void main(String[] args) {
		BrowserBuddy browser = new BrowserBuddy();

        browser.visitPage("google.com");
        browser.visitPage("github.com");
        browser.visitPage("stackoverflow.com");
        browser.back();
        browser.back();
        browser.forward();

        browser.closedTab();
        browser.restoreTab();
	}
}
