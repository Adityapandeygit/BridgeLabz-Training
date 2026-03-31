package dsa_practice.scenario_based.tabHistoryManager;

import java.util.Stack;

public class BrowserBuddy {
	 BrowserTab tab = new BrowserTab();
     Stack<String> closedTabs = new Stack<>();
     public void visitPage(String url) {
    	 tab.visit(url);
     }
     public void back() {
    	 tab.back();
     }
     public void forward() {
         tab.forward();
     }
     
     public void closedTab() {
    	 String page = tab.getCurrentPage();
    	 if(page!=null) {
    		 closedTabs.push(page);
    		 tab = new BrowserTab(); 
             System.out.println("Closed tab: " + page);
    	 }
     }
     public void restoreTab() {
    	 if(!closedTabs.isEmpty()) {
    		 String page = closedTabs.pop();
    		 System.out.println("Restored tab: " + page);
    		 tab.visit(page);
    	 }
    	 else {
    		 System.out.println("No tab to restore");
    	 }
     }
}
