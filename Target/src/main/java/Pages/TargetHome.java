package Pages;
import Utility.Clicking;

public class TargetHome extends Clicking{
    //various locator variables
    private String categoriesButtonLocator, groceryButtonLocator, moreCategoriesButtonLocator, brunchButtonLocator;

    //getter setter methods for each
    public String getCategoriesButtonLocator(){return categoriesButtonLocator;}
    public void setCategoriesButtonLocator(String categoriesButtonLocator){
        this.categoriesButtonLocator=categoriesButtonLocator;
    }

    public String getGroceryButtonLocator() {return groceryButtonLocator;}

    public void setGroceryButtonLocator(String groceryButtonLocator) {
        this.groceryButtonLocator = groceryButtonLocator;
    }

    public String getMoreCategoriesButtonLocator() {return moreCategoriesButtonLocator;}
    public void setMoreCategoriesButtonLocator(String moreCategoriesButtonLocator) {
        this.moreCategoriesButtonLocator = moreCategoriesButtonLocator;}

    public String getBrunchButtonLocator(){return brunchButtonLocator;}
    public void setBrunchButtonLocator(String brunchButtonLocator){
        this.brunchButtonLocator=brunchButtonLocator;
    }

    public void clickCategories(){
        setCategoriesButtonLocator("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div/nav/div[2]/a");
        ButtonClicker(getCategoriesButtonLocator());
    }

    public void clickGrocery(){
        setGroceryButtonLocator("Grocery");
        ButtonClicker(getGroceryButtonLocator());
    }
    public void clickMoreCategories(){
        setMoreCategoriesButtonLocator("//span[text()='Show 11 more categories']");
        ButtonClicker(getMoreCategoriesButtonLocator());
    }
    public void clickBrunchIdeas(){
        setBrunchButtonLocator("Brunch Ideas");
        ButtonClicker(getBrunchButtonLocator());
    }

    //Runs all the click methods in order
    public void targetClicks() throws Exception{
        clickCategories();
        Thread.sleep(2000);
        clickGrocery();
        Thread.sleep(2000);
        clickMoreCategories();
        Thread.sleep(2000);
        clickBrunchIdeas();

        
    }

}
