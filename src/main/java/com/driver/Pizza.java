package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private Boolean addExtraCheese = false;
    private Boolean addExtraToppings = false;
    private Boolean addTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
    		this.price += 300;
    		this.bill += "Base Price Of The Pizza: 300\n" ;
    	} else {
    		this.price += 400;
    		this.bill += "Base Price Of The Pizza: 300\n";
    	}
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	if(this.addExtraCheese) {
    		return;
    	}
    	this.addExtraCheese = true;
    	this.price += 80;
    	
    }

    public void addExtraToppings(){
        // your code goes here
    	if(this.addExtraToppings) {
    		return;
    	}
    	this.addExtraToppings = true;
    	this.price += 70;
    }

    public void addTakeaway(){
    	if(this.addTakeAway) {
    		return;
    	}
        this.addTakeAway = true;
        this.price += 20;
    }

    public String getBill(){
        // your code goes here
    	if(this.addExtraCheese) {
    		this.bill += "Extra Cheese Added: 80\n";
    	}
    	if(this.addExtraToppings) {
    		if(isVeg) {
    			this.bill += "Extra Toppings Added: 70\n";
    		}else {
    			this.bill += "Extra Toppings Added: 120\n";
    		}
    		
    	}
    	if(this.addTakeAway) {
    		this.bill += "Paperbag Added: 20\n";
    	}
    	
    	this.bill += "Total Price: " + this.price + "\n";
    	
        return this.bill;
    }

}
