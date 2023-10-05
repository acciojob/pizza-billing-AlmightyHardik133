package com.driver;

public class Pizza {

    private int totalPrice;
    private int extraCheesePrice;
    private int extraToopingsPrice;
    private int takeAwayPrice;
    private int basePrice;
    
    private Boolean isVeg;
    
    private String bill = "";
    
    private Boolean isBillGene = false;
    private Boolean addExtraCheese = false;
    private Boolean addExtraToppings = false;
    private Boolean addTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;
        
        if(isVeg) {
        	this.basePrice = 300;
        	this.extraToopingsPrice = 70;
        } else {
        	this.basePrice = 400;
        	this.extraToopingsPrice = 120;
        }
        this.totalPrice += this.basePrice;
        this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
       if(!addExtraCheese) {
    	   addExtraCheese = true;
    	   this.totalPrice += this.extraCheesePrice;
       }
    	
    }

    public void addExtraToppings(){
        // your code goes here
    	if(!addExtraToppings) {
    		addExtraToppings = true;
    		this.totalPrice += this.extraToopingsPrice;
    	}
    	
    }

    public void addTakeaway(){
    	if(!addTakeAway) {
    		addTakeAway = true;
    		this.totalPrice += this.takeAwayPrice;
    	}
    }

    public String getBill(){
        // your code goes here
    	if(!isBillGene) {
    		if(addExtraCheese) {
    			this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
    		}
    		if(addExtraToppings) {
    			this.bill = this.bill + "Extra Toppings Added: " + this.extraToopingsPrice + "\n";
    		}
    		if(addTakeAway) {
    			this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
    		}
    		
    		this.bill = this.bill + "Total Price: " + this.totalPrice + "\n";
    	}
    	return this.bill;
    }

}
