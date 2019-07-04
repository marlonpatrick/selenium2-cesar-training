package br.org.cesar.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.org.cesar.test.Demo2Validation;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
		Demo2Validation.class,
	})
public class AllTests {

}
