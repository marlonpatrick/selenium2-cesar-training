package br.org.cesar.test;

import org.junit.*;

import br.org.cesar.common.HomePage;


/**
 * Classe de testes com cen�rios relacionados a p�gina inicial
 */
public class HomePageValidation extends BaseTestcase{

	@Before
	public void before() throws Exception {  
	}



	/**
	 * Objetivo: Abrir a home screen e verificar o titulo
	 * 
	 * Passos: Navegar para a home screen e verificar o titulo
	 * 
	 * Resultado Esperado: Titulo da home screen est� correto
	 */
	@Test
	public void assertHomeScreenTitle() {
			HomePage.clickHomeMenuItem();
			HomePage.isTitleCorrect("Classe de Testes | Testes e Qualidade de Software");
	}

	
	/**
	 * Objetivo: Navegar para a pagina Curso Selenium e verificar o titulo exibido
	 * 
	 * Passos: Navegar para a pagina Curso Selenium, em seguida verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da p�gina est� correto
	 */
	@Test
	public void navigateToCursoSeleniumPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Curso Selenium");
		HomePage.isHeaderTitleCorrect("Curso Selenium");
	}
	
	
	/**
	 * Objetivo: Navegar para a pagina Formulario Simples e verificar o titulo
	 * 
	 * Passos: Navegar para a pagina Formulario Simples e verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da p�gina est� correto
	 */
	@Test
	public void navigateToFormularioSimplesPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
		HomePage.isHeaderTitleCorrect("Formulário Simples");
	}
	
	
	/**
	 * Objetivo: P�gina de resultados da busca � exibida corretamente
	 * 
	 * Passos: Realiza busca com texto fixo e verifica o t�tulo da p�gina de resultados
	 * 
	 * Resultado Esperado: T�tulo da p�gina de resultados est� correto
	 */
	@Test
	public void performSimpleSearch() {
		HomePage.showHiddenOptions();
		HomePage.performSearch("teste");
		HomePage.clickSearchButton();
		HomePage.isSearchResultCorrect("Resultados da pesquisa por: teste");
	}

	
	@After
	public void after() throws Exception {
	}
}
