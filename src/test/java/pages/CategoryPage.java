package pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement aboutUs1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
    @CacheLookup
    private WebElement aboutUs2;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=1&token=790819b07b588bf658c8dbb20bffe13e']")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=2&token=790819b07b588bf658c8dbb20bffe13e']")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare2;

    @FindBy(css = "a.addToWishlist.wishlistProd_1")
    @CacheLookup
    private WebElement addToWishlist1;

    @FindBy(css = "a.addToWishlist.wishlistProd_2")
    @CacheLookup
    private WebElement addToWishlist2;

    @FindBy(css = "a[title='All specials']")
    @CacheLookup
    private WebElement allSpecials;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(id = "layered_id_attribute_group_11")
    @CacheLookup
    private WebElement black11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#color-black']")
    @CacheLookup
    private WebElement black12;

    @FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li:nth-of-type(1) div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement blouse1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement blouse2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(id = "layered_category_7")
    @CacheLookup
    private WebElement blouses11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#categories-blouses']")
    @CacheLookup
    private WebElement blouses12;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) a")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "#subcategories ul.clearfix li:nth-of-type(2) h5 a.subcategory-name")
    @CacheLookup
    private WebElement blouses3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement blouses4;

    @FindBy(id = "layered_id_attribute_group_14")
    @CacheLookup
    private WebElement blue11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#color-blue']")
    @CacheLookup
    private WebElement blue12;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart0ProductProductsEmpty;

    @FindBy(id = "layered_id_feature_11")
    @CacheLookup
    private WebElement casual21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#styles-casual']")
    @CacheLookup
    private WebElement casual22;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(css = "#center_column div:nth-of-type(3) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
    @CacheLookup
    private WebElement compare01;

    @FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare_bottom")
    @CacheLookup
    private WebElement compare02;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(id = "layered_id_feature_5")
    @CacheLookup
    private WebElement cotton21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#compositions-cotton']")
    @CacheLookup
    private WebElement cotton22;

    @FindBy(css = "a[title='Delivery']")
    @CacheLookup
    private WebElement delivery;

    @FindBy(css = "#stores_block_left div.block_content.blockstore div a.btn.btn-default.button.button-small")
    @CacheLookup
    private WebElement discoverOurStores;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "a._blank")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop;

    @FindBy(id = "newsletter-input")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop2014;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses2;

    @FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "#viewed-products_block_left div.block_content.products-block ul li:nth-of-type(2) div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeve;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts;

    @FindBy(id = "layered_manufacturer_1")
    @CacheLookup
    private WebElement fashionManufacturer21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#manufacturer-fashion_manufacturer']")
    @CacheLookup
    private WebElement fashionManufacturer22;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a[title='Grid']")
    @CacheLookup
    private WebElement grid;

    @FindBy(id = "layered_quantity_1")
    @CacheLookup
    private WebElement inStock21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#availability-in_stock']")
    @CacheLookup
    private WebElement inStock22;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
    @CacheLookup
    private WebElement information;

    @FindBy(id = "layered_id_attribute_group_3")
    @CacheLookup
    private WebElement l21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#size-l']")
    @CacheLookup
    private WebElement l22;

    @FindBy(css = "a[title='Legal Notice']")
    @CacheLookup
    private WebElement legalNotice;

    @FindBy(css = "a[title='List']")
    @CacheLookup
    private WebElement list;

    @FindBy(id = "layered_id_attribute_group_2")
    @CacheLookup
    private WebElement m21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#size-m']")
    @CacheLookup
    private WebElement m22;

    @FindBy(css = "a.account")
    @CacheLookup
    private WebElement marijaEngel;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more2;

    @FindBy(css = "a[title='Manage my customer account']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[title='My addresses']")
    @CacheLookup
    private WebElement myAddresses;

    @FindBy(css = "a[title='My credit slips']")
    @CacheLookup
    private WebElement myCreditSlips;

    @FindBy(css = "a[title='My orders']")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[title='Manage my personal information']")
    @CacheLookup
    private WebElement myPersonalInfo;

    @FindBy(id = "layered_condition_new")
    @CacheLookup
    private WebElement new21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#condition-new']")
    @CacheLookup
    private WebElement new22;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "layered_id_attribute_group_13")
    @CacheLookup
    private WebElement orange11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#color-orange']")
    @CacheLookup
    private WebElement orange12;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement ourStores1;

    @FindBy(css = "#stores_block_left p.title_block a")
    @CacheLookup
    private WebElement ourStores2;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ourStores3;

    private final String pageLoadedText = "Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more";

    private final String pageUrl = "/index.php?id_category=4&controller=category";

    @FindBy(css = "a[title='Printed Chiffon Dress']")
    @CacheLookup
    private WebElement printedChiffonDress;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView2;

    @FindBy(id = "layered_id_attribute_group_1")
    @CacheLookup
    private WebElement s21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#size-s']")
    @CacheLookup
    private WebElement s22;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[title='Secure payment']")
    @CacheLookup
    private WebElement securePayment;

    @FindBy(id = "layered_id_feature_17")
    @CacheLookup
    private WebElement shortSleeve21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#properties-short_sleeve']")
    @CacheLookup
    private WebElement shortSleeve22;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "selectProductSort")
    @CacheLookup
    private WebElement sortBy;

    @FindBy(css = "#special_block_right p.title_block a")
    @CacheLookup
    private WebElement specials1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(1) a")
    @CacheLookup
    private WebElement specials2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse2;

    @FindBy(css = "a[title='Tops']")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(id = "layered_category_5")
    @CacheLookup
    private WebElement tshirts11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#categories-t_shirts']")
    @CacheLookup
    private WebElement tshirts12;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "#subcategories ul.clearfix li:nth-of-type(1) h5 a.subcategory-name")
    @CacheLookup
    private WebElement tshirts4;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts5;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(id = "layered_id_attribute_group_8")
    @CacheLookup
    private WebElement white11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=4&controller=category#color-white']")
    @CacheLookup
    private WebElement white12;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women3;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;
	private WebElement fashionManufacturer2;
	private WebElement inStock2;
	private WebElement l2;
	private WebElement m2;
	private WebElement new2;
	private WebElement s2;
	private WebElement shortSleeve2;
	private WebElement casual2;
	private WebElement cotton2;

    public CategoryPage() {
    }

    public CategoryPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public CategoryPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CategoryPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToCart1Link() {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToCart2Link() {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToCompare1Link() {
        addToCompare1.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToCompare2Link() {
        addToCompare2.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToWishlist1Link() {
        addToWishlist1.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAddToWishlist2Link() {
        addToWishlist2.click();
        return this;
    }

    /**
     * Click on All Specials Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickAllSpecialsLink() {
        allSpecials.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Black 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlack11Link() {
        black11.click();
        return this;
    }

    /**
     * Click on Black 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlack12Link() {
        black12.click();
        return this;
    }

    /**
     * Click on Blouse Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouse1Link() {
        blouse1.click();
        return this;
    }

    /**
     * Click on Blouse Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouse2Link() {
        blouse2.click();
        return this;
    }

    /**
     * Click on Blouses 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses11Link() {
        if (!blouses11.isSelected()) {
            blouses11.click();
        }
        return this;
    }

    /**
     * Click on Blouses 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses12Link() {
        blouses12.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses3Link() {
        blouses3.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlouses4Link() {
        blouses4.click();
        return this;
    }

    /**
     * Click on Blue 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlue11Link() {
        blue11.click();
        return this;
    }

    /**
     * Click on Blue 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickBlue12Link() {
        blue12.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCasual21Link() {
        if (!casual21.isSelected()) {
            casual21.click();
        }
        return this;
    }

    /**
     * Click on Casual 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCasual22Link() {
        casual22.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCompare01Button() {
        compare01.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCompare02Button() {
        compare02.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Cotton 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCotton21Link() {
        if (!cotton21.isSelected()) {
            cotton21.click();
        }
        return this;
    }

    /**
     * Click on Cotton 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickCotton22Link() {
        cotton22.click();
        return this;
    }

    /**
     * Click on Delivery Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickDeliveryLink() {
        delivery.click();
        return this;
    }

    /**
     * Click on Discover Our Stores Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickDiscoverOurStoresLink() {
        discoverOurStores.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve... Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickFadedShortSleeveLink() {
        fadedShortSleeve.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickFadedShortSleeveTshirtsLink() {
        fadedShortSleeveTshirts.click();
        return this;
    }

    /**
     * Click on Fashion Manufacturer 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickFashionManufacturer21Link() {
        if (!fashionManufacturer21.isSelected()) {
            fashionManufacturer21.click();
        }
        return this;
    }

    /**
     * Click on Fashion Manufacturer 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickFashionManufacturer22Link() {
        fashionManufacturer22.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Grid Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickGridLink() {
        grid.click();
        return this;
    }

    /**
     * Click on In Stock 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickInStock21Link() {
        if (!inStock21.isSelected()) {
            inStock21.click();
        }
        return this;
    }

    /**
     * Click on In Stock 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickInStock22Link() {
        inStock22.click();
        return this;
    }

    /**
     * Click on Information Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickInformationLink() {
        information.click();
        return this;
    }

    /**
     * Click on L 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickL21Link() {
        if (!l21.isSelected()) {
            l21.click();
        }
        return this;
    }

    /**
     * Click on L 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickL22Link() {
        l22.click();
        return this;
    }

    /**
     * Click on Legal Notice Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickLegalNoticeLink() {
        legalNotice.click();
        return this;
    }

    /**
     * Click on List Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickListLink() {
        list.click();
        return this;
    }

    /**
     * Click on M 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickM21Link() {
        if (!m21.isSelected()) {
            m21.click();
        }
        return this;
    }

    /**
     * Click on M 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickM22Link() {
        m22.click();
        return this;
    }

    /**
     * Click on Marija Engel Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMarijaEngelLink() {
        marijaEngel.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMore1Link() {
        more1.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMore2Link() {
        more2.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickNew21Link() {
        if (!new21.isSelected()) {
            new21.click();
        }
        return this;
    }

    /**
     * Click on New 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickNew22Link() {
        new22.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Orange 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOrange11Link() {
        orange11.click();
        return this;
    }

    /**
     * Click on Orange 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOrange12Link() {
        orange12.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOurStores1Link() {
        ourStores1.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOurStores2Link() {
        ourStores2.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickOurStores3Link() {
        ourStores3.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickPrintedChiffonDressLink() {
        printedChiffonDress.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickQuickView1Link() {
        quickView1.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickQuickView2Link() {
        quickView2.click();
        return this;
    }

    /**
     * Click on S 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickS21Link() {
        if (!s21.isSelected()) {
            s21.click();
        }
        return this;
    }

    /**
     * Click on S 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickS22Link() {
        s22.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Secure Payment Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSecurePaymentLink() {
        securePayment.click();
        return this;
    }

    /**
     * Click on Short Sleeve 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickShortSleeve21Link() {
        if (!shortSleeve21.isSelected()) {
            shortSleeve21.click();
        }
        return this;
    }

    /**
     * Click on Short Sleeve 2 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickShortSleeve22Link() {
        shortSleeve22.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSpecials1Link() {
        specials1.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSpecials2Link() {
        specials2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTermsAndConditionsOfUse1Link() {
        termsAndConditionsOfUse1.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTermsAndConditionsOfUse2Link() {
        termsAndConditionsOfUse2.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts11Link() {
        if (!tshirts11.isSelected()) {
            tshirts11.click();
        }
        return this;
    }

    /**
     * Click on Tshirts 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts12Link() {
        tshirts12.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts4Link() {
        tshirts4.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTshirts5Link() {
        tshirts5.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on White 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickWhite11Link() {
        white11.click();
        return this;
    }

    /**
     * Click on White 1 Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickWhite12Link() {
        white12.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickWomen3Link() {
        women3.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        clickTshirts11Link();
        clickBlouses11Link();
        clickS21Link();
        clickM21Link();
        clickL21Link();
        clickCotton21Link();
        clickCasual21Link();
        clickShortSleeve21Link();
        clickInStock21Link();
        clickFashionManufacturer21Link();
        clickNew21Link();
        setSortByDropDownListField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Set default value to Sort By Drop Down List field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setSortByDropDownListField() {
        return setSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Set value to Sort By Drop Down List field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage setSortByDropDownListField(String sortByValue) {
        new Select(sortBy).selectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Unset Blouses 1 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetBlouses1CheckboxField() {
        if (blouses1.isSelected()) {
            blouses1.click();
        }
        return this;
    }

    /**
     * Unset Casual 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetCasual2CheckboxField() {
        casual2 = null;
		if (casual2.isSelected()) {
            casual2.click();
        }
        return this;
    }

    /**
     * Unset Cotton 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetCotton2CheckboxField() {
        cotton2 = null;
		if (cotton2.isSelected()) {
            cotton2.click();
        }
        return this;
    }

    /**
     * Unset Fashion Manufacturer 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetFashionManufacturer2CheckboxField() {
        fashionManufacturer2 = null;
		if (fashionManufacturer2.isSelected()) {
            fashionManufacturer2.click();
        }
        return this;
    }

    /**
     * Unset In Stock 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetInStock2CheckboxField() {
        inStock2 = null;
		if (inStock2.isSelected()) {
            inStock2.click();
        }
        return this;
    }

    /**
     * Unset L 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetL2CheckboxField() {
        l2 = null;
		if (l2.isSelected()) {
            l2.click();
        }
        return this;
    }

    /**
     * Unset M 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetM2CheckboxField() {
        m2 = null;
		if (m2.isSelected()) {
            m2.click();
        }
        return this;
    }

    /**
     * Unset New 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetNew2CheckboxField() {
        new2 = null;
		if (new2.isSelected()) {
            new2.click();
        }
        return this;
    }

    /**
     * Unset S 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetS2CheckboxField() {
        s2 = null;
		if (s2.isSelected()) {
            s2.click();
        }
        return this;
    }

    /**
     * Unset Short Sleeve 2 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetShortSleeve2CheckboxField() {
        shortSleeve2 = null;
		if (shortSleeve2.isSelected()) {
            shortSleeve2.click();
        }
        return this;
    }

    /**
     * Unset default value from Sort By Drop Down List field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetSortByDropDownListField() {
        return unsetSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Unset value from Sort By Drop Down List field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetSortByDropDownListField(String sortByValue) {
        new Select(sortBy).deselectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Unset Tshirts 1 Checkbox field.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage unsetTshirts1CheckboxField() {
        if (tshirts1.isSelected()) {
            tshirts1.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the CategoryPage class instance.
     */
    public CategoryPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
