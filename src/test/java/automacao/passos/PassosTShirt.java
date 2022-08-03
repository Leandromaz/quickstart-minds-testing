package automacao.passos;

import automacao.core.Core;
import automacao.paginas.Tshirt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class PassosTShirt extends Core {

    private Tshirt paginatshirt;

    public PassosTShirt(){
        paginatshirt = new Tshirt();
        PageFactory.initElements(driver, this.paginatshirt);

    }

    @Given("clica no menu T-Shirt")
    public void clica_no_menu_t_shirt() {
        clicar(paginatshirt.getMenuTshirt());

    }
    @When("clicar em Quick view do produto")
    public void clicar_em_quick_view_do_produto() {
        clicar(paginatshirt.getImagemProduto());

    }
    @Then("a modal contendo o produto descrito deveria aparecer")
    public void a_modal_contendo_o_produto_descrito_deveria_aparecer() {
        validarCampoGetText(paginatshirt.getBotaoAddCarrinho(),"Add to cart");
    }


}
