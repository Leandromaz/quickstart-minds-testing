package automacao.paginas;

import automacao.core.Core;
import org.openqa.selenium.By;


public class Tshirt extends Core {


    public By getMenuTshirt() {
        return getByLinkText("T-SHIRTS");
    }

    public By getImagemProduto() {
        return getByClassName("product_img_link");

    }

    public By getBotaoAddCarrinho() {
        return getById("add_to_cart");

    }



}


